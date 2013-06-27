package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class StaticLoop extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.D,"int","base"),
			new TLocalAssign(BT.D,"base",new DynamicValue("int","baseValue"))		,
			new TVarDecl(BT.S,"int","exp"),
			new TLocalAssign(BT.S,"exp",new TConstant(3))		,
			new TVarDecl(BT.D,"int","res"),
			new TLocalAssign(BT.D,"res",new TLift(new TConstant(1)))		,
			new TWhile(BT.S,
				new TBinOp(BT.S,new TVarRef(BT.S,"exp"),">",new TConstant(0)),
				new TStatement[] {
					new TLocalAssign(BT.D,"res",new TBinOp(BT.D,new TVarRef(BT.Bot,"res"),"*",new TVarRef(BT.Bot,"base")))		,
					new TLocalAssign(BT.S,"exp",new TBinOp(BT.S,new TVarRef(BT.S,"exp"),"-",new TConstant(1)))		
				})
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","base"),
			new TLocalAssign(BT.Bot,"base",new DynamicValue("int","baseValue"))		,
			new TVarDecl(BT.Bot,"int","res"),
			new TLocalAssign(BT.Bot,"res",new TConstant(1))		,
			new TLocalAssign(BT.Bot,"res",new TBinOp(BT.Bot,new TVarRef(BT.Bot,"res"),"*",new TVarRef(BT.Bot,"base")))		,
			new TLocalAssign(BT.Bot,"res",new TBinOp(BT.Bot,new TVarRef(BT.Bot,"res"),"*",new TVarRef(BT.Bot,"base")))		,
			new TLocalAssign(BT.Bot,"res",new TBinOp(BT.Bot,new TVarRef(BT.Bot,"res"),"*",new TVarRef(BT.Bot,"base")))		
		};
	}
	public Program getProgram() {
		return new Program("StaticLoop",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int")
});
	}
}
