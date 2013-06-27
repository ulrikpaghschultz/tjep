package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.Env;

public class NumericValue extends Value {

	int value;
	
	public NumericValue(int value) {
		super();
		this.value = value;
	}

	@Override
	public TExp eval(Env env) {
		return this;
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	@Override
	public TExp residualize() {
		return new TConstant(value);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof TConstant) // Equality with TConstant
			return ((TConstant)obj).value == value;
		if (getClass() != obj.getClass())
			return false;
		NumericValue other = (NumericValue) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
}
