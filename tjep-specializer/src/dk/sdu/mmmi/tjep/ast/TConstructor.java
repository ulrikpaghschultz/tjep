package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;

public class TConstructor extends TMember {

	public TConstructor(BT d, TParameter[] parameters, TStatement[] body) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "new";
	}

}
