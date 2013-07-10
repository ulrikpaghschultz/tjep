package test_intramethod;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class SimpleMethodsStaticData extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"Box@1","box"),
			new TLocalAssign(BT.S,"box",new TNew(BT.S,"Box@1",new TExp[] { new TConstant(87)}))		,
			new TVarDecl(BT.Bot,"int","a"),
			new TLocalAssign(BT.Bot,"a",new TLift(new TCall(BT.S,null,"box","get",new TExp[] { })))		,
			new TVarDecl(BT.Bot,"int","b"),
			new TLocalAssign(BT.Bot,"b",new TLift(new TCall(BT.S,null,"box","add",new TExp[] { new TConstant(1)})))		
		};
	}
	public TStatement[] getAssertion() {
		return new TStatement[] {
			new TVarDecl(BT.Bot,"int","a"),
			new TLocalAssign(BT.Bot,"a",new TConstant(87))		,
			new TVarDecl(BT.Bot,"int","b"),
			new TLocalAssign(BT.Bot,"b",new TConstant(88))		
		};
	}
	public Program getProgram() {
		return new Program("SimpleMethodsStaticData",
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
