/*Control Statements*/
package com.javaconcepts.controlStatements;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {

		// Selection Statements
		ifElseIf();
		switchStatement();

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

	// switch
	private static void switchStatement() {
		/*
		 * switch-case statement - works with some primitive data types (byte, short,
		 * int, char), enumerations/enums, String data type and Wrapper classes like
		 * Integer, Byte, Short, Character
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month name:");
		String month = scanner.nextLine();
		// The expression within the switch must resolve to byte, short, int,
		// char, enum and String
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("You are in January.");
			break;
		case "february":
			System.out.println("You are in February.");
			break;
		case "march":
			System.out.println("You are in March.");
			break;
		case "april":
			System.out.println("You are in April.");
			break;
		case "may":
			System.out.println("You are in May.");
			break;
		case "june":
			System.out.println("You are in June.");
			break;
		case "july":
			System.out.println("You are in July.");
			break;
		case "august":
			System.out.println("You are in August.");
			break;
		case "september":
			System.out.println("You are in September.");
			break;
		case "october":
			System.out.println("You are in October.");
			break;
		case "november":
			System.out.println("You are in November.");
			break;
		case "december":
			System.out.println("You are in December.");
			break;
		default:
			System.out.println("You have not entered the correct month name.");
			break; // "break" in default is optional
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
