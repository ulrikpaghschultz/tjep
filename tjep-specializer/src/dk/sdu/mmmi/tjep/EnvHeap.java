package dk.sdu.mmmi.tjep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import dk.sdu.mmmi.tjep.ast.ObjectValue;
import dk.sdu.mmmi.tjep.ast.TExp;
import dk.sdu.mmmi.tjep.ast.TField;
import dk.sdu.mmmi.tjep.ast.Value;

public class EnvHeap {
	
	private Env context;
	
	// TODO: use weak refs where appropriate
	private List<ObjectValue> heap = new ArrayList<ObjectValue>();
	
	private Stack<Map<ObjectValue,ObjectValue>> savedHeap = new Stack<Map<ObjectValue, ObjectValue>>();
	
	public EnvHeap(Env env) {
		this.context = env;
	}

	public Value lookupObjectField(ObjectValue object, String fieldName) {
		TField field = context.program().findField(object.getTypeName(),fieldName);
		if(!(field.getBT()==BT.S)) throw new Error("Read of non-static field "+object.getTypeName()+"."+fieldName);
		return object.getField(field);
	}

	public void addObjectValue(String typeName, ObjectValue objectValue) {
		heap.add(objectValue);
	}

	public void updateObjectValue(ObjectValue object, String fieldName, TExp value) {
		TField field = context.program().findField(object.getTypeName(),fieldName);
		if(!(field.getBT()==BT.S)) throw new Error("Update of non-static field");
		if(field.isFinal()) throw new Error("Update of final field");
		Value val = context.program().checkInstanceOfAndCast(value,field.getTypeName());
		object.setField(context,field,val);
	}

	public void save() {
		Map<ObjectValue,ObjectValue> save = new HashMap<ObjectValue, ObjectValue>();
		for(ObjectValue obj: heap) save.put(obj,new ObjectValue()); 
		for(ObjectValue obj: heap) save.get(obj).cloneFrom(obj);
		savedHeap.push(save);
	}

	public void restore(boolean erase) {
		Map<ObjectValue,ObjectValue> restore = savedHeap.peek();
		for(ObjectValue obj: heap) {
			ObjectValue clone = restore.get(obj);
			if(clone==null) heap.remove(obj);
			obj.cloneFrom(clone);
		}
		if(erase) savedHeap.pop();
	}


}
