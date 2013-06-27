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
import dk.sdu.mmmi.tjep.tJ.LocalAssign
import dk.sdu.mmmi.tjep.tJ.FieldAssign
import dk.sdu.mmmi.tjep.tJ.This

class Printer {
	
	def dispatch output(Program p) '''
	package «p.pkgname»
  	«FOR t:p.types»
  	«t.output»
  	«ENDFOR»
  	'''
  	
  	// Binding time annotations
  	
  	def dispatch outputBT(Static b) '''S'''

	def dispatch outputBT(Dynamic b) '''D'''
  	
  	def dispatch outputBT(Member m) '''«IF m.bt!=null»«m.bt.outputBT»:«ENDIF»'''
  	
  	def dispatch outputBT(Statement s) '''«IF s.bt!=null»«s.bt.outputBT»:«ENDIF»'''
  	
  	def dispatch outputBT(AnnotatedExpr e) '''«IF e.bt!=null»«e.bt.outputBT»«ENDIF»'''
  	
	// Top level

  	def dispatch output(Primitive p) '''
  	primitive «p.name»;
  	'''
  	
  	def dispatch output(Clazz c) '''
  	class «c.name» extends «c.base.name» {
  		«FOR m:c.members»
  		«m.output»
  		«ENDFOR»
  	}
  	'''
  	
	// Members

  	def dispatch output(Field f) '''
  	«f.outputBT»«IF f.final»final «ENDIF»«f.type.name» «f.name»;
  	'''
  	
  	def dispatch output(Method m) '''
  	«m.outputBT»«m.type.name» «m.name»(«FOR p:m.params SEPARATOR ','»«p.output»«ENDFOR») {
  		«FOR s:m.body»
  		«s.output»
  		«ENDFOR»
  	}
  	'''
  	
  	def dispatch output(Constructor c) '''
  	«c.outputBT»«c.clazz.name»(«FOR p:c.params SEPARATOR ','»«p.output»«ENDFOR») {
  		«FOR s:c.body»
  		«s.output»
  		«ENDFOR»
  	}
  	'''
  	
  	// Statements

	def dispatch output(VarDecl v) '''
		«v.outputBT»«v.type.name» «v.name»;
	'''
	
	def dispatch output(LocalAssign a) '''
		«a.outputBT»«a.name» = «a.rhs.output»;		
	'''
	
	def dispatch output(FieldAssign a) '''
		«a.outputBT»«IF a.object==null»this«ELSE»«a.object»«ENDIF»«a.name» = «a.rhs.output»;		
	'''
	
	def dispatch output(Condition c) '''
		«c.outputBT»if(«c.cond.output») {
			«FOR s:c.thenBody»
			«s.output»
			«ENDFOR»
		} else {
			«FOR s:c.elseBody»
			«s.output»
			«ENDFOR»
		}
	'''
	
	def dispatch output(While w) '''
		«w.outputBT»while(«w.cond.output») {
			«FOR s:w.body»
			«s.output»
			«ENDFOR»
		}
	'''

	def dispatch output(Return r) '''
		«r.outputBT»return «r.exp.output»;
	'''

	def dispatch output(SingleExpr s) '''
		«s.outputBT»«s.exp.output»;
	'''

	// Expressions

	def dispatch output(AnnotatedExpr x) '''«x.outputBT» «x.exp.output»'''

	def dispatch output(This t) '''this'''

	def dispatch output(LiftExp e) '''lift «e.exp.output»'''

	def dispatch output(MethodCall c) '''«c.target.output»«c.argument.output»'''

	def dispatch output(ObjectOp o) '''«IF o.object!=null»«o.object»«ELSE»this«ENDIF».«o.name»'''

	def dispatch output(EList<Expr> args) '''«IF args!=null»«FOR a:args BEFORE '(' SEPARATOR ',' AFTER ')'»«a.output»«ENDFOR»«ENDIF»'''	
	
	def dispatch output(Parameter p) '''«IF p.bt!=null»«p.bt.outputBT»: «ENDIF»«p.type.name» «p.name»'''
	
	def dispatch output(Instantiation i) '''«i.outputBT»new «i.type.name»«i.argument.output»'''
	
	def dispatch output(BinOp b) '''«IF b.rhs==null»«b.lhs.output»«ELSE»(«b.lhs.output»«b.op»«b.rhs.output»)«ENDIF»'''
	
	def dispatch output(Constant c) '''«c.value»'''

	def dispatch output(VarRef v) '''«IF v.bt!=null»«v.bt.output»«ENDIF»«v.name»'''
	
	def dispatch output(DynamicValue d) '''dynamic(«d.type.name»)'''
}