package com.javaconcepts.unitTesting.junit;

public class JUnitTestSuiteDemoClass {

	private String message;

	// Constructor
	// @param message to be printed
	public JUnitTestSuiteDemoClass(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}

	// add "Hi!" to the message
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
