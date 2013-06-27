package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TFieldAssign extends TStatement {

	BT bt;
	String target, name;
	TExp exp;
	
	public TFieldAssign(BT bt, String target, String name, TExp exp) {
		super();
		this.bt = bt;
		this.target = target;
		this.name = name;
		this.exp = exp;
	}

	public TFieldAssign(BT bt, TExp object, String name, TExp exp) {
		super();
		this.bt = bt;
		if(!(object instanceof TThis)) throw new Error("Only this supported as field ref target");
		this.name = name;
		this.exp = exp;
	}

	@Override
	public TStatement[] eval(Env env) {
		TExp exp1 = exp.eval(env);
		if(bt==BT.S) { // Reduce assignment
			ObjectValue object;
			if(target==null)
				object = env.local().getSelf();
			else
				object = env.local().lookupLocalVarAsObject(target);
			if(!(exp1 instanceof Value)) throw new Error("Static assignment to "+name+" failed with dynamic argument "+exp1);
			env.heap().updateObjectValue(object, name, exp1);
			return new TStatement[0];
		} else { // Residualize assignment
			return new TStatement[] { new TFieldAssign(BT.Top,target,name,exp1) };
		}
	}

}
