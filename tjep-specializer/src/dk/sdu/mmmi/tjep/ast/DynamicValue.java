package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.Env;

public class DynamicValue extends TExp {

	String typeName;
	String varName;
	public DynamicValue(String typeName, String varName) {
		super();
		this.typeName = typeName;
		this.varName = varName;
	}
	@Override
	public TExp eval(Env env) {
		return this;
	}
	
	@Override
	public String toString() {
		return "/* dynamic " + typeName + " */" + varName;
	}
	
	// Auto-generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((typeName == null) ? 0 : typeName.hashCode());
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
		DynamicValue other = (DynamicValue) obj;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (varName == null) {
			if (other.varName != null)
				return false;
		} else if (!varName.equals(other.varName))
			return false;
		return true;
	}

	
}
