package dk.sdu.mmmi.tjep.tests;

import java.util.ArrayList;
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
import test_intramethod.StaticConditional;
import test_intramethod.StaticLoop;
import test_intramethod.StaticLoopWithVar;

public class AllTests extends ScenarioTester {

	public static void main(String argv[]) {
		new AllTests().testScenarios(false);
	}

	@Override
	public List<Scenario> getScenarios() {
		ArrayList<Scenario> all = new ArrayList<Scenario>();
		all.addAll(new IntraMethodTests().getScenarios());
		all.addAll(new HeapIntraMethodTests().getScenarios());
		return all;
	}
	
}
