package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class NestedDynamicConditional extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"int","x"),
			new TLocalAssign(BT.S,"x",new TConstant(1))		,
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
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(1))))		,
							new TLocalAssign(BT.S,"x",new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(10)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TVarRef(BT.S,"x"))))		
						}, new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(2))))		,
							new TLocalAssign(BT.S,"x",new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(20)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TVarRef(BT.S,"x"))))		
						})
				}, new TStatement[] {
					new TConditional(BT.D,
						new TVarRef(BT.D,"z"),
						new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(3))))		,
							new TLocalAssign(BT.S,"x",new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(30)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TVarRef(BT.S,"x"))))		
						}, new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(4))))		,
							new TLocalAssign(BT.S,"x",new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(40)))		,
							new TLocalAssign(BT.D,"z",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TVarRef(BT.S,"x"))))		
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
		return new Program("NestedDynamicConditional",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
