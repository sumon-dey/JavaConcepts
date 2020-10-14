package com.javaconcepts.unitTesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	// Assertion methods present in the TestNG Assert class ->
	// assertEquals, assertNotEquals, assertTrue, assertFalse, assertNull,
	// assertNotNull, assertSame, assertNotSame, assertThrows, fail

	/*
	 * Soft Assert:- It collects all errors during @Test but does not throw
	 * exception when an assert fails and would continue with the next step after
	 * the assert statement. If there is any exception and you want to throw it,
	 * then you need to use softAssert.assertAll() method as a last statement in
	 * the @Test and test suite will continue with the next @Test as it is.
	 * 
	 * Hard Assert:- It throws an AssertException immediately when an assert
	 * statement fails, the other steps in the same test case are skipped and the
	 * test suite continues execution of the next @Test as it is.
	 */
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void test1() {
		String a = "Hello ";
		String b = "World";
		// Hard Assert
		Assert.assertEquals("Hello World", a + b);
	}

	@Test
	public void test2() {
		String a = "Hello";
		String b = "World";
		// Hard Assert
		Assert.assertNotEquals("Hello World", a + b);
	}

	@Test
	public void test3() {
		boolean a = true;
		// Hard Assert
		Assert.assertTrue(a);
	}

	@Test
	public void softAssertionSampleTest() {
		System.out.println("Line 1");
		System.out.println("Line 2");
		// Soft Assert (with a custom failure message)
		softAssert.assertEquals(true, false, "A soft assert failure");
		System.out.println("Line 3");
		System.out.println("Line 4");
		// Soft Assert (without a custom failure message)
		softAssert.assertEquals(true, false);
		System.out.println("Line 5");

		// collecting all the thrown errors from the soft asserts
		// if the below line is not used, the soft assert will have no effect on the
		// Test Case execution status
		softAssert.assertAll();
	}

}
