/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SimpMusicStandaloneSetup extends SimpMusicStandaloneSetupGenerated {

	def static void doSetup() {
		new SimpMusicStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
