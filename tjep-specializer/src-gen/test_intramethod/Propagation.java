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
new TClass("Box@1","Object",new TMember[] {
	new TField(BT.S,false,"int","value"),
	new TMethod(BT.S,"int","get",
		new TParameter[] {  },
		new TStatement[] {
	  			new TReturn(BT.S,new TFieldRef(BT.S,new TThis(BT.S),"value"))
		}),
	new TMethod(BT.S,"int","add",
		new TParameter[] { new TParameter(BT.S,"int","x") },
		new TStatement[] {
	  			new TVarDecl(BT.S,"int","res"),
	  			new TLocalAssign(BT.S,"res",new TBinOp(BT.S,new TFieldRef(BT.S,new TThis(BT.S),"value"),"+",new TVarRef(BT.S,"x")))		,
	  			new TReturn(BT.S,new TVarRef(BT.S,"res"))
		})
}),
new TPrimitiveType("int")
});
	}
}
