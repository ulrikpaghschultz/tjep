package dk.sdu.mmmi.tjep.generator

import dk.sdu.mmmi.tjep.tJ.Primitive
import dk.sdu.mmmi.tjep.tJ.Clazz
import dk.sdu.mmmi.tjep.tJ.Field
import dk.sdu.mmmi.tjep.tJ.Static
import dk.sdu.mmmi.tjep.tJ.Dynamic
import dk.sdu.mmmi.tjep.tJ.Method
import dk.sdu.mmmi.tjep.tJ.Constructor
import dk.sdu.mmmi.tjep.tJ.VarDecl
import dk.sdu.mmmi.tjep.tJ.Condition
import dk.sdu.mmmi.tjep.tJ.While
import dk.sdu.mmmi.tjep.tJ.Return
import dk.sdu.mmmi.tjep.tJ.SingleExpr
import dk.sdu.mmmi.tjep.tJ.VarRef
import dk.sdu.mmmi.tjep.tJ.ObjectOp
import org.eclipse.emf.common.util.EList
import dk.sdu.mmmi.tjep.tJ.Expr
import dk.sdu.mmmi.tjep.tJ.Member
import dk.sdu.mmmi.tjep.tJ.Statement
import dk.sdu.mmmi.tjep.tJ.AnnotatedExpr
import dk.sdu.mmmi.tjep.tJ.Instantiation
import dk.sdu.mmmi.tjep.tJ.Constant
import dk.sdu.mmmi.tjep.tJ.BinOp
import dk.sdu.mmmi.tjep.tJ.Parameter
import dk.sdu.mmmi.tjep.tJ.MethodCall
import dk.sdu.mmmi.tjep.tJ.LiftExp
import dk.sdu.mmmi.tjep.tJ.Program
import dk.sdu.mmmi.tjep.tJ.DynamicValue
import dk.sdu.mmmi.tjep.tJ.Scenario
import dk.sdu.mmmi.tjep.tJ.This
import dk.sdu.mmmi.tjep.tJ.BT
import dk.sdu.mmmi.tjep.tJ.LocalAssign
import dk.sdu.mmmi.tjep.tJ.FieldAssign
import java.util.List

class JavaInstantiator {
	
	def output(Program p, Scenario s) '''
	package «p.pkgname»;
	import dk.sdu.mmmi.tjep.BT;
	import dk.sdu.mmmi.tjep.Scenario;
	import dk.sdu.mmmi.tjep.ast.*;
	public class «s.name» extends Scenario {
		public TStatement[] getScenario() {
			return new TStatement[] {
				«FOR stmt:s.target SEPARATOR ','»
				«stmt.output»
				«ENDFOR»
			};
		}
		«IF s.assertion.size>0»
		public TStatement[] getAssertion() {
			return new TStatement[] {
				«FOR stmt:s.assertion SEPARATOR ','»
				«stmt.output»
				«ENDFOR»
			};
		}
		«ENDIF»
		public Program getProgram() {
			return new Program("«s.name»",
				this.getScenario(),
	new TType[] {
  				«FOR t:p.types SEPARATOR ','»
				«t.output»
  				«ENDFOR»
	});
		}
	}
  	'''
  	
  	// Binding time annotations
  	
  	def dispatch outputBT(Static b) '''BT.S'''

	def dispatch outputBT(Dynamic b) '''BT.D'''
	
	def dispatch outputBT(Void b) '''BT.Bot'''
  	
  	def dispatch outputBT(Member m) '''«IF m.bt!=null»«m.bt.outputBT»«ELSE»BT.Bot«ENDIF»'''
  	
  	def dispatch outputBT(Statement s) '''«IF s.bt!=null»«s.bt.outputBT»«ELSE»BT.Bot«ENDIF»'''
  	
  	def dispatch outputBT(AnnotatedExpr e) '''«IF e.bt!=null»«e.bt.outputBT»«ELSE»BT.Bot«ENDIF»'''
  	  	
	// Top level

  	def dispatch output(Primitive p) '''
  	new TPrimitiveType("«p.name»")
  	'''
  	
  	def dispatch output(Clazz c) '''
  	new TClass("«c.name»","«c.base.name»",new TMember[] {
  		«FOR m:c.members SEPARATOR ','»
  		«m.output»
  		«ENDFOR»
  	})
  	'''
  	
	// Members

  	def dispatch output(Field f) '''
	new TField(«f.outputBT»,«IF f.final»true«ELSE»false«ENDIF»,"«f.type.name»","«f.name»")
  	'''
  	
  	def dispatch output(Method m) '''
	new TMethod(«m.outputBT»,"«m.type.name»","«m.name»",
		new TParameter[] { «FOR p:m.params SEPARATOR ','»«p.output»«ENDFOR» },
		new TStatement[] {
  			«FOR s:m.body SEPARATOR ','»
  			«s.output»
  			«ENDFOR»
		})
  	'''
  	
