package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class SimpleDynamicConditional extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"int","x"),
			new TLocalAssign(BT.S,"x",new TConstant(1))		,
			new TVarDecl(BT.D,"int","y"),
			new TLocalAssign(BT.D,"y",new DynamicValue("int","input"))		,
			new TConditional(BT.D,
				new TVarRef(BT.D,"y"),
				new TStatement[] {
					new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(1))))		,
					new TLocalAssign(BT.S,"x",new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(10)))		
				}, new TStatement[] {
					new TLocalAssign(BT.D,"y",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(2))))		,
					new TLocalAssign(BT.S,"x",new TBinOp(BT.S,new TVarRef(BT.S,"x"),"+",new TConstant(20)))		
				})
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","y"),
			new TLocalAssign(BT.Bot,"y",new DynamicValue("int","input"))		,
			new TConditional(BT.Bot,
				new TVarRef(BT.Bot,"y"),
				new TStatement[] {
					new TLocalAssign(BT.Bot,"y",new TConstant(2))		
				}, new TStatement[] {
					new TLocalAssign(BT.Bot,"y",new TConstant(3))		
				})
		};
	}
	public Program getProgram() {
		return new Program("SimpleDynamicConditional",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
