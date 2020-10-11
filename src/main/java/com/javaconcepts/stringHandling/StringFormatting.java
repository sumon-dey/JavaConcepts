/*String Format*/
package com.javaconcepts.stringHandling;

import java.util.Formatter;

public class StringFormatting {
	/*
	 * The java string format() method returns the formatted string by given
	 * locale, format and arguments.
	 */
	public static void main(String[] args) {
		/* Java String Format specifiers */
		/* %a, %b, %c, %d, %e, %f, %g, %h, %n, %o, %s, %t, %x */

		/* String Value */
		System.out.println(String.format("My favorite word is: %s", "Creativity"));
		/* Integer Value */
		System.out.println(String.format("My favorite number is: %d", 22));
		/* Float Value */
		System.out.println(String.format("Example of a float value is: %f", 47.522));
		/* Hexadecimal Value */
		System.out.println(String.format("Example of a hexadecimal value is: %x", 1110));
		/* Char value */
		System.out.println(String.format("Example of a character is: %c", '\u00AE'));
		System.out.println("***************************************************************");

		/* Argument Index */
		System.out.println(String.format("The name out of the three values is: %2$s, age is: %1$d, location is: %3$s",
				42, "Sam", "LA"));
		System.out.println("***************************************************************");

		/* Setting padding and width for Integers and Floats */
		System.out.println(String.format("|%10d|", 7463));
		System.out.println(String.format("|%-10d|", 7463));
		System.out.println(String.format("|%010d|", 7463));
		System.out.println(String.format("|% d|", 7463));
		System.out.println(String.format("|%,d|", 12044848));
		System.out.println(String.format("|%.4f|", 32.334345784637));
		System.out.println(String.format("|%32.12f|", 32.33434));
		System.out.println(String.format("The value of PI is: %f", Math.PI));
		System.out.println("***************************************************************");

		/* String and Character Conversion */
		System.out.println(String.format("%s=%d", "Your age", 51));
		System.out.printf("My name is: %s%n", "Sam");
		System.out.println(String.format("|%30s|", "Hello World"));
		System.out.println(String.format("|%-30s|", "Hello World"));
		System.out.println(String.format("|%.8s|", "Hello World"));
		System.out.println(String.format("|%30.5s|", "Hello World"));
		System.out.println("***************************************************************");

		/* Creating a Formatter and linking it to StringBuilder */
		StringBuilder stringBuilder = new StringBuilder();
		Formatter formatter = new Formatter(stringBuilder);
		formatter.format("The value of PI = %f%n", Math.PI);
		System.out.print(stringBuilder.toString());

	}

}
