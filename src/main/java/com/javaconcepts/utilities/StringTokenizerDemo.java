package com.javaconcepts.utilities;

import java.util.StringTokenizer;

/*Parsing -> It is the division of text into a set of discrete parts (tokens) which in a certain sequence can convey a 
 * semantic meaning */

/*The "StringTokenizer" class implements the "Enumeration" interface*/

/*Delimiters -> They are the characters that separate the tokens. Each character in the delimiters string is considered
 * as a valid delimiter e.g. ",;:" sets the delimiter to a comma, semicolon and colon. The default set of delimiters
 * consists of the whitespace characters like space, tab, form feed, new line and carriage return*/
public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str = "Country=India;" + "Capital=Delhi;" + "Population=130cr;" + "Climate=Tropical;";
		// here "=;" is the delimiter
		StringTokenizer stringTokenizer = new StringTokenizer(str, "=;");
		System.out.println("The number of tokens is: " + stringTokenizer.countTokens());
		// "hasMoreElements()" can also be used here
		while (stringTokenizer.hasMoreTokens()) {
			// "nextElement()" can also be used here but it return Object instead of String
			String key = stringTokenizer.nextToken();
			String value = stringTokenizer.nextToken();
			System.out.println(key + "\t" + value);
		}
	}

}
