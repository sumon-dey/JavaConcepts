package com.javaconcepts.abstraction;

public class MobileApplications implements IApplications {

	@Override
	public void deviceRequirement() {
		System.out.println(
				"Mobile Applications can run on devices like laptop, desktop and mobile depending on whether it is native or hybrid.");
	}

	@Override
	public void runsOn() {
		System.out.println(
				"Mobile Applications run on the Mobile Devices as well as on the Browsers depending on whether it is native or hybrid.");
	}

	@Override
	public void internetRequirement() {
		System.out.println(
				"Mobile Applications may or may not need an active internet depending on whether it is native or hybrid.");
	}

	@Override
	public void usageOfSystemResources() {
		System.out.println("Mobile Applications can use system resources depending on whether it is native or hybrid.");
	}

	@Override
	public void appInstallation() {
		/* No code here */
	}

}
