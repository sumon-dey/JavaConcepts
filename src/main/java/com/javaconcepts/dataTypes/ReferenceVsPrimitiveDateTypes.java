/*Comparison between Primitive Data Types and Reference Data Types*/
package com.javaconcepts.dataTypes;

import java.util.Arrays;

public class ReferenceVsPrimitiveDateTypes {
	/*
	 * Reference Data Types includes Annotation, Array, Class, Enumeration and
	 * Interface. Reference Data Type holds the reference (address) of the
	 * dynamically generated objects.
	 */
	public static void main(String[] args) {
		valueDataType();
		referenceDataType();
	}

	private static void valueDataType() {
		int myValue1 = 25;
		int myValue2 = myValue1;
		System.out.println("Before incrementing myValue1 by 2, the value of myValue1 is: " + myValue1);
		System.out.println("Before incrementing myValue1 by 2, the value of myValue2 is: " + myValue2);
		myValue1 += 2;
		System.out.println("After incrementing myValue1 by 2, the value of myValue1 is: " + myValue1);
		System.out.println("After incrementing myValue1 by 2, the value of myValue2 is: " + myValue2);
		System.out.println("***************************************************************");
	}

	private static void referenceDataType() {
		int[] myArray1 = new int[5];
		int[] myArray2 = myArray1;
		System.out.println("Before incrementing myArray1's first element value, the value of myArray1 is: "
				+ Arrays.toString(myArray1));
		System.out.println("Before incrementing myArray1's first element value, the value of myArray2 is: "
				+ Arrays.toString(myArray2));
		myArray1[0] += 2;
		System.out.println("After incrementing myArray1's first element value, the value of myArray1 is: "
				+ Arrays.toString(myArray1));
		System.out.println("After incrementing myArray1's first element value, the value of myArray2 is: "
				+ Arrays.toString(myArray2));
		System.out.println("***************************************************************");
	}

}
