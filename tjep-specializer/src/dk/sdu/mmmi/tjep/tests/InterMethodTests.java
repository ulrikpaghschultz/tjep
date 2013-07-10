package dk.sdu.mmmi.tjep.tests;

import java.util.Arrays;
import java.util.List;

import dk.sdu.mmmi.tjep.Scenario;
import power.PowerCube;
import test_intramethod.DynamicLoop;
import test_intramethod.NestedDynamicConditional;
import test_intramethod.NestedStaticConditional;
import test_intramethod.OneAddition;
import test_intramethod.Propagation;
import test_intramethod.SimpleDynamicConditional;
import test_intramethod.SimpleMethodsStaticData;
import test_intramethod.StaticConditional;
import test_intramethod.StaticLoop;
import test_intramethod.StaticLoopWithVar;

public class InterMethodTests extends ScenarioTester {

	private static Scenario[] scenarios = new Scenario[] { 
		new SimpleMethodsStaticData()
		};
	
	public static void main(String argv[]) {
		new InterMethodTests().testScenarios(false);
	}

	@Override
	public List<Scenario> getScenarios() {
		return Arrays.asList(scenarios);
	}
	
}
