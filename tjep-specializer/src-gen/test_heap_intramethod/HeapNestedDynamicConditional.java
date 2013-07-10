package test_heap_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class HeapNestedDynamicConditional extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"Box@2","x"),
			new TLocalAssign(BT.S,"x",new TNew(BT.S,"Box@2",new TExp[] { new TConstant(87)}))		,
			new TFieldAssign(BT.S,"x","value",new TConstant(1))		,
			new TVarDecl(BT.D,"int","y"),
			new TLocalAssign(BT.D,"y",new DynamicValue("int","input1"))		,
			new TVarDecl(BT.D,"int","z"),
			new TLocalAssign(BT.D,"z",new DynamicValue("int","input2"))		,
			new TConditional(BT.D,
				new TVarRef(BT.D,"y"),
				new TStatement[] {
					new TConditional(BT.D,
						new TVarRef(BT.D,"z"),
						new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(1))))		,
							new TFieldAssign(BT.S,"x","value",new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(10)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TFieldRef(BT.S,"x","value"))))		
						}, new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(2))))		,
							new TFieldAssign(BT.S,"x","value",new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(20)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TFieldRef(BT.S,"x","value"))))		
						})
				}, new TStatement[] {
					new TConditional(BT.D,
						new TVarRef(BT.D,"z"),
						new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(3))))		,
							new TFieldAssign(BT.S,"x","value",new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(30)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TFieldRef(BT.S,"x","value"))))		
						}, new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(4))))		,
							new TFieldAssign(BT.S,"x","value",new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TConstant(40)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TFieldRef(BT.S,"x","value"),"+",new TFieldRef(BT.S,"x","value"))))		
						})
				})
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","y"),
			new TLocalAssign(BT.Bot,"y",new DynamicValue("int","input1"))		,
			new TVarDecl(BT.Bot,"int","z"),
			new TLocalAssign(BT.Bot,"z",new DynamicValue("int","input2"))		,
			new TConditional(BT.Bot,
				new TVarRef(BT.Bot,"y"),
				new TStatement[] {
					new TConditional(BT.Bot,
						new TVarRef(BT.Bot,"z"),
						new TStatement[] {
							new TLocalAssign(BT.Bot,"y",new TConstant(2))		,
							new TLocalAssign(BT.Bot,"z",new TConstant(22))		
						}, new TStatement[] {
							new TLocalAssign(BT.Bot,"y",new TConstant(3))		,
							new TLocalAssign(BT.Bot,"z",new TConstant(42))		
						})
				}, new TStatement[] {
					new TConditional(BT.Bot,
						new TVarRef(BT.Bot,"z"),
						new TStatement[] {
							new TLocalAssign(BT.Bot,"y",new TConstant(4))		,
							new TLocalAssign(BT.Bot,"z",new TConstant(62))		
						}, new TStatement[] {
							new TLocalAssign(BT.Bot,"y",new TConstant(5))		,
							new TLocalAssign(BT.Bot,"z",new TConstant(82))		
						})
				})
		};
	}
	public Program getProgram() {
		return new Program("HeapNestedDynamicConditional",
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
