/*Superclass of all exceptions -> Throwable*/
/*Two Subclasses of Throwable -> "Exception" and "Error"*/
/*Subclass of Exception -> RuntimeException*/
/*"try" block, "catch" clause, "finally" block, throw, throws*/
package com.javaconcepts.exceptionHandling;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		try {
			Sample.demoProc1();
		} catch (ArithmeticException e) {
			System.out.println("Inside Catch Clause of the caller -> ArithemeticException Recaught: " + e);
		} finally {
			System.out.println("Inside finally block of the caller -> This will always get executed");
		}
		System.out.println("*******************************************************");
		try {
			Sample.demoProc2();
		} catch (InstantiationException e) {
			System.out.println("Inside Catch Clause of the caller -> InstantiationException Recaught: " + e);
		}
		System.out.println("*******************************************************");
	}
}

class Sample {
	// Unchecked (Runtime) Exception
	static void demoProc1() {
		try {
			int a = 24;
			int b = 0;
			int d = a / b;
			System.out.println("Inside Try Block -> This will never get executed");
		} catch (ArithmeticException e) {
			System.out.println("Inside Catch Clause -> ArithemeticException Caught: " + e);
			throw e;
		} catch (Exception e) {
			System.out.println("Inside Catch Clause -> Exception Caught: " + e);
			throw e;
		} finally {
			System.out.println("Inside finally block -> This will always get executed");
		}
	}

	// Checked (Compiletime) Exception
	static void demoProc2() throws InstantiationException {
		try {
			System.out.println("Inside Try Block -> Before creating and throwing a new InstantiationException object");
			throw new InstantiationException();
		} catch (InstantiationException e) {
			System.out.println("Inside Catch Clause -> InstantiationException Caught: " + e);
			throw e;
		}
	}
}
