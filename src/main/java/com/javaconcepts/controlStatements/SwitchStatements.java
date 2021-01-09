package com.javaconcepts.controlStatements;

import java.util.Scanner;

public class SwitchStatements {

	public void switchStatement() {
		/*
		 * switch-case statement - works with some primitive data types (byte, short,
		 * int, char), their Wrapper classes (Byte, Short, Integer, Character),
		 * enumerations/enums and String.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month name:");
		String month = scanner.nextLine();
		// The expression within the switch must resolve to byte, short, int,
		// char, their wrapper class (Byte, Short, Integer, Character), enum and String
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
			break;
		// "break" in case labels and default label is optional. But it is preferred to
		// use "break" in the "default" even though it is optional there. Also,
		// "default" can be used in the middle of the "case" sequences too, and need not
		// be necessarily at the last.
		}

		/*
		 * Note: Both "switch" argument and "case" label do not support "null". Using
		 * null will throw compilation error. e.g. switch(null){ case null:
		 * System.our.println("null check"); break; }
		 */

		caseValueCompileTimeConstant();
		System.out.println("***************************************************************");

	}

	public void caseValueCompileTimeConstant() {
		final String value = "Pen";
		String item = "Stationery";
		switch (item) {
		case value:
			// This will throw compile error if the string ("value") is not declared as
			// "final"
			System.out.println("Stationery is Pen.");
			break;
		default:
			System.out.println("Stationery is something else.");
			break;
		}

	}

}
