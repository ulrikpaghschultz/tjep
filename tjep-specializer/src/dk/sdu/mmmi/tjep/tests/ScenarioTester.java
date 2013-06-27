package dk.sdu.mmmi.tjep.tests;

import dk.sdu.mmmi.tjep.Scenario;

public class ScenarioTester {

	public void testScenarios(Scenario[] scen, boolean verbose) {
		System.out.println("Beginning test");
		for(int i=0; i<scen.length; i++) {
			Scenario scenario = scen[i];
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
