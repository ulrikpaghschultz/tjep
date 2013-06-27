package dk.sdu.mmmi.tjep.ast;

public abstract class TMember {

	TClass parent;
	
	public void setParent(TClass clazz) {
		this.parent = clazz;
	}

	public abstract String getName();

}
