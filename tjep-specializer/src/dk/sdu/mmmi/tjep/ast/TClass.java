package dk.sdu.mmmi.tjep.ast;

import java.util.ArrayList;
import java.util.List;

public class TClass extends TType {

	String name, zuper;
	TMember[] members;
	
	public TClass(String name, String zuper, TMember[] members) {
		super();
		this.name = name;
		this.zuper = zuper;
		this.members = members;
		int fieldIndex = 0;
		for(int i=0; i<members.length; i++) {
			members[i].setParent(this);
			if(members[i] instanceof TField)
				((TField)members[i]).setObjectIndex(fieldIndex++);
		}
	}

	@Override
	public String getName() {
		return name;
	}

	public TMember getMember(String fieldName) {
		for(int i=0; i<members.length; i++)
			if(members[i].getName().equals(fieldName)) return members[i];
		throw new Error("Member not found: "+fieldName);
	}

	public TField[] getFields(boolean onlyFinal) {
		List<TField> ff = new ArrayList<TField>();
		for(int i=0; i<members.length; i++)
			if(members[i] instanceof TField && (!onlyFinal || ((TField)members[i]).isFinal()))
				ff.add((TField)members[i]);
		return ff.toArray(new TField[0]);
	}

}
