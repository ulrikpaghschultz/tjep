package dk.sdu.mmmi.tjep.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TConditional extends TStatement {

	BT bt;
	TExp cond;
	TStatement[] thenBody;
	TStatement[] elseBody;

	public TConditional(BT bt, TExp cond, TStatement[] thenBody, TStatement[] elseBody) {
		this.bt = bt;
		this.cond = cond;
		this.thenBody = thenBody;
		this.elseBody = elseBody;
	}

	@Override
	public TStatement[] eval(Env env) {
		TExp cond1 = cond.eval(env);
		if(bt==BT.S) { // reduce, evaluating appropriate branch
			if(!(cond1 instanceof Value))
				throw new Error("Static if with dynamic conditional");
			if(!(cond1 instanceof NumericValue))
				throw new Error("Conditional with non-numerical test");
			int test = ((NumericValue)cond1).value;
			EvalResult result;
			if(test!=0)
				result = TStatement.evalBlock(env, thenBody);
			else
				result = TStatement.evalBlock(env, elseBody);
			if(result.returnMaybe!=null)
				throw new Error("Return value from conditional branch not supported");
			return result.body;
		} else { // residualize, evaluating each branch speculatively
			env.spec().pushSpeculativeEvaluation();
			EvalResult thenResult = TStatement.evalBlock(env, thenBody);
			env.spec().restoreSpeculativeEvaluationEnv();
			EvalResult elseResult = TStatement.evalBlock(env, elseBody);
			env.spec().popSpeculativeEvaluation();
			if(thenResult.returnMaybe!=null || elseResult.returnMaybe!=null)
				throw new Error("Static return under dynamic control");
			return new TStatement[] { new TConditional(BT.Top,cond1.residualize(),thenResult.body,elseResult.body) };
		}
	}
	
	@Override
	public boolean isCompound() {
		return true;
	}
	
	@Override
	public List<TStatement> getCompundParts() {
		List<TStatement> both = new ArrayList<TStatement>();
		for(int i=0; i<thenBody.length; i++) both.add(thenBody[i]);
		for(int i=0; i<elseBody.length; i++) both.add(elseBody[i]);
		return both;
	}

	@Override
	public TExp getExpressionPartMaybe() {
		return cond;
	}

	// Automatically generated
	
	@Override
	public String toString() {
		return "if/*"+bt+"*/( " + cond + " ) {\n"
				+ Arrays.toString(thenBody) + " } else {"
				+ Arrays.toString(elseBody) + "\n}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result + ((cond == null) ? 0 : cond.hashCode());
		result = prime * result + Arrays.hashCode(elseBody);
		result = prime * result + Arrays.hashCode(thenBody);
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
		TConditional other = (TConditional) obj;
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
		if (!Arrays.equals(elseBody, other.elseBody))
			return false;
		if (!Arrays.equals(thenBody, other.thenBody))
			return false;
		return true;
	}

}
