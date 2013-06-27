
package dk.sdu.mmmi.tjep;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TJStandaloneSetup extends TJStandaloneSetupGenerated{

	public static void doSetup() {
		new TJStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

