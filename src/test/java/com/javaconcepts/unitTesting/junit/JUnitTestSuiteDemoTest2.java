package com.javaconcepts.unitTesting.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitTestSuiteDemoTest2 {

	String message = "Sam";
	JUnitTestSuiteDemoClass messageUtil = new JUnitTestSuiteDemoClass(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}

}
