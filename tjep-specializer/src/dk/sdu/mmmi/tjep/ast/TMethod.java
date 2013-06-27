package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TMethod extends TMember {

	BT bt;
	String returnTypeName, name;
	TParameter[] parameters;
	TStatement[] body;
	
	public TMethod(BT bt, String returnTypeName, String name, TParameter[] parameters, TStatement[] body) {
		super();
		this.bt = bt;
		this.returnTypeName = returnTypeName;
		this.name = name;
		this.parameters = parameters;
		this.body = body;
	}

	public TExp evalStaticCall(Env env, ObjectValue self, TExp[] args1) {
		// If under dynamic control and method already has been specialized then return result computed earlier
		if(env.spec().isDynamicControl()) {
			Env.SpecializedMethod specializedMaybe = env.spec().checkSpecializedMethod(parent,name,self,args1);
			if(specializedMaybe!=null) {
				if(specializedMaybe.value!=null)
					return specializedMaybe.value;
				else if(specializedMaybe.methodName!=null)
					return new TCall(BT.Top,null,self.typeName,specializedMaybe.methodName,TExp.select(BT.D, args1));
				else
					throw new Error("Internal error");
			}
		}
		// Otherwise specialize method body
		Env env1 = env.local().createLocalScope(self, parameters, args1);
		TStatement.EvalResult result = TStatement.evalBlock(env1, body);
		String returnType = result.returnMaybe == null ? VOID : returnTypeName;
		boolean residualize = result.body.length > 0;
		if(residualize) { // Residualize call to static method
			String newName = env.spec().specializedMethod(self.typeName, returnType, name, result.body, TExp.select(BT.S,args1));
			return new TCall(BT.Top,null,self.typeName,newName,TExp.select(BT.D, args1));
		} else if(result.returnMaybe!=null) // Return value computed by specialized method
			return result.returnMaybe;
		else { // Void method completely specialized away, not currently suppored
			throw new Error("Complete reduction of void method not supported");
		}
	}
 
	@Override
	public String getName() {
		return name;
	}

	public static final String VOID = "void";

}
