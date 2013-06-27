package dk.sdu.mmmi.tjep.tests;

import dk.sdu.mmmi.tjep.Scenario;
import power.PowerCube;
import test_intramethod.DynamicLoop;
import test_intramethod.NestedDynamicConditional;
import test_intramethod.NestedStaticConditional;
import test_intramethod.OneAddition;
import test_intramethod.Propagation;
import test_intramethod.SimpleDynamicConditional;
import test_intramethod.StaticConditional;
import test_intramethod.StaticLoop;
import test_intramethod.StaticLoopWithVar;

public class IntraMethodTests extends ScenarioTester {

	private static Scenario[] scenarios = new Scenario[] { 
		new OneAddition(), new Propagation(), 
		new StaticLoop(), new StaticLoopWithVar(), new DynamicLoop(),
		new StaticConditional(), new NestedStaticConditional(), 
		new SimpleDynamicConditional(), new NestedDynamicConditional()
		};
	
	public static void main(String argv[]) {
		new IntraMethodTests().testScenarios(scenarios,false);
	}
	
}
