package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class NestedStaticConditional extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"int","x"),
			new TLocalAssign(BT.S,"x",new TConstant(1))		,
			new TVarDecl(BT.D,"int","y"),
			new TConditional(BT.S,
				new TVarRef(BT.S,"x"),
				new TStatement[] {
					new TConditional(BT.S,
						new TBinOp(BT.S,new TVarRef(BT.S,"x"),"==",new TConstant(87)),
						new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TConstant(2)))		
						}, new TStatement[] {
							new TLocalAssign(BT.D,"y",new TLift(new TConstant(3)))		
						})
				}, new TStatement[] {
					new TLocalAssign(BT.D,"y",new TLift(new TConstant(4)))		
				})
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","y"),
			new TLocalAssign(BT.Bot,"y",new TConstant(3))		
		};
	}
	public Program getProgram() {
		return new Program("NestedStaticConditional",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
