package com.javaconcepts.unitTesting.testng;

import org.testng.annotations.Test;

public class TestNGExpectedExceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		int a = 22;
		int b = a / 0;
		System.out.println("b is: " + b);
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void test2() {
		String str = "Dsh23";
		System.out.println(Integer.parseInt(str));
	}

}
