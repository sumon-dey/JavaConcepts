package com.javaconcepts.unitTesting.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGEnabledDisabledSkipped {

	@Test(enabled = true)
	public void enabledTest() {
		System.out.println("Inside the enabled test");
	}

	@Test(enabled = false)
	public void disabledTest() {
		System.out.println("Inside the disabled test");
	}

	@Test
	public void skippedTest() {
		System.out.println("Inside the skipped test");
		throw new SkipException("Skipping - this test is not ready for execution");
	}

}
