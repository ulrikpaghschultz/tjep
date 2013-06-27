package dk.sdu.mmmi.tjep.ast;

public class TPrimitiveType extends TType {

	private String name;

	public TPrimitiveType(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
