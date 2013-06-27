package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TVarRef extends TExp {
	BT bt;
	String name;
	
	public TVarRef(BT bt, String name) {
		super();
		this.bt = bt;
		this.name = name;
	}

	public TExp eval(Env env) {
		if(bt==BT.S)
			return env.local().lookupLocalVar(name);
		else
			return new TVarRef(BT.Top,name);
	}
	
	public String toString() {
		return name;
	}
	
	// Auto-generated

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
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
		TVarRef other = (TVarRef) obj;
		if (bt == null) {
			if (other.bt != null)
				return false;
		} else if (!bt.equals(other.bt))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
