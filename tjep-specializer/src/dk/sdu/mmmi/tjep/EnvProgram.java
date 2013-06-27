package dk.sdu.mmmi.tjep;

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

	public TMethod findMethod(String typeName, String name) {
		throw new Error("Not implemented");
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
		throw new Error("not implemented");
	}

	public TClass findClass(String typeName) {
		TType type = program.getType(typeName);
		if(!(type instanceof TClass)) throw new Error("Class name lookup for non-class type");
		return (TClass)type;
	}

}
