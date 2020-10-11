/*Creating custom exception*/
package com.javaconcepts.exceptionHandling;

public class CustomExceptionTest {

	public static void main(String[] args) {
		Framework myFramework = new Framework();
		try {
			myFramework.demoProc();
		} catch (Exception e) {
			System.out.println("Recaught -> " + e);
		}
	}

}

class Framework {
	public void demoProc() throws FrameworkException {
		try {
			String city1 = "New York";
			String city2 = "Minnesota";
			if (!city1.equals(city2)) {
				throw new FrameworkException("Cities are not same");
			}
		} catch (FrameworkException e) {
			System.out.println("Caught -> " + e);
			throw e;
		}
	}
}

/*
 * Custom Exception class extending the Exception class (can also extend the
 * RuntimeException class for creating custom exceptions during run time)
 */
class FrameworkException extends Exception {
	private String exceptionMessage;

	public FrameworkException() {

	}

	public FrameworkException(String message) {
		exceptionMessage = message;
	}

	// overriden "toString" method from the Object class
	@Override
	public String toString() {
		return "Framework Exception: " + exceptionMessage;
	}
}
