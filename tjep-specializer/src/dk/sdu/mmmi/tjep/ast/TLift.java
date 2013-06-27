package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.Env;


public class TLift extends TExp {
	TExp exp;

	public TLift(TExp exp) {
		super();
		this.exp = exp;
	}

	@Override
	public TExp eval(Env env) {
		TExp exp1 = exp.eval(env);
		if(exp1 instanceof NumericValue)
			return new TConstant(exp1);
		else if(exp1 instanceof Value)
			throw new Error("Non-liftable value: "+exp1);
		else
			return exp1;
	}

	@Override
	public String toString() {
		return "/*lift:*/"+exp.toString();
	}
	
}
