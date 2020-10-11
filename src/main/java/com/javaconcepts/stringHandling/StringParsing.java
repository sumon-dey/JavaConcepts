/*String Parsing*/
package com.javaconcepts.stringHandling;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringParsing {

	public static void main(String[] args) {
		String presentYearinString = "2019";

		/* Parsing integer from string using the Integer Wrapper Class */
		int presentYearInInt = Integer.parseInt(presentYearinString);
		System.out.println("Present year is: " + presentYearinString + " and next year will be: "
				+ (presentYearInInt + 1) + " (if we enclose within parenthesis)");
		System.out.println("Present year is: " + presentYearinString + " and next year will be: " + presentYearInInt + 1
				+ " (if we don't enclose within parenthesis)");
		System.out.println("***************************************************************");

		/* Splitting a String into tokens */
		String mySampleString = "This sample string will be splitted based on whitespaces.";
		Pattern pattern = Pattern.compile("\\s");
		String[] output = pattern.split(mySampleString);
		for (int wordIndex = 0; wordIndex < output.length; wordIndex++) {
			System.out.println(output[wordIndex]);
		}
		System.out.println("***************************************************************");

		/*
		 * "StringTokenizer" allows us to specify a delimiter as a set of
		 * characters and matches any number or combination of those characters
		 * as a delimiter between tokens.
		 */
		String myText = "Now is the time for all good men and women...";
		StringTokenizer stringTokenizer = new StringTokenizer(myText);
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		/*
		 * By default, the StringTokenizer class uses standard whitespace
		 * characters e.g. carriage return, newline, and tab, as delimiters. We
		 * can also specify our own set of delimiter characters in the
		 * StringTokenizer constructor.
		 */

	}

}
