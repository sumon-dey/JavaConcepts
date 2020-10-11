package com.javaconcepts.collection;

import java.util.Arrays;

public class ArraysClassDemo {
	/*
	 * The "Arrays" class provides various methods that are useful when working with
	 * arrays. These methods help to bridge the gap between collections and arrays.
	 */
	public static void main(String[] args) {
		// initialize and allocate an array
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = -3 * i;
		}

		// display the array
		System.out.print("Original Contents: ");
		display(array);

		// using the "sort" method of Arrays
		Arrays.sort(array);
		System.out.print("Sorted: ");
		display(array);

		// using the "fill" method of Arrays
		Arrays.fill(array, 2, 6, -1);
		System.out.print("After fill(): ");
		display(array);

		// again using the "sort" method of Arrays
		Arrays.sort(array);
		System.out.print("After sorting again: ");
		display(array);

		// using "binarySearch" method to find -9
		System.out.print("The value -9 is at location: ");
		int index=Arrays.binarySearch(array, -9);
		System.out.println(index);

	}

	public static void display(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
