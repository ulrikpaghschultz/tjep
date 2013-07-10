package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;

public class TParameter {

	private BT bt;
	private String typeName;
	private String varName;

	public TParameter(BT bt, String typeName, String varName) {
		super();
		this.bt = bt;
		this.typeName = typeName;
		this.varName = varName;
	}

	public BT getBT() {
		return bt;
	}

	public String getTypeName() {
		return typeName;
	}

	public String getVarName() {
		return varName;
	}
	

}
