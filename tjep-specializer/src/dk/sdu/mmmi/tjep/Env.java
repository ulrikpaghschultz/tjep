package dk.sdu.mmmi.tjep;

import dk.sdu.mmmi.tjep.ast.ObjectValue;
import dk.sdu.mmmi.tjep.ast.Program;
import dk.sdu.mmmi.tjep.ast.Value;

public class Env {

	public class SpecializedMethod {
		public Value value;
		public String methodName;
	}

	public Env(Program program) {
		 helper_local = new EnvLocal(this);
		 helper_heap = new EnvHeap(this);
		 helper_spec = new EnvSpec(this);
		 helper_program = new EnvProgram(this,program);
	}

	public Env(Env context, ObjectValue newSelfMaybe) {
		helper_local = new EnvLocal(this,context.helper_local, newSelfMaybe);
		helper_heap = context.helper_heap;
		helper_spec = context.helper_spec;
		helper_program = context.helper_program;
	}

	public Env nestedLocal(ObjectValue newSelfMaybe) {
		return new Env(this, newSelfMaybe);
	}
	
	private EnvLocal helper_local;
	private EnvHeap helper_heap;
	private EnvSpec helper_spec;
	private EnvProgram helper_program;

	public EnvLocal local() { return helper_local; }
	public EnvHeap heap() { return helper_heap; }
	public EnvSpec spec() { return helper_spec; }
	public EnvProgram program() { return helper_program; }
	
}
