package com.javaconcepts.controlStatements;

/**
 * Control Statements:
 * 
 * Control Statements directs the flow of execution to advance and branch based
 * on changes to the state of the program. Control Statements in Java can be put
 * into the following 3 categories: 1) Selection 2) Iteration 3) Jump
 * 
 * 
 * @author Sumon Dey
 *
 */
public class ControlStatements {

	public static void main(String[] args) {

		// Selection Statements
		ifElseIf();
		SwitchStatements switchStatements = new SwitchStatements();
		switchStatements.switchStatement();

		// Jump Statement (break, continue, return)
		breakStatement();
		breakLabelStatement();
		continueStatement();
		returnStatement();
	}

	// If, else-if and nested if
	private static void ifElseIf() {
		/*
		 * if statement - checks for condition. If condition returns boolean true it
		 * executes the code within. For single statement within the if condition, curly
		 * braces is not required.
		 */
		String morningAffirmation = "Today is my day and it will be good";
		boolean wokeUpEarly = true;
		boolean hadGoodSleep = true;
		if (wokeUpEarly && hadGoodSleep) {
			System.out.println("Feeling Fresh.");
		}
		System.out.println("***************************************************************");

		/* nested if statement - if statements within if block */
		if (wokeUpEarly) {
			if (hadGoodSleep && morningAffirmation.startsWith("Today is my day")) {
				System.out.println("Feeling Fresh and Good.");
			}
		}
		System.out.println("***************************************************************");

		/* if else statement */
		wokeUpEarly = true;
		hadGoodSleep = false;
		if (wokeUpEarly && hadGoodSleep) {
			System.out.println("Feeling Fresh.");
		} else {
			System.out.println("Need to get more motivation.");
		}
		System.out.println("***************************************************************");

		/* if-else if-else statement */
		wokeUpEarly = true;
		hadGoodSleep = false;
		if (wokeUpEarly && hadGoodSleep) {
			System.out.println("Feeling Fresh.");
		} else if (wokeUpEarly && !hadGoodSleep) {
			System.out.println("Need to have good sleep.");
		} else {
			System.out.println("Need to get more motivation.");
		}
		System.out.println("***************************************************************");
	}

	// break
	private static void breakStatement() {
		for (int i = 0; i < 100; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("i: " + i);
		}
		System.out.println("***************************************************************");
	}

	// break label
	private static void breakLabelStatement() {
		int k = 0;
		outer: for (int i = 0; i < 4; i++) {
			inner: for (int j = 0; j < 5; j++) {
				System.out.println(k++);
				if (k == 5) {
					break outer;
				}
			}
		}
		System.out.println("***************************************************************");
	}

	// continue statement
	private static void continueStatement() {
		int k = 0;
		outer: for (int i = 0; i < 5; i++) {
			inner: for (int j = 0; j < 5; j++) {
				if (j > 3) {
					continue outer;
				}
				System.out.print((i * j) + " ");
				k++;
			}
			System.out.println("");
		}
		System.out.println("\n***************************************************************");
	}

	// return statement
	private static void returnStatement() {
		boolean check = true;
		System.out.println("Before the return");
		if (check) {
			return; // return to the caller (to the run-time system JRE)
		}
		System.out.println("After the return"); // This won't execute
	}

}
