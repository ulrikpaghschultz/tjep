package dk.sdu.mmmi.tjep.examples;

import dk.sdu.mmmi.tjep.Scenario;
import power.PowerCube;

public class PowerCubeSpec {

	public static void main(String argv[]) {
		Scenario scenario = new PowerCube();
		scenario.specialize();
		System.out.println("Result:");
		System.out.println(scenario.getSpecializedProgram());
	}
	
}
