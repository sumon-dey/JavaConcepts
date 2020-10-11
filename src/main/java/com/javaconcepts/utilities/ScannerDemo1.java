package com.javaconcepts.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo1 {
	/*
	 * "Scanner" reads formatted input and convert it into its binary form. Scanner
	 * can be used to read input from console, file, string or any other source that
	 * implements the "Readable" and "ReadableByteChannel" interfaces. A scanner can
	 * be created for a String, an InputStream, a File or any object that implements
	 * the "Readable" or "ReadableByteChannel" interfaces.
	 */
	public static void main(String[] args) {
		try {
			// FileReader(since it implements the Readable interface)
			FileReader fileReader = new FileReader("./files/SampleTextFile1.txt");
			Scanner scanner1 = new Scanner(fileReader);
			while (scanner1.hasNextLine()) {
				System.out.println(scanner1.nextLine());
			}
			scanner1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*************************************************************");

		// String
		String str1 = "Coding is fun!";
		Scanner scanner2 = new Scanner(str1);
		while (scanner2.hasNextLine()) {
			System.out.println(scanner2.nextLine());
		}
		scanner2.close();
		System.out.println("*************************************************************");

		// System.in(since System.in is an object of type "InputStream")
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String myEnteredText = scanner3.nextLine();
		System.out.println("My entered text from the keyboard is: " + myEnteredText);
		scanner3.close();
		System.out.println("*************************************************************");
	}

}
