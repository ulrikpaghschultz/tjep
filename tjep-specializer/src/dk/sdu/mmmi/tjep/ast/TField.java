package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;

public class TField extends TMember {

	private BT bt;
	private boolean isFinal;
	private String typeName;
	private String name;
	private int objectIndex = -1;
	
	public TField(BT bt, boolean isFinal, String typeName, String name) {
		super();
		this.bt = bt;
		this.isFinal = isFinal;
		this.typeName = typeName;
		this.name = name;
	}

	public BT getBT() {
		return bt;
	}

	public boolean isFinal() {
		return isFinal;
	}

	public String getTypeName() {
		return typeName;
	}

	public String getName() {
		return name;
	}

	public void setObjectIndex(int index) {
		this.objectIndex = index;
	}
	
	public int getObjectIndex() {
		if(objectIndex==-1) throw new Error("Object index not set");
		return objectIndex;
	}

}
