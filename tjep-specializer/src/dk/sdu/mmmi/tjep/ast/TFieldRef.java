package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TFieldRef extends TExp {

	BT bt;
	String varName, fieldName;
	
	public TFieldRef(BT bt, String varName, String fieldName) {
		super();
		this.bt = bt;
		this.varName = varName;
		this.fieldName = fieldName;
	}

	public TFieldRef(BT bt, TExp object, String fieldName) {
		super();
		this.bt = bt;
		if(!(object instanceof TThis)) throw new Error("Only this supported as field ref target");
		this.varName = null;
		this.fieldName = fieldName;
	}

	@Override
	public TExp eval(Env env) {
		if(bt==BT.S) { // Lookup static value from object
			ObjectValue object;
			if(varName==null)
				object = env.local().getSelf();
			else
				object = env.local().lookupLocalVarAsObject(varName);
			return env.heap().lookupObjectField(object,fieldName);
		} else { // Dynamic residualize
			return new TFieldRef(BT.Top,varName,fieldName);
		}
	}

	@Override
	public String toString() {
		return varName + "." + fieldName;
	}

	// Automatically generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result
				+ ((fieldName == null) ? 0 : fieldName.hashCode());
		result = prime * result + ((varName == null) ? 0 : varName.hashCode());
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
		TFieldRef other = (TFieldRef) obj;
		if (bt == null) {
			if (other.bt != null)
				return false;
		} else if (!bt.equals(other.bt))
			return false;
		if (fieldName == null) {
			if (other.fieldName != null)
				return false;
		} else if (!fieldName.equals(other.fieldName))
			return false;
		if (varName == null) {
			if (other.varName != null)
				return false;
		} else if (!varName.equals(other.varName))
			return false;
		return true;
	}

	
}
