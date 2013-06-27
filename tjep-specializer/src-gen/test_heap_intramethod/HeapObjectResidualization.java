package test_heap_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class HeapObjectResidualization extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.D,"Box@1","a"),
			new TLocalAssign(BT.D,"a",new TNew(BT.D,"Box@1",new TExp[] { new DynamicValue("int","input")}))		,
			new TVarDecl(BT.D,"int","b"),
			new TLocalAssign(BT.D,"b",new TFieldRef(BT.D,"a","value"))		
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"Box@1","a"),
			new TLocalAssign(BT.Bot,"a",new TNew(BT.Bot,"Box@1",new TExp[] { new DynamicValue("int","input")}))		,
			new TVarDecl(BT.Bot,"int","b"),
			new TLocalAssign(BT.Bot,"b",new TFieldRef(BT.Bot,"a","value"))		
		};
	}
	public Program getProgram() {
		return new Program("HeapObjectResidualization",
			this.getScenario(),
new TType[] {
new TClass("Box@1","Object",new TMember[] {
	new TField(BT.Bot,false,"int","value")
}),
new TClass("Box@2","Object",new TMember[] {
	new TField(BT.S,false,"int","value")
}),
new TPrimitiveType("int")
});
	}
}
