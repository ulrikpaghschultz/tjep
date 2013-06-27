package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TLocalAssign extends TStatement {

	BT bt;
	String name;
	TExp exp;
	
	public TLocalAssign(BT bt, String name, TExp exp) {
		super();
		this.bt = bt;
		this.name = name;
		this.exp = exp;
	}

	@Override
	public TStatement[] eval(Env env) {
		TExp exp1 = exp.eval(env);
		if(bt==BT.S) { // Reduce assignment
			if(!(exp1 instanceof Value)) throw new Error("Static assignment to "+name+" failed with dynamic argument "+exp1);
			env.local().updateLocalVariable(name,(Value)exp1);
			return new TStatement[0];
		} else { // Residualize assignment
			return new TStatement[] { new TLocalAssign(BT.Top,name,exp1) };
		}
	}

	@Override
	public String toString() {
		return "/*" + bt + "*/ " + name + " = " + exp + ";";
	}

	// Auto-generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result + ((exp == null) ? 0 : exp.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		TLocalAssign other = (TLocalAssign) obj;
		if (bt == null) {
			if (other.bt != null)
				return false;
		} else if (!bt.equals(other.bt))
			return false;
		if (exp == null) {
			if (other.exp != null)
				return false;
		} else if (!exp.equals(other.exp))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
