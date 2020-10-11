/*Java Loops Demo*/
package com.javaconcepts.loops;

import java.util.Scanner;

public class Looping {
	/*
	 * Looping is used in Java to execute a set of instructions repeatedly for a
	 * certain amount of time (finite loop) or infinitely (infinite loop).
	 */
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		forLoop();
		whileLoop();
		doWhileLoop();
		forEachLoop();
	}

	/* for loop */
	private static void forLoop() {
		System.out.println("Enter the number till which you want the multiplication table of 2: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= number; i++) {
			System.out.println("2 times " + i + " is: " + (i * 2));
		}
		System.out.println("***************************************************************");
	}

	/* while loop */
	private static void whileLoop() {
		System.out.println("Enter the number till which you want the multiplication table of 3: ");
		int number = scanner.nextInt();
		int count = 1;
		scanner.nextLine();
		while (true) {
			System.out.println("3 times " + count + " is: " + (count * 3));
			count++;
			if (count > number)
				break;
		}
		System.out.println("***************************************************************");
	}

	/*
	 * do-while loop (The set of instructions will get executed at least once
	 * before checking condition)
	 */
	private static void doWhileLoop() {
		int number = 0;
		do {
			System.out.println("The number is: " + number);
			number++;
		} while (number <= 0);
		System.out.println("***************************************************************");
	}

	/*
	 * for-each loop (Enhanced for loop) - Helps to iterate through the elements
	 * in an Array or Collection
	 */
	private static void forEachLoop() {
		double[] myDoubleArray = { 4.223, 74.433224, 63.632, 6322.42, 44.66433, 84.3332, 543.77 };
		for (double eachElement : myDoubleArray) {
			System.out.println(eachElement + " is an element in the array.");
		}
		System.out.println("***************************************************************");
	}

}
