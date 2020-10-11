/*User Input*/
package com.javaconcepts.miscellaneous;

import java.util.Scanner;

public class UserInput {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		sumTotal();
	}

	/*
	 * Using Scanner Class, printing out the sum of 10 integers entered in the
	 * console(command line environment) by the user. The program will accept
	 * only integers and will discard the non-integers (if entered).
	 */
	public static void sumTotal() {
		System.out.println("Enter 10 Integers:");
		int sum = 0, count = 0;
		while (true) {
			if (scanner.hasNextInt()) {
				// Reading user input (if integer) and adding it to the sum
				sum += scanner.nextInt();
				count++; // Incrementing the count by 1 for each entered integer
				if (count >= 10)
					break;
			} else {
				System.out.println("The entered number is not an integer. Please enter an integer.");
			}
			scanner.nextLine(); // To handle next line character (Enter Key)
		}
		System.out.println("The sum of the 10 entered integers are: " + sum);
		scanner.close(); // The used scanner object is closing the stream
	}

}
