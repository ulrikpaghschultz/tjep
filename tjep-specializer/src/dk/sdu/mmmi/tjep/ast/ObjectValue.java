package dk.sdu.mmmi.tjep.ast;

import java.util.List;
import java.util.Map;

import dk.sdu.mmmi.tjep.Env;

public class ObjectValue extends Value {

	String typeName;
	Value[] fields;
	
	public ObjectValue(Env env, String typeName, TExp[] exps) {
		super();
		this.typeName = typeName;
		this.fields = new Value[exps.length];
		for(int i=0; i<exps.length; i++)
			this.fields[i] = value(exps[i],"object value argument");
		env.heap().addObjectValue(typeName,this);
	}

	
	
	@Override
	public TExp eval(Env env) {
		return this;
	}
	
	public String getTypeName() {
		return typeName;
	}

	public ObjectValue copy(Map<ObjectValue, ObjectValue> cache) {
		throw new Error("Not implemented");
	}

	public ObjectValue restore(List<ObjectValue> saved,
			Map<ObjectValue, ObjectValue> savedMap) {
		throw new Error("Not implemented");
	}

	@Override
	public TExp residualize() {
		throw new Error("Attempt to residualize object value");
	}

	public void setField(Env context, TField field, Value val) {
		fields[field.getObjectIndex()] = val;
	}

	public Value getField(TField field) {
		return fields[field.getObjectIndex()];
	}

}
