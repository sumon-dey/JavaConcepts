/*String Data Type*/
package com.javaconcepts.stringHandling;

public class StringDataType {
	/* String is a sequence of single characters/char data type */
	public static void main(String[] args) {
		/*
		 * In Java, String is a Class. So, we can create a String object and
		 * pass the sequence of characters to its constructor. The String class
		 * has 12 overloaded constructors and is present in the java.lang
		 * package.
		 */
		String myFirstString = new String("This is a sample string");
		System.out.println(myFirstString);

		/*
		 * Since String is heavily used, Java has given us the flexibility of
		 * not creating String objects every time we want to create a String.
		 */
		String mySecondString = ".. and this is the sample string being extended.";
		System.out.println(mySecondString);

		/*
		 * Concatenation (joining together the String sequences with String or
		 * other data types)
		 */
		String myOutputString = myFirstString + mySecondString;
		myOutputString += "\u00A9" + 2019;
		System.out.println(myOutputString);

		/*
		 * Handling of Special Characters (Escape Codes) like tab, new line,
		 * quotes and carriage return.
		 */
		System.out.println(myOutputString += "\t with a \"tab\" in between");
		myOutputString = myOutputString + " \nand the remaining sequence is contined from the next line.";
		System.out.println(myOutputString);

		/*
		 * Here java allocated space in the memory for the literal value "Sam".
		 * This area in memory is called the "String Constant Pool". The string
		 * constant pool sits inside a section of memory called the "heap".
		 */
		String employeeName = "Sam";

	}

}
