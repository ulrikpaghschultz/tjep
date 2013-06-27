package dk.sdu.mmmi.tjep.generator;

import com.google.common.collect.Iterables;
import dk.sdu.mmmi.tjep.generator.JavaInstantiator;
import dk.sdu.mmmi.tjep.generator.Printer;
import dk.sdu.mmmi.tjep.tJ.Program;
import dk.sdu.mmmi.tjep.tJ.Scenario;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class TJGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
    Iterator<Program> _iterator = _filter.iterator();
    final Program p = _iterator.next();
    ArrayList<Scenario> _arrayList = new ArrayList<Scenario>();
    final ArrayList<Scenario> scenarios = _arrayList;
    EList<Scenario> _scenarios = p.getScenarios();
    scenarios.addAll(_scenarios);
    for (final Scenario s : scenarios) {
      String _pkgname = p.getPkgname();
      String _plus = (_pkgname + "/");
      String _name = s.getName();
      String _string = _name.toString();
      String _plus_1 = (_plus + _string);
      String _plus_2 = (_plus_1 + ".java");
      CharSequence _processJ = this.processJ(s, p);
      fsa.generateFile(_plus_2, _processJ);
    }
  }
  
  public CharSequence process(final Scenario s, final Program p) {
    Printer _printer = new Printer();
    CharSequence _output = _printer.output(p);
    return _output;
  }
  
  public CharSequence processJ(final Scenario s, final Program p) {
    JavaInstantiator _javaInstantiator = new JavaInstantiator();
    CharSequence _output = _javaInstantiator.output(p, s);
    return _output;
  }
}
