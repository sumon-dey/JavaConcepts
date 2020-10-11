/*Catching multiple exceptions in a single Catch clause*/
package com.javaconcepts.exceptionHandling;

import java.util.Scanner;

public class MultiCatchExceptionTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice: 1 or 2");
		int choice = scanner.nextInt();
		scanner.nextLine();
		try {
			switch (choice) {
			case 1:
				int a = 42;
				int b = 0;
				System.out.println("The division of a and b results in: " + a / b);
				break;
			case 2:
				int[] myArray = new int[4];
				myArray[5] = 24;
				break;
			default:
				System.out.println("Choice is not 1 or 2");
				break;
			}
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught Exception -> " + e);
		}
	}

}
