package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.ast.TType;


public class Program {

	String pkg;
	TStatement[] scenario;
	TType[] types;
	
	public Program(String pkg, TStatement[] scenario, TType[] types) {
		super();
		this.pkg = pkg;
		this.scenario = scenario;
		this.types = types;
	}

	public TType getType(String typeName) {
		for(int i=0; i<types.length; i++)
			if(types[i].getName().equals(typeName)) return types[i];
		throw new Error("Type not found: "+typeName);
	}
	
	
}
