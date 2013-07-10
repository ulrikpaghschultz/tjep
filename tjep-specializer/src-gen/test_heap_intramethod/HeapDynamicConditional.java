package test_heap_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class HeapDynamicConditional extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"Box@2","a"),
			new TLocalAssign(BT.S,"a",new TNew(BT.S,"Box@2",new TExp[] { new TConstant(87)}))		,
			new TVarDecl(BT.D,"int","b"),
			new TConditional(BT.Bot,
				new DynamicValue("int","input"),
				new TStatement[] {
					new TFieldAssign(BT.S,"a","value",new TBinOp(BT.S,new TFieldRef(BT.S,"a","value"),"+",new TConstant(1)))		,
					new TLocalAssign(BT.D,"b",new TLift(new TFieldRef(BT.S,"a","value")))		
				}, new TStatement[] {
					new TFieldAssign(BT.S,"a","value",new TBinOp(BT.S,new TFieldRef(BT.S,"a","value"),"-",new TConstant(1)))		,
					new TLocalAssign(BT.D,"b",new TLift(new TFieldRef(BT.S,"a","value")))		
				})
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","b"),
			new TConditional(BT.Bot,
				new DynamicValue("int","input"),
				new TStatement[] {
					new TLocalAssign(BT.Bot,"b",new TConstant(88))		
				}, new TStatement[] {
					new TLocalAssign(BT.Bot,"b",new TConstant(86))		
				})
		};
	}
	public Program getProgram() {
		return new Program("HeapDynamicConditional",
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
