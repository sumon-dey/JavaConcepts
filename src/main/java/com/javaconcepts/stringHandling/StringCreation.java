/*Creation of String using different types of constructors*/
package com.javaconcepts.stringHandling;

public class StringCreation {

	public static void main(String[] args) {
		// 1st way (Empty constructor)
		String str1 = new String();
		System.out.println("str1: " + str1);

		// 2nd way (from Character Array)
		char[] chars2 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		String str2 = new String(chars2);
		System.out.println("str2: " + str2);

		// 3rd way (Character Array with start index)
		char[] chars3 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
		String str3 = new String(chars3, 2, 4);
		// where, 2 is the start index and 4 is the number of characters to be picked
		System.out.println("str3: " + str3);

		// 4th way (Passing another String object in the constructor)
		String str4 = new String(str3);
		System.out.println("str4: " + str4);

		// 5th way (from Byte Array)
		byte[] byteArray = { 65, 66, 67, 68, 69, 70 };
		String str5 = new String(byteArray);
		String str6 = new String(byteArray, 2, 4);
		System.out.println("str5: " + str5);
		System.out.println("str6: " + str6);

		// 6th way (most common)
		String str7 = "abc";
		System.out.println("str7: " + str7);

	}

}
