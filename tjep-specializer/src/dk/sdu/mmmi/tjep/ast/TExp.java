package dk.sdu.mmmi.tjep.ast;

import java.util.ArrayList;
import java.util.List;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public abstract class TExp {
	public abstract TExp eval(Env env);
	
	// Apply eval to all members of exps
	public static TExp[] mapEval(Env env, TExp[] exps) {
		TExp[] exps1 = new TExp[exps.length];
		for(int i=0; i<exps.length; i++)
			exps1[i] = exps[i].eval(env);
		return exps1;
	}
	
	// Apply lifting to all members of exps
	public static TExp[] mapLift(TExp[] exps) {
		TExp[] exps1 = new TExp[exps.length];
		for(int i=0; i<exps.length; i++)
			exps1[i] = (exps[i] instanceof Value) ? new TConstant(exps[i]) : exps[i];
		return exps1;
	}
	
	// Select those elements in exps that match binding time bt
	public static TExp[] select(BT bt, TExp[] exps) {
		if(bt!=BT.S && bt!=BT.D) throw new Error("Operation not supported: select by binding time "+bt);
		List<TExp> result = new ArrayList<TExp>();
		for(int i=0; i<exps.length; i++)
			if(bt==BT.S && exps[i] instanceof Value)
				result.add(exps[i]);
			else if(bt==BT.D && !(exps[i] instanceof Value))
				result.add(exps[i]);
		return result.toArray(exps);
	}

	public TExp residualize() {
		return this;
	}

	public static TExp[] mapResidualize(TExp[] exps) {
		TExp[] result = new TExp[exps.length];
		for(int i=0; i<result.length; i++) result[i] = exps[i].residualize();
		return result;
	}
	
}
