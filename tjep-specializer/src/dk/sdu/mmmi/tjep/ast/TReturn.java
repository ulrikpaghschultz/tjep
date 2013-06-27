package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TReturn extends TStatement {

	BT bt;
	TExp exp;
	
	public TReturn(BT bt, TExp exp) {
		super();
		this.bt = bt;
		this.exp = exp;
	}

	@Override
	public TStatement[] eval(Env env) {
		TExp exp1 = exp.eval(env);
		if(bt==BT.S) {
			if(!(exp1 instanceof Value)) throw new Error("Static return of dynamic value");
			env.local().setReturnValue((Value)exp1);
			return new TStatement[0];
		} else {
			return new TStatement[] { new TReturn(BT.Top, exp1) };
		}
	}
	
	@Override
	public String toString() {
		return "return /*bt=" + bt + "*/ " + exp + ";";
	}

}
