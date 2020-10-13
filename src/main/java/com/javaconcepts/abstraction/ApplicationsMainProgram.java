package com.javaconcepts.abstraction;

public class ApplicationsMainProgram {

	public static void main(String[] args) {
		IApplicationSpecification newApplication = new WebApplications();
		newApplication.deviceRequirement();
		newApplication.runsOn();
		newApplication.internetRequirement();
		newApplication.usageOfSystemResources();
		newApplication.appInstallation();
		System.out.println("**************************************************************************");

		newApplication = new MobileApplications();
		newApplication.deviceRequirement();
		newApplication.runsOn();
		newApplication.internetRequirement();
		newApplication.usageOfSystemResources();
		System.out.println("**************************************************************************");

		newApplication = new NativeMobileApplications();
		newApplication.deviceRequirement();
		newApplication.runsOn();
		newApplication.internetRequirement();
		newApplication.usageOfSystemResources();
		newApplication.appInstallation();
		System.out.println("**************************************************************************");

	}

}
