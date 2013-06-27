package dk.sdu.mmmi.tjep.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import dk.sdu.mmmi.tjep.Env;

public abstract class TStatement {

	public static class EvalResult {
		public TStatement[] body;
		public Value returnMaybe;
	}

	public static EvalResult evalBlock(Env env, TStatement[] body) {
		List<TStatement> residual = new ArrayList<TStatement>();
		for(int i=0; i<body.length; i++) {
			TStatement[] res = body[i].eval(env);
			if(res.length>0) 
				for(int j=0; j<res.length; j++) {
					residual.add(res[j]);
				}
		}
		EvalResult result = new EvalResult();
		result.body = residual.toArray(new TStatement[0]);
		result.returnMaybe = env.local().getReturnValueMaybe();
		return result;
	}

	public abstract TStatement[] eval(Env env);

	public boolean isCompound() {
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public List<TStatement> getCompundParts() {
		return Collections.EMPTY_LIST;
	}

	public TExp getExpressionPartMaybe() {
		return null;
	}

}
