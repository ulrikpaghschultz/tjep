package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TSingleExp extends TStatement {
	BT bt;
	TExp exp;
	public TSingleExp(BT bt, TExp exp) {
		super();
		this.bt = bt;
		this.exp = exp;
	}
	@Override
	public TStatement[] eval(Env env) {
		TExp exp1 = exp.eval(env);
		if(bt==BT.S) {
			if(!(exp1 instanceof Value)) throw new Error("Static single expression with dynamic expression");
			return new TStatement[0];
		} else {
			return new TStatement[] { new TSingleExp(BT.Top,exp1) };
		}
	}

}
