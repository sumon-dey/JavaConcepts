package com.javaconcepts.arrays;

/**
 * A jagged array, is an array of arrays of which the member arrays can be of
 * different lengths, producing rows of jagged edges when visualized as output.
 * 
 * @author Sumon Dey
 *
 */
public class JaggedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 4, 5, 6, 7, 8, 9 };
		int[] arr3 = { 3, 1 };

		int[][] combinedArray = { arr1, arr2, arr3 };

		for (int i = 0; i < combinedArray.length; i++) {
			for (int j = 0; j < combinedArray[i].length; j++) {
				System.out.print(" " + combinedArray[i][j]);
			}
			System.out.println();
		}

	}

}