  	def dispatch output(Constructor c) '''
  	new TConstructor(«c.outputBT»,
  		new TParameter[] { «FOR p:c.params SEPARATOR ','»«p.output»«ENDFOR» },
  		new TStatement[] {
  			«FOR s:c.body»
  			«s.output»
  			«ENDFOR»
  		})
  	'''
  	
	def dispatch output(Parameter p) '''new TParameter(«p.bt.outputBT»,"«p.type.name»","«p.name»")'''
	
  	// Statements

	def dispatch output(VarDecl v) '''
	new TVarDecl(«v.outputBT»,"«v.type.name»","«v.name»")
	'''
	
	def dispatch output(LocalAssign a) '''
	new TLocalAssign(«a.outputBT»,"«a.name»",«a.rhs.output»)		
	'''
	
	def dispatch output(FieldAssign a) '''
	new TFieldAssign(«a.outputBT»,«IF a.object==null»new TThis()«ELSE»"«a.object»"«ENDIF»,"«a.name»",«a.rhs.output»)		
	'''
	
	def dispatch output(Condition c) '''
	new TConditional(«c.outputBT»,
		«c.cond.output»,
		new TStatement[] {
			«FOR s:c.thenBody SEPARATOR ','»
			«s.output»
			«ENDFOR»
		}, new TStatement[] {
			«FOR s:c.elseBody SEPARATOR ','»
			«s.output»
			«ENDFOR»
		})
	'''
	
	def dispatch output(While w) '''
	new TWhile(«w.outputBT»,
		«w.cond.output»,
		new TStatement[] {
			«FOR s:w.body SEPARATOR ','»
			«s.output»
			«ENDFOR»
		})
	'''

	def dispatch output(Return r) '''
	new TReturn(«r.outputBT»,«r.exp.output»)
	'''

	def dispatch output(SingleExpr s) '''
	new TSingleExp(«s.outputBT»,«s.exp.output»)
	'''

	// Expressions

	def dispatch output(LiftExp e) '''new TLift(«e.exp.output»)'''
	
	def dispatch output(This e) '''new TThis(«e.outputBT»)'''

	def dispatch output(AnnotatedExpr e) { return e.outputAE(e.bt) }
	
	def dispatch outputAE(MethodCall c,BT b) '''new TCall(«b.outputBT»,«c.target.outputCall(b)»,«c.argument.output»)'''

	def outputCall(ObjectOp o,BT b) '''«IF o.qualifier!=null»"«o.qualifier.name»"«ELSE»null«ENDIF»,«IF o.object!=null»"«o.object»"«ELSE»new TThis()«ENDIF»,"«o.name»"'''

	def dispatch outputAE(ObjectOp o,BT b) '''new TFieldRef(«b.outputBT»,«IF o.object!=null»"«o.object»"«ELSE»new TThis(«b.outputBT»)«ENDIF»,"«o.name»")'''

	def dispatch outputAE(Instantiation i,BT b) '''new TNew(«b.outputBT»,"«i.type.name»",«i.argument.output»)'''
	
	def dispatch CharSequence outputAE(AnnotatedExpr e,BT b) { return e.exp.outputAE(e.bt) }

	def dispatch output(EList<Expr> args) '''new TExp[] { «FOR a:args SEPARATOR ','»«a.output»«ENDFOR»}'''	
		
	def dispatch CharSequence output(BinOp b) {
		if(b.rhs==null) {
			if(b.op==null)
				return b.lhs.output
			else
				return '''new TUnaryOp(«b.op.operatorBT»,"«b.op.removeBT»",«b.lhs.output»)'''
		} else
			return '''new TBinOp(«b.op.operatorBT»,«b.lhs.output»,"«b.op.removeBT»",«b.rhs.output»)'''
	}
	
	def dispatch output(Constant c) '''new TConstant(«c.value»)'''

	def dispatch output(VarRef v) '''new TVarRef(«v.bt.outputBT»,"«v.name»")'''
	
	def dispatch output(DynamicValue d) '''new DynamicValue("«d.type.name»","«d.name»")'''
	
	def operatorBT(String op) {
		if(op.startsWith('$') && operators.contains(op.substring(1)))
			return 'BT.S'
		else if(op.startsWith('?') && operators.contains(op.substring(1)))
			return 'BT.D'
		else if(operators.contains(op))
			return 'BT.Bot'
		else throw new Error('Unhandled operator')
	}

	def removeBT(String op) {
		if(op.startsWith('$') || op.startsWith('?')) op.substring(1)
		else op
	}

	List<String> operators = newArrayList('<','>','==','+','-','*','/')
	
}