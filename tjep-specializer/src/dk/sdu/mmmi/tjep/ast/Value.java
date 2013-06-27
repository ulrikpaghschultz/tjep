package dk.sdu.mmmi.tjep.ast;


public abstract class Value extends TExp {
	public static Value value(TExp exp, String description) {
		if(exp instanceof Value)
			return (Value)exp;
		throw new Error("Expected value but got expression "+exp+" for operation "+description);
	}
	@Override
	public abstract TExp residualize();
}
