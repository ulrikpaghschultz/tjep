package dk.sdu.mmmi.tjep.ast;

import java.util.List;
import java.util.Map;

import dk.sdu.mmmi.tjep.Env;

public class ObjectValue extends Value {

	String typeName;
	Value[] fields;
	
	public ObjectValue(Env env, String typeName, TExp[] exps) {
		super();
		initialize(typeName, exps);
		env.heap().addObjectValue(typeName,this);
	}

	public void initialize(String typeName, TExp[] exps) {
		this.typeName = typeName;
		this.fields = new Value[exps.length];
		for(int i=0; i<exps.length; i++)
			this.fields[i] = value(exps[i],"object value argument");
	}

	public ObjectValue() {
		typeName = "NULL";
		fields = new Value[0];
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

	public void cloneFrom(ObjectValue clone) {
		Value[] newFields = new Value[clone.fields.length];
		for(int i=0; i<clone.fields.length; i++)
			newFields[i] = clone.fields[i];
		initialize(clone.typeName, newFields);
	}

}
