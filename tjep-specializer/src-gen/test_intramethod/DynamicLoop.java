package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class DynamicLoop extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.D,"int","bound"),
			new TLocalAssign(BT.D,"bound",new DynamicValue("int","loopBound"))		,
			new TWhile(BT.D,
				new TBinOp(BT.D,new TVarRef(BT.Bot,"bound"),">",new TConstant(0)),
				new TStatement[] {
					new TVarDecl(BT.S,"int","loc"),
					new TLocalAssign(BT.S,"loc",new TConstant(5))		,
					new TLocalAssign(BT.S,"loc",new TBinOp(BT.S,new TVarRef(BT.S,"loc"),"*",new TVarRef(BT.S,"loc")))		,
					new TLocalAssign(BT.D,"bound",new TBinOp(BT.D,new TVarRef(BT.D,"bound"),"-",new TLift(new TVarRef(BT.S,"loc"))))		
				})
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","bound"),
			new TLocalAssign(BT.Bot,"bound",new DynamicValue("int","loopBound"))		,
			new TWhile(BT.Bot,
				new TBinOp(BT.Bot,new TVarRef(BT.Bot,"bound"),">",new TConstant(0)),
				new TStatement[] {
					new TLocalAssign(BT.Bot,"bound",new TBinOp(BT.Bot,new TVarRef(BT.Bot,"bound"),"-",new TConstant(25)))		
				})
		};
	}
	public Program getProgram() {
		return new Program("DynamicLoop",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
