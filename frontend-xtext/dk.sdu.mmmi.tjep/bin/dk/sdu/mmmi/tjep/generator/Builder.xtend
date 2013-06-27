package dk.sdu.mmmi.tjep.generator

import org.eclipse.emf.ecore.EObject
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EStructuralFeature
import dk.sdu.mmmi.tjep.tJ.Program
import dk.sdu.mmmi.tjep.tJ.Scenario
import java.util.List
import dk.sdu.mmmi.tjep.tJ.Type
import dk.sdu.mmmi.tjep.tJ.Expr
import dk.sdu.mmmi.tjep.tJ.Instantiation

class Builder {
/* 
	def program((ProgramValue)=>void initializer) {
		val result = new ProgramValue
		initializer.apply(result)
		return result
	}
	
	def scenario(String name, (ScenarioValue)=>void initializer) {
		val result = new ScenarioValue
		result.name = name
		initializer.apply(result)
		return result as Scenario
	}
	
	def scenario(Scenario source) {
		return scenario(source.name) [
			target = source.target
			//method = source.method
			//argument = source.argument
		]
	}
	*/
	def <T> map2(EList<T> x, (T)=>T fn) { x }
}

class TestB extends Builder {
	def t1(Program p) {
		val s1 = p.scenarios
		val s2 = s1.map([x | x])
	}

}
/* 
class ProgramValue extends NilEObject implements Program {
	@Property EList<Scenario> scenarios
	@Property EList<Type> types
}

class ScenarioValue extends NilEObject implements Scenario {
	@Property String name
	@Property Instantiation target
	@Property String method
	@Property EList<Expr> argument
}
*/
class NilEObject implements EObject {

	override eAllContents() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eClass() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eContainer() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eContainingFeature() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eContainmentFeature() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eContents() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eCrossReferences() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eGet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eGet(EStructuralFeature feature, boolean resolve) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eInvoke(EOperation operation, EList<? extends Object> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eIsProxy() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eIsSet(EStructuralFeature feature) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eResource() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eSet(EStructuralFeature feature, Object newValue) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eUnset(EStructuralFeature feature) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eAdapters() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eDeliver() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eNotify(Notification notification) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override eSetDeliver(boolean deliver) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}
