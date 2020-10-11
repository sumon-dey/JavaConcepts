/*Chained Exceptions*/
package com.javaconcepts.exceptionHandling;

public class ChainedExceptionsTest {

	public static void main(String[] args) {
		try {
			ChainedExceptions.chainedException();
		} catch (Exception e) {
			System.out.println("Caught: " + e);
			System.out.println("Original Cause: " + e.getCause());
		}

	}

}

class ChainedExceptions {
	public static void chainedException() {
		NullPointerException nullPointerException = new NullPointerException();
		nullPointerException.initCause(new ArithmeticException("Caused due to Arithemetic Exception"));
		throw nullPointerException;
	}
}
