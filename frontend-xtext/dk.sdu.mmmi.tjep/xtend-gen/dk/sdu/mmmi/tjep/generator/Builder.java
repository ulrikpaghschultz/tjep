package dk.sdu.mmmi.tjep.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class Builder {
  /**
   * def program((ProgramValue)=>void initializer) {
   * val result = new ProgramValue
   * initializer.apply(result)
   * return result
   * }
   * 
   * def scenario(String name, (ScenarioValue)=>void initializer) {
   * val result = new ScenarioValue
   * result.name = name
   * initializer.apply(result)
   * return result as Scenario
   * }
   * 
   * def scenario(Scenario source) {
   * return scenario(source.name) [
   * target = source.target
   * //method = source.method
   * //argument = source.argument
   * ]
   * }
   */
  public <T extends Object> EList<T> map2(final EList<T> x, final Function1<? super T,? extends T> fn) {
    return x;
  }
}
