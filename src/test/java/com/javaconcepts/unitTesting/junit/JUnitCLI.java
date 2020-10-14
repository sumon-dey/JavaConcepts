package com.javaconcepts.unitTesting.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitCLI {
	// running the JUnit tests from the CLI
	/*
	 * The "org.junit.runner.JUnitCore" class provides the "runClasses()" method.
	 * This method allows us to run one or several tests classes. As a return
	 * parameter we receive an object of the type "org.junit.runner.Result". This
	 * object can be used to retrieve information about the tests.
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JUnitCommonAnnotations.class);
		System.out.println("***************************************************");
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}

}
