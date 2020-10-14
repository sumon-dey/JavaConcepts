package com.javaconcepts.unitTesting.junit;

import org.junit.Test;

public class JUnitOtherAnnotations {

	// the below test fails if the method does not throw the named exception.
	@Test(expected = ArithmeticException.class)
	public void exceptionTest() {
		System.out.println("Inside the exceptionTest() method");
		int num = 24 / 0;
	}

	// the below test fails if the method takes longer than 5000 milliseconds.
	@Test(timeout = 5000)
	public void timeoutTest() {
		System.out.println("Inside the timeoutTest() method");
		try {
			Thread.sleep(4000);
			System.out.println("Waited for 4000 milliseconds (4 seconds)");
			Thread.sleep(6000);
			System.out.println("Waited for 6000 milliseconds (6 seconds)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
