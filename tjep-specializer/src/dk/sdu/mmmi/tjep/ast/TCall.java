package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TCall extends TExp {

	BT bt;
	String receiver, name, qualifierMaybe;
	TExp[] args;
	
	public TCall(BT bt, String qualifierMaybe, String receiver, String name, TExp[] args) {
		super();
		this.bt = bt;
		this.name = name;
		this.qualifierMaybe = qualifierMaybe;
		this.receiver = receiver;
		this.args = args;
	}

	@Override
	public TExp eval(Env env) {
		TExp[] args1 = mapEval(env,args);
		TExp[] args1S = select(BT.S,args1);
		TExp[] args1D = select(BT.D,args1);
		if(bt==BT.S) { // Receiver object is static, reduce call
			ObjectValue receiverObject = env.local().lookupLocalVarAsObject(receiver);
			TMethod target = env.program().findMethod(receiverObject.typeName,name);
			return target.evalStaticCall(env,receiverObject,args1);
		} else { // Receiver is dynamic, speculative evaluation
			if(args1S.length==0) // All-dynamic, no specialization
				return new TCall(BT.Top,name,qualifierMaybe,receiver,TExp.mapResidualize(args1));
			if(qualifierMaybe==null) throw new Error("Speculative method specialization failed, missing qualifier");
			String newName = env.spec().speculativelySspecializedMethod(qualifierMaybe, name, args1);
			return new TCall(BT.Top, newName, qualifierMaybe, receiver, TExp.mapResidualize(args1D));
		}
	}

}
