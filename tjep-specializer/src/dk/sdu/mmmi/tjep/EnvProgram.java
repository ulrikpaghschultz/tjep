package dk.sdu.mmmi.tjep;

import dk.sdu.mmmi.tjep.ast.NumericValue;
import dk.sdu.mmmi.tjep.ast.ObjectValue;
import dk.sdu.mmmi.tjep.ast.Program;
import dk.sdu.mmmi.tjep.ast.TClass;
import dk.sdu.mmmi.tjep.ast.TExp;
import dk.sdu.mmmi.tjep.ast.TField;
import dk.sdu.mmmi.tjep.ast.TMember;
import dk.sdu.mmmi.tjep.ast.TMethod;
import dk.sdu.mmmi.tjep.ast.TType;
import dk.sdu.mmmi.tjep.ast.Value;

public class EnvProgram {

	private Env env;
	private Program program;

	public EnvProgram(Env env, Program program) {
		this.env = env;
		this.program = program;
	}

	public TMethod findMethod(String typeName, String methodName) {
		if(typeName==null) throw new Error("Null type for call to method "+methodName);
		TType type = program.getType(typeName);
		if(!(type instanceof TClass)) throw new Error("Illegal method type annotation: non-class type");
		TClass clazz = (TClass)type;
		TMember member = clazz.getMember(methodName);
		if(!(member instanceof TMethod)) throw new Error("Method lookup of non-method member");
		return (TMethod)member;
	}

	public Program getSourceProgram() {
		return program;
	}

	public TField findField(String typeName, String fieldName) {
		TType type = program.getType(typeName);
		if(!(type instanceof TClass)) throw new Error("Field lookup on non-class type");
		TClass clazz = (TClass)type;
		TMember member = clazz.getMember(fieldName);
		if(!(member instanceof TField)) throw new Error("Field lookup of non-field member");
		return (TField)member;
	}

	public Value checkInstanceOfAndCast(TExp value, String typeName) {
		if(typeName.equals("int")) {
			if(value instanceof NumericValue) return (NumericValue)value;
			else throw new Error("Value not an integer: "+value);
		}
		if(!(value instanceof ObjectValue)) throw new Error("Value not an object: "+value);
		ObjectValue object = (ObjectValue)value;
		if(!checkInstanceOf(object.getTypeName(),typeName)) throw new Error("Not an instanceof: "+typeName+", "+object);
		return object;
	}

	public boolean checkInstanceOf(String objectType, String constraint) {
		if(objectType.equals(constraint)) return true;
		TClass clazz = findClass(objectType);
		if(clazz.getName().equals(clazz.getSuperName())) return false; // means tehre is no superclass
		return checkInstanceOf(clazz.getSuperName(),constraint);
	}

	public TClass findClass(String typeName) {
		TType type = program.getType(typeName);
		if(!(type instanceof TClass)) throw new Error("Class name lookup for non-class type");
		return (TClass)type;
	}

}
