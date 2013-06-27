package dk.sdu.mmmi.tjep.generator;

import dk.sdu.mmmi.tjep.generator.Builder;
import dk.sdu.mmmi.tjep.tJ.Program;
import dk.sdu.mmmi.tjep.tJ.Scenario;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TestB extends Builder {
  public void t1(final Program p) {
    final EList<Scenario> s1 = p.getScenarios();
    final Function1<Scenario,Scenario> _function = new Function1<Scenario,Scenario>() {
        public Scenario apply(final Scenario x) {
          return x;
        }
      };
    final List<Scenario> s2 = ListExtensions.<Scenario, Scenario>map(s1, _function);
  }
}
