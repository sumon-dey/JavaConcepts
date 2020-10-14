package com.javaconcepts.unitTesting.testng;

import org.testng.annotations.Test;

public class TestNGInvocationCount {

	// invocationCount tells the number of times the test is to be executed
	@Test(invocationCount = 10)
	public void sum() {
		int a = 22, b = 32;
		System.out.println("Sum of a and b: " + (a + b));
	}

}
