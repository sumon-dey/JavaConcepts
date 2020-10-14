package com.javaconcepts.unitTesting.junit;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitTestSuiteDemoTest1 {

	String message = "Sam";
	JUnitTestSuiteDemoClass messageUtil = new JUnitTestSuiteDemoClass(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

}
