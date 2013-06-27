package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.Env;


public class TConstant extends TExp {

	int value;
	
	public TConstant(int value) {
		super();
		this.value = value;
	}

	public TConstant(TExp exp) {
		if(exp instanceof NumericValue)
			value = ((NumericValue)exp).value;
		else
			throw new Error("Incompatible value");
	}

	@Override
	public TExp eval(Env env) {
		return new NumericValue(value);
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof NumericValue) // Equality with NumericValue
			return ((NumericValue)obj).value == value;
		if (getClass() != obj.getClass())
			return false;
		TConstant other = (TConstant) obj;
		if (value != other.value)
			return false;
		return true;
	}

	// Auto-generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

}
