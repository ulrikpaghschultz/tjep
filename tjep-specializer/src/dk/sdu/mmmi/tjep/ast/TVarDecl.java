package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TVarDecl extends TStatement {

	BT bt;
	String typeName, name;
	public TVarDecl(BT bt, String typeName, String name) {
		super();
		this.bt = bt;
		this.typeName = typeName;
		this.name = name;
	}

	@Override
	public TStatement[] eval(Env env) {
		if(bt==BT.S) {
			env.local().addLocalVariable(typeName,name);
			return new TStatement[0];
		} else
			return new TStatement[] { new TVarDecl(BT.Top, typeName, name) };
	}
	
	@Override
	public String toString() {
		return "/*" + bt + "*/ " + typeName + " " + name + ";";
	}

	// Auto-generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((typeName == null) ? 0 : typeName.hashCode());
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
		TVarDecl other = (TVarDecl) obj;
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
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		return true;
	}

}
