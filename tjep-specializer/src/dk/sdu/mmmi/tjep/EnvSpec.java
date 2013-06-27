package dk.sdu.mmmi.tjep;

import dk.sdu.mmmi.tjep.Env.SpecializedMethod;
import dk.sdu.mmmi.tjep.ast.Program;
import dk.sdu.mmmi.tjep.ast.TClass;
import dk.sdu.mmmi.tjep.ast.TExp;
import dk.sdu.mmmi.tjep.ast.TStatement;

public class EnvSpec {

	private Env env;
	private int speculativeEvaluationCounter;

	public EnvSpec(Env env) {
		this.env = env;
	}

	public TClass specializedSubclass(String typeName, TExp[] args1) {
		throw new Error("not implemented");
	}

	public String specializedMethod(String qualifierMaybe, String name, String name2, TStatement[] body, TExp[] args1) {
		throw new Error("not implemented");
	}

	public SpecializedMethod checkSpecializedMethod(TClass parent, String name,
			TExp self, TExp[] args1) {
		throw new Error("not implemented");
	}

	// Speculative specialization
	
	public String speculativelySspecializedMethod(String qualifierMaybe,
			String name, TExp[] args1) {
		throw new Error("not implemented");
	}

	public boolean isDynamicControl() {
		return speculativeEvaluationCounter>0;
	}

	public void pushSpeculativeEvaluation() {
		env.local().save();
		env.heap().save();
		speculativeEvaluationCounter++;
	}

	public void popSpeculativeEvaluation() {
		env.local().restore(true);
		env.heap().restore(true);
		speculativeEvaluationCounter--;
	}

	public void restoreSpeculativeEvaluationEnv() {
		env.local().restore(false);
		env.heap().restore(false);
	}

	public void finishWorkQueue() {
		; // TODO: implement work queue
	}

	public Program getProgram() {
		// TODO: implement actions that modify the program e.g. creating specialized methods
		return env.program().getSourceProgram();
	}

}
