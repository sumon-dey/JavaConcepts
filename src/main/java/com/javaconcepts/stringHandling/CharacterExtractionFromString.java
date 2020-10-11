package com.javaconcepts.stringHandling;

public class CharacterExtractionFromString {

	public static void main(String[] args) {
		String str1 = "Hello World in Java";

		// Indexing starts at 0
		// charAt (To extract 1 character)
		char extractedSingleCharacter = str1.charAt(4);
		System.out.println("extractedSingleCharacter: " + extractedSingleCharacter);
		System.out.println("**********************************************");

		// getChars (To extract more than 1 characters and store them in a char array)
		int srcBegin1 = 4;
		int srcEnd1 = 10;
		char[] buf1 = new char[srcEnd1 - srcBegin1];
		str1.getChars(srcBegin1, srcEnd1, buf1, 0);
		System.out.println(buf1);
		System.out.println("**********************************************");

		// toCharArray (To take all the String characters into a character array)
		// Functionality same as "getChars"
		char[] buf2 = str1.toCharArray();
		System.out.println(buf2);
		System.out.println("**********************************************");

		// getBytes (To extract more than 1 characters and store them in a byte array)
		int srcBegin2 = 4;
		int srcEnd2 = 10;
		byte[] buf3 = new byte[srcEnd2 - srcBegin2];
		str1.getBytes(srcBegin2, srcEnd2, buf3, 0);
		System.out.println(buf3);
		System.out.println("**********************************************");

	}

}
