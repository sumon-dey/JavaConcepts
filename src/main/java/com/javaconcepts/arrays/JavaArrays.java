package com.javaconcepts.arrays;

import java.util.Arrays;

/**
 * Java Arrays
 * 
 * "Array" in Java is a type of data structure that can store elements of
 * similar data types (primitive or non- primitive). It is a group of like-typed
 * variables that are referred to by a common name. Arrays in java are
 * essentially objects and they are dynamically allocated. Arrays of any data
 * type can be created in one or more dimensions. "Index" is used to access any
 * specific element in an array.
 * 
 * @author Sumon Dey
 *
 */
public class JavaArrays {
	public static void main(String[] args) {

		/* Four ways to initialize an array */
		firstWayToInitializeArray();
		secondWayToInitializeArray();
		thirdWayToInitializeArray();
		fourthWayToInitializeArray();

		/*
		 * Multidimensional arrays are "arrays of arrays" with each element of the
		 * multidimensional array holding the reference of another array.
		 */
		firstArray2DExample();
		secondArray2DExample();
		array3DExample();
		pyramid();
		dynamicDimensionAllocation();
	}

	private static void firstWayToInitializeArray() {
		String[] daysInWeek = new String[7];
		daysInWeek[0] = "Sunday";
		daysInWeek[1] = "Monday";
		daysInWeek[2] = "Tuesday";
		daysInWeek[3] = "Wednesday";
		daysInWeek[4] = "Thursday";
		daysInWeek[5] = "Friday";
		daysInWeek[6] = "Saturday";
		System.out.println(Arrays.toString(daysInWeek));
		System.out.println(daysInWeek.getClass());
		System.out.println(daysInWeek.getClass().getSuperclass());
		System.out.println("***************************************************************");
	}

	private static void secondWayToInitializeArray() {
		/*
		 * An array initializer is a list of comma-separated expressions surrounded by
		 * curly braces.
		 */
		String[] myFriends = { "Sam", "Harry", "Tom", "Richard", "Peter", "Mike" };
		System.out.println(Arrays.toString(myFriends));
		System.out.println(myFriends.getClass());
		System.out.println(myFriends.getClass().getSuperclass());
		System.out.println("***************************************************************");
	}

	private static void thirdWayToInitializeArray() {
		double[] studentHeights = new double[] { 166.2, 182.0, 173.4, 175.6, 168.9, 190.2 };
		System.out.println(Arrays.toString(studentHeights));
		System.out.println(studentHeights.getClass());
		System.out.println(studentHeights.getClass().getSuperclass());
		System.out.println("***************************************************************");
	}

	private static void fourthWayToInitializeArray() {
		int myNumberTable[] = new int[9];
		for (int counter = 0; counter < myNumberTable.length; counter++) {
			myNumberTable[counter] = counter * 2;
		}
		System.out.println(Arrays.toString(myNumberTable));
		System.out.println("***************************************************************");
	}

	/* MultiDimensional Array - Example1 (with 2D Array) */
	private static void firstArray2DExample() {
		// Data is stored in row and column-based index (in matrix form)
		int[][] my2DArray = { { 12, 4, 6 }, { 66, 33, 2 }, { 6, 1, 5 } };
		for (int row = 0; row < my2DArray.length; row++) {
			for (int column = 0; column < my2DArray.length; column++) {
				System.out.print(my2DArray[row][column] + "\t");
			}
			System.out.println("");
		}
		System.out.println("***************************************************************");
	}

	/* MultiDimensional Array - Example2 (with 2D Array) */
	private static void secondArray2DExample() {
		int[][] my2DArray = new int[4][5];
		int i, j, k = 0;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				my2DArray[i][j] = k;
				k++;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(my2DArray[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("***************************************************************");
	}

	/* MultiDimensional Array - Example3 (with 3D Array) */
	private static void array3DExample() {
		/* Store Data */
		int[][][] my3DIntArray = new int[3][4][2];
		int x, y, z, num = 1;
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 4; y++) {
				for (z = 0; z < 2; z++) {
					my3DIntArray[x][y][z] = num;
					num++;
				}
			}
		}
		/* Display Data */
		for (x = 0; x < 3; x++) {
			for (y = 0; y < 4; y++) {
				for (z = 0; z < 2; z++) {
					System.out.print("my3DIntArray[" + x + "][" + y + "][" + z + "]=" + my3DIntArray[x][y][z] + "\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("***************************************************************");
	}

	/* Pyramid Pattern using Array */
	private static void pyramid() {
		/* Outer loop to handle number of rows (n in this case) */
		int n = 8;
		for (int i = 0; i < n; i++) {
			/*
			 * Inner loop to handle number spaces (values can be changed according to
			 * requirement)
			 */
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}
			/*
			 * Inner loop to handle number of columns (values change according to outer
			 * loop)
			 */
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("***************************************************************");
	}

	/*
	 * In the below code, Array capacity allocated dynamically for the second
	 * dimension in a 2D array
	 */
	private static void dynamicDimensionAllocation() {
		int[][] myDynamicArray = new int[4][];
		myDynamicArray[0] = new int[1];
		myDynamicArray[1] = new int[2];
		myDynamicArray[2] = new int[3];
		myDynamicArray[3] = new int[4];
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				myDynamicArray[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(myDynamicArray[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("***************************************************************");
	}
}
