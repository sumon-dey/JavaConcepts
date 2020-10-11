package com.javaconcepts.abstraction;

public class NativeMobileApplications extends MobileApplications {

	@Override
	public void deviceRequirement() {
		System.out.println("Native Mobile Applications can run only on mobile devices.");
	}

	@Override
	public void runsOn() {
		System.out.println("Native Mobile Applications run on the Device itself and not on the Browsers.");
	}

	@Override
	public void internetRequirement() {
		System.out.println("Native Mobile Applications can run without an active internet.");
	}

	@Override
	public void usageOfSystemResources() {
		System.out.println("Native Mobile Applications can use system resources as much as required.");
	}

	@Override
	public void appInstallation() {
		System.out.println(
				"Users need to install Native Mobile Applications from the app stores or can create on their own.");
	}

}
