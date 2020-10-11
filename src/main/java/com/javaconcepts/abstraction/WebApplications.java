package com.javaconcepts.abstraction;

public class WebApplications implements IApplications {

	@Override
	public void deviceRequirement() {
		System.out.println("Web Applications can run on devices like laptop, desktop and mobile.");
	}

	@Override
	public void runsOn() {
		System.out.println("Web Applications run on the Browsers.");
	}

	@Override
	public void internetRequirement() {
		System.out.println("Web Applications need active Internet connection to run.");
	}

	@Override
	public void usageOfSystemResources() {
		System.out.println("Web Applications can use system resources only as much as provided to the Browser.");
	}

	@Override
	public void appInstallation() {
		System.out.println("Users don't need to install Web Applications from any app store.");
	}

}
