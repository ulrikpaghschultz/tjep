package dk.sdu.mmmi.tjep.ast;

import java.util.Arrays;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TNew extends TExp {

	BT bt;
	String typeName;
	TExp[] args;
	
	public TNew(BT bt, String typeName, TExp[] args) {
		super();
		this.bt = bt;
		this.typeName = typeName;
		this.args = args;
	}

	@Override
	public TExp eval(Env env) {
		TExp[] args1 = mapEval(env,args);
		if(bt==BT.S) { // Static new operation, all of args1 must be values
			return new ObjectValue(env,typeName,args1);
		} else if(env.program().findClass(typeName).getFields(true).length>0) {
			TClass sub = env.spec().specializedSubclass(typeName,args1);
			return new TNew(BT.Top,sub.name,select(BT.D,args));
		} else { // No final fields, dynamic self, residualize operation (but check that all fields are dynamic)
			for(TField f: env.program().findClass(typeName).getFields(false))
				if(f.getBT()==BT.S) throw new Error("Residualization of class with static field: "+typeName+"."+f.getName());
			return new TNew(BT.Top, typeName, args1);
		}
	}

	@Override
	public String toString() {
		return "new/*" + bt + "*/" + typeName + "("	+ Arrays.toString(args) + ")";
	}

	// Automatically generated
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(args);
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result
				+ ((typeName == null) ? 0 : typeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TNew other = (TNew) obj;
		if (!Arrays.equals(args, other.args))
			return false;
		if (bt == null) {
			if (other.bt != null)
				return false;
		} else if (!bt.equals(other.bt))
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		return true;
	}
	
	
}
