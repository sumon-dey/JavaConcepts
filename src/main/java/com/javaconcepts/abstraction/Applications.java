package com.javaconcepts.abstraction;

public class Applications {

	public static void main(String[] args) {
		IApplications runApplication = new WebApplications();
		runApplication.deviceRequirement();
		runApplication.runsOn();
		runApplication.internetRequirement();
		runApplication.usageOfSystemResources();
		runApplication.appInstallation();
		System.out.println("**************************************************************************");

		runApplication = new MobileApplications();
		runApplication.deviceRequirement();
		runApplication.runsOn();
		runApplication.internetRequirement();
		runApplication.usageOfSystemResources();
		System.out.println("**************************************************************************");

		runApplication = new NativeMobileApplications();
		runApplication.deviceRequirement();
		runApplication.runsOn();
		runApplication.internetRequirement();
		runApplication.usageOfSystemResources();
		runApplication.appInstallation();
		System.out.println("**************************************************************************");

	}

}
