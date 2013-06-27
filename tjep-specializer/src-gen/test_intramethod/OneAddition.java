package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class OneAddition extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","a"),
			new TLocalAssign(BT.Bot,"a",new TBinOp(BT.Bot,new TConstant(1),"+",new TConstant(2)))		,
			new TVarDecl(BT.Bot,"int","b"),
			new TLocalAssign(BT.Bot,"b",new TLift(new TBinOp(BT.S,new TConstant(1),"+",new TConstant(2))))		
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","a"),
			new TLocalAssign(BT.Bot,"a",new TBinOp(BT.Bot,new TConstant(1),"+",new TConstant(2)))		,
			new TVarDecl(BT.Bot,"int","b"),
			new TLocalAssign(BT.Bot,"b",new TConstant(3))		
		};
	}
	public Program getProgram() {
		return new Program("OneAddition",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
