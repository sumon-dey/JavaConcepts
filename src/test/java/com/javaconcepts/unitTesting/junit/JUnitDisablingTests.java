package com.javaconcepts.unitTesting.junit;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitDisablingTests {

	// @Ignore -> marks that the test should be disabled. This is useful when the
	// underlying code has been changed and the test case has not yet been adapted
	// or if the execution time of this test is too long to be included. It is best
	// practice to provide the optional description, why the test is disabled.
	@Ignore
	@Test
	public void disabledMethod1() {
		System.out.println("This method will not get executed.");
	}

	@Ignore("This is disabled to demonstrate the disabled functionality of JUnit")
	@Test
	public void disabledMethod2() {
		System.out.println("This method will not get executed.");
	}

	@Test
	public void enabledMethod() {
		System.out.println("This method will get executed.");
	}

}
