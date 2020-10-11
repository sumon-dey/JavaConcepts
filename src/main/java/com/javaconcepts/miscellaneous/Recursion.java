/*Recursive Method and Recursion*/
package com.javaconcepts.miscellaneous;

public class Recursion {

	public static void main(String[] args) {
		int number = 6;
		System.out.println("Factorial of 6 is: " + factorial(number));
	}

	// method to calculate factorial using recursion
	private static int factorial(int number) {
		if (number == 1) {
			System.out.println("Number is now: 1");
			return 1;
		} else {
			System.out.println("Number is now: " + number);
			int num = factorial(number - 1) * number;
			return num;
		}
	}

}
