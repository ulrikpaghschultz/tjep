package dk.sdu.mmmi.tjep.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TWhile extends TStatement {

	BT bt;
	TExp cond;
	TStatement[] body;
	
	public TWhile(BT bt, TExp cond, TStatement[] body) {
		super();
		this.bt = bt;
		this.cond = cond;
		this.body = body;
	}

	@Override
	public TStatement[] eval(Env env) {
		if(bt==BT.S)
			return evalStaticWhile(env);
		else
			return evalDynamicValue(env);
	}

	private TStatement[] evalDynamicValue(Env env) {
		env.spec().pushSpeculativeEvaluation();
		TExp cond1 = cond.eval(env);
		TStatement.EvalResult result = TStatement.evalBlock(env, body);
		env.spec().popSpeculativeEvaluation();
		if(result.returnMaybe!=null) throw new Error("static return under dynamic control");
		return new TStatement[] { new TWhile(BT.Top,cond1,result.body) };
	}

	private TStatement[] evalStaticWhile(Env env) {
		List<TStatement> residual = new ArrayList<TStatement>();
		Set<String> declaredLocals = new HashSet<String>();
		while(evalCondition(env)) {
			TStatement.EvalResult result = TStatement.evalBlock(env, body);
			if(result.returnMaybe!=null) throw new Error("static return before method end not supported");
			for(int i=0; i<result.body.length; i++) {
				if(checkNotAnOverlappingLocalDecl(declaredLocals,result.body[i]))
					residual.add(result.body[i]);
			}
		}
		return residual.toArray(new TStatement[0]);
	}

	private boolean evalCondition(Env env) {
		TExp cond1 = cond.eval(env);
		if(!(cond1 instanceof Value)) throw new Error("dynamic condition for static while");
		if(!(cond1 instanceof NumericValue)) throw new Error("illegal type for while condiition");
		return ((NumericValue)cond1).value!=0;
	}

	private boolean checkNotAnOverlappingLocalDecl(Set<String> locals, TStatement statement) {
		if(!(statement instanceof TVarDecl)) return true;
		TVarDecl decl = (TVarDecl)statement;
		if(locals.contains(decl.name)) return false;
		locals.add(decl.name);
		return true;
	}

	@Override
	public String toString() {
		return "TWhile [bt=" + bt + ", cond=" + cond + ", body="
				+ Arrays.toString(body) + "]";
	}
	
	@Override
	public boolean isCompound() {
		return true;
	}

	@Override
	public List<TStatement> getCompundParts() {
		return Arrays.asList(body);
	}

	@Override
	public TExp getExpressionPartMaybe() {
		return cond;
	}

	// Auto-generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(body);
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result + ((cond == null) ? 0 : cond.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TWhile other = (TWhile) obj;
		if (!Arrays.equals(body, other.body))
			return false;
		if (bt == null) {
			if (other.bt != null)
				return false;
		} else if (!bt.equals(other.bt))
			return false;
		if (cond == null) {
			if (other.cond != null)
				return false;
		} else if (!cond.equals(other.cond))
			return false;
		return true;
	}

}
