/*Java programs perform I/O through "Streams"*/
/*A Stream is an abstraction that either produces or consumes information. It is linked 
 * to a physical device by the Java I/O system*/

/*Java provides Stream-based I/O defined in java.io and its subpackages*/
/*Java provides Buffer-based I/O defined in java.nio and its subpackages*/

/*Java defines 2 types of Streams - Byte Stream and Character stream*/
/*Byte stream -> for handling input and output of bytes e.g when reading and writing binary data*/
/*Character stream -> for handling Unicode characters as input and output*/
package com.javaconcepts.ioAndSerialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOBasics1 {

	public static void main(String[] args) throws IOException {
		// Reading Console Input
		readingCharacters();
		System.out.println("*********************************************");
		readingStrings();
		System.out.println("*********************************************");
	}

	// Reading characters
	public static void readingCharacters() throws IOException {
		char c;

		// converting byte stream coming from System.in to character stream
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.println("Enter characters, press 'q' to quit:");
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'q');
	}

	// Reading Strings
	public static void readingStrings() throws IOException {
		String str;

		// converting byte stream coming from System.in to character stream
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.println("Enter lines of text:");
		System.out.println("Enter \"stop\" to quit");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (str.equalsIgnoreCase("stop"));
	}

}
