package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;


public class TThis extends TExp {

	BT bt;
	
	public TThis() {
		this(BT.Bot);
	}

	public TThis(BT bt) {
		this.bt = bt;
	}

	@Override
	public TExp eval(Env env) {
		return env.local().getSelf();
	}

}
