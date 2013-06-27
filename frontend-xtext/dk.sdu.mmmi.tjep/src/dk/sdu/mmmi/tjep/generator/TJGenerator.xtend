/*
 * generated by Xtext
 */
package dk.sdu.mmmi.tjep.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import dk.sdu.mmmi.tjep.tJ.Program
import dk.sdu.mmmi.tjep.tJ.Scenario
import java.util.ArrayList
import dk.sdu.mmmi.tjep.tJ.TJFactory
import org.eclipse.xtext.EcoreUtil2

class TJGenerator implements IGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val Program p = resource.allContents.toIterable.filter(typeof(Program)).iterator.next // just one
		val scenarios = new ArrayList<Scenario>()
		scenarios.addAll(p.scenarios) // precompute, avoids iterating over changing model
		for(s: scenarios) {
			//fsa.generateFile(s.name.toString() + ".tj",process(s,p))
			fsa.generateFile(p.pkgname+'/'+s.name.toString() + ".java",processJ(s,p))
		}
		
  	}
  	
  	def process(Scenario s, Program p) { new Printer().output(p) }
  	
  	def processJ(Scenario s, Program p) { new JavaInstantiator().output(p,s) }

/* 	def transform(Program p) {
  		System::out.println("p.#types="+p.types.size)
  		val q = TJFactory::eINSTANCE.createProgram()
  		for(s: p.scenarios) q.scenarios.add(EcoreUtil2::cloneIfContained(s))
  		for(t: p.types) q.types.add(EcoreUtil2::cloneIfContained(t))
  		System::out.println("p.#types="+p.types.size)
  		q
  	}*/
}

