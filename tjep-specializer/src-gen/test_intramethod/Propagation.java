package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class Propagation extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"int","a"),
			new TLocalAssign(BT.S,"a",new TBinOp(BT.S,new TConstant(1),"+",new TConstant(2)))		,
			new TVarDecl(BT.S,"int","b"),
			new TLocalAssign(BT.S,"b",new TBinOp(BT.S,new TConstant(3),"+",new TConstant(5)))		,
			new TVarDecl(BT.S,"int","c"),
			new TLocalAssign(BT.D,"c",new TLift(new TBinOp(BT.S,new TVarRef(BT.S,"a"),"+",new TVarRef(BT.S,"b"))))		
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TLocalAssign(BT.Bot,"c",new TConstant(11))		
		};
	}
	public Program getProgram() {
		return new Program("Propagation",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
