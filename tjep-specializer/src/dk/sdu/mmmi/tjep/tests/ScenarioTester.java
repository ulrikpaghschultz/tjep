package dk.sdu.mmmi.tjep.tests;

import java.util.List;

import dk.sdu.mmmi.tjep.Scenario;

public abstract class ScenarioTester {

	public abstract List<Scenario> getScenarios();
	
	public void testScenarios(boolean verbose) {
		List<Scenario> scenarios = getScenarios();
		System.out.println("Beginning test: "+this.getClass().getName());
		for(Scenario scenario: scenarios) {
			System.out.println("Scenario: "+scenario.getClass().getName());
			scenario.specialize();
			String assertResult = scenario.checkAssertion(verbose);
			if(assertResult==null)
				System.out.println("  specialized correctly");
			else {
				System.out.println("Assertion failed: "+assertResult);
				System.out.println("Result:");
				System.out.println(scenario.getSpecializedScenario());
				System.out.println(scenario.getSpecializedProgram());
			}
		}
		
	}
	
}
