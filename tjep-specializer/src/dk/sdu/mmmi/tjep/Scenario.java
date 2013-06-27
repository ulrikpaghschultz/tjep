package dk.sdu.mmmi.tjep;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import dk.sdu.mmmi.tjep.ast.Program;
import dk.sdu.mmmi.tjep.ast.TBinOp;
import dk.sdu.mmmi.tjep.ast.TExp;
import dk.sdu.mmmi.tjep.ast.TStatement;
import dk.sdu.mmmi.tjep.ast.TStatement.EvalResult;

public abstract class Scenario {

	private boolean specialized = false;
	private Program specializedProgram;
	private TStatement[] specializedScenario;
	
	public void specialize() {
		Program program = getProgram();
		TStatement[] scenario = getScenario();
		Env env = new Env(program);
		EvalResult result = TStatement.evalBlock(env, scenario);
		specializedScenario = result.body;
		env.spec().finishWorkQueue();
		specializedProgram = env.spec().getProgram();
		specialized = true;
	}

	public String getSpecializedProgram() {
		if(!specialized) specialize();
		return specializedProgram.toString();
	}

	public String getSpecializedScenario() {
		if(!specialized) specialize();
		StringBuffer result = new StringBuffer();
		for(int i=0; i<specializedScenario.length; i++)
			result.append(specializedScenario[i].toString()+'\n');
		return result.toString();
	}
	
	public String checkAssertion(boolean verbose) {
		TStatement[] ass = getAssertion();
		if(ass==null) return "No assertion";
		if(!specialized) specialize();
		for(int i=0; i<ass.length; i++) {
			if(i>=specializedScenario.length)
				return "Specialized scenario shorter, at statement: "+ass[i];
			if(!ass[i].equals(specializedScenario[i])) {
				StringBuffer reason = new StringBuffer();
				reason.append("Mismatch,\n  assertion  : <<"+ass[i]+">>,\n  specialized: <<"+specializedScenario[i]+">>\n");
				if(ass[i].isCompound() && specializedScenario[i].isCompound()) {
					return testCompoundStatement(ass, i, reason);
				}
				return reason.toString();
			} else if(verbose)
				System.out.println("Equals: "+ass[i]+" and "+specializedScenario[i]);
		}
		return null;
	}

	private String testCompoundStatement(TStatement[] ass, int i,
			StringBuffer reason) {
		// Test expression, if any
		TExp asse = ass[i].getExpressionPartMaybe();
		TExp spee = specializedScenario[i].getExpressionPartMaybe();
		if(asse==null || spee==null && asse!=spee) {
			reason.append("  (different statements");
			return reason.toString();
		}
		if(asse!=null && !asse.equals(spee)) {
			reason.append("  (expressions differ)");
			return reason.toString();
		}
		// Test compound
		List<TStatement> assl = ass[i].getCompundParts();
		Iterator<TStatement> spel = specializedScenario[i].getCompundParts().iterator();
		for(TStatement s1: assl) {
			if(!spel.hasNext()) {
				reason.append("  missing specialized counterpart for: "+s1);
				return reason.toString();
			}
			TStatement s2 = spel.next();
			if(!s1.equals(s2)) {
				reason.append("  mismatch between assertion <<"+s1+">> and <<"+s2+">>");
				return reason.toString();
			}
		}
		if(!spel.hasNext()) {
			reason.append("  (no difference in compound body)");
			return reason.toString();
		}
		reason.append("  missing assertion counterpart for: "+spel.next());
		return reason.toString();
	}
	
	public abstract Program getProgram();
	
	public abstract TStatement[] getScenario(); 
	
	public TStatement[] getAssertion() {
		return null;
	}
}
