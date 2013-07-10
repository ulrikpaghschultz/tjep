package dk.sdu.mmmi.tjep.tests;

import dk.sdu.mmmi.tjep.Scenario;
import power.PowerCube;
import test_heap_intramethod.HeapDynamicConditional;
import test_heap_intramethod.HeapObjectResidualization;
import test_heap_intramethod.HeapSimplePropagation;
import test_heap_intramethod.HeapSimpleUpdate;
import test_intramethod.DynamicLoop;
import test_intramethod.NestedDynamicConditional;
import test_intramethod.NestedStaticConditional;
import test_intramethod.OneAddition;
import test_intramethod.Propagation;
import test_intramethod.SimpleDynamicConditional;
import test_intramethod.StaticConditional;
import test_intramethod.StaticLoop;
import test_intramethod.StaticLoopWithVar;

public class HeapIntraMethodTests extends ScenarioTester {

	private static Scenario[] scenarios = new Scenario[] { 
		new HeapObjectResidualization(), new HeapSimplePropagation(), new HeapSimpleUpdate(),
		new HeapDynamicConditional()
		};
	
	public static void main(String argv[]) {
		new HeapIntraMethodTests().testScenarios(scenarios,false);
	}
	
}
