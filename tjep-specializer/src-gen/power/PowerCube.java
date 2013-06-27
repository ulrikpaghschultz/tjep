package power;
import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Scenario;
import dk.sdu.mmmi.tjep.ast.*;
public class PowerCube extends Scenario {
	public TStatement[] getScenario() {
		return new TStatement[] {
			new TVarDecl(BT.S,"Power","p"),
			new TLocalAssign(BT.S,"p",new TNew(BT.Bot,"Power",new TExp[] { new TConstant(3)}))		,
			new TVarDecl(BT.D,"int","arg"),
			new TLocalAssign(BT.D,"arg",new DynamicValue("int","a"))		,
			new TReturn(BT.D,new TCall(BT.Bot,"Power","p","raise",new TExp[] { new TVarRef(BT.Bot,"arg")}))
		};
	}
	public Program getProgram() {
		return new Program("PowerCube",
			this.getScenario(),
new TType[] {
new TPrimitiveType("int"),
new TClass("Object","Object",new TMember[] {
}),
new TClass("Power","Object",new TMember[] {
	new TField(BT.S,true,"int","exp"),
	new TConstructor(BT.D,
		new TParameter[] { new TParameter(BT.S,"int","e") },
		new TStatement[] {
			new TFieldAssign(BT.S,new TThis(),"exp",new TVarRef(BT.Bot,"e"))		
		}),
	new TMethod(BT.D,"int","raise",
		new TParameter[] { new TParameter(BT.D,"int","base") },
		new TStatement[] {
	  			new TVarDecl(BT.D,"int","result"),
	  			new TLocalAssign(BT.D,"result",new TLift(new TConstant(1)))		,
	  			new TVarDecl(BT.S,"int","e"),
	  			new TLocalAssign(BT.S,"e",new TFieldRef(BT.Bot,new TThis(BT.Bot),"exp"))		,
	  			new TWhile(BT.S,
	  				new TBinOp(BT.S,new TVarRef(BT.Bot,"e"),">",new TConstant(0)),
	  				new TStatement[] {
	  					new TLocalAssign(BT.D,"result",new TBinOp(BT.Bot,new TVarRef(BT.Bot,"result"),"*",new TVarRef(BT.Bot,"base")))		,
	  					new TLocalAssign(BT.S,"e",new TBinOp(BT.Bot,new TVarRef(BT.Bot,"e"),"-",new TConstant(1)))		
	  				}),
	  			new TReturn(BT.D,new TVarRef(BT.Bot,"result"))
		})
})
});
	}
}
