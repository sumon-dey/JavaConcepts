package com.javaconcepts.utilities;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
	/*
	 * The "Formatter" class helps to create formatted output. It provides format
	 * conversions that let us display numbers, strings,time and date in any format
	 * we like. The Formatter works by converting the binary form of data used by a
	 * program into formatted text which is stored in a buffer and can be retrieved
	 * by the program. The default Formatter() constructor uses the default locale
	 * and allocates a StringBuilder to hold the formatted output.
	 */
	/*
	 * Some format specifiers -> %s for String, %d for decimal integer, %f for
	 * decimal floating-point, %a for floating-point hexadecimal, %b for boolean, %c
	 * for character, %h for hashcode of the argument, %e for scientific notation,
	 * %o for octal integer, %n to insert a newline character %t for time and date,
	 * %x for Integer hexadecimal, %% to insert a % sign
	 */
	public static void main(String[] args) {
		// Formatting Numbers
		Formatter formatter1 = new Formatter();
		formatter1.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
		// 1st way of outputting (here, the toString() method is automatically called)
		System.out.println(formatter1);
		// 2nd way of outputting
		System.out.println(formatter1.toString());
		// 3rd way of outputting (The printf() method automatically uses Formatter to
		// create a Formatted String)
		System.out.printf("Formatting %s is easy %d %f", "with Java", 10, 98.6);
		formatter1.close();
		System.out.println("\n*************************************************************");

		Formatter formatter2 = new Formatter();
		for (double i = 1.23; i < 1.0e+6; i *= 100) {
			formatter2.format("%f %e", i, i);
			System.out.println(formatter2);
		}
		formatter2.close();
		System.out.println("*************************************************************");

		Formatter formatter3 = new Formatter();
		formatter3.format("Hex: %x, Octal: %o, Floating-point in Hex: %a", 196, 196, 512.0);
		System.out.println(formatter3);
		formatter3.close();
		System.out.println("*************************************************************");

		// Formatting Time and Date
		/*
		 * The formatter %t (for time and date) requires a suffix to describe the
		 * portion and precise format of the time or date desired.e.g. %tM where M
		 * indicates minutes in two-character field. The argument corresponding to the
		 * %t specifier must be of type Calendar, Date, Long, long or TemporalAccessor.
		 */
		Formatter formatter4 = new Formatter();
		Calendar cal = Calendar.getInstance();
		formatter4.format("%tr", cal);
		System.out.println(formatter4);
		formatter4.close();
		System.out.println("******************************************");

		Formatter formatter5 = new Formatter();
		formatter5.format("%tc", cal);
		System.out.println(formatter5);
		formatter5.close();
		System.out.println("******************************************");

		Formatter formatter6 = new Formatter();
		formatter6.format("%tl:%tM", cal, cal);
		System.out.println(formatter6);
		formatter6.close();
		System.out.println("******************************************");

		Formatter formatter7 = new Formatter();
		formatter7.format("%tB %tb %tm", cal, cal, cal);
		System.out.println(formatter7);
		formatter7.close();
		System.out.println("******************************************");

		// Escape Sequence formatters (%n and %%)
		Formatter formatter8 = new Formatter();
		formatter8.format("Hello %n%% Java");
		System.out.println(formatter8);
		formatter8.close();
		System.out.println("******************************************");

		// Specifying a Minimum Field Width with Formatter
		/*
		 * An integer placed between the % sign and the format conversion code acts as a
		 * "Minimum Field Width" specifier. This pads the output with spaces (by
		 * default) to ensure that it reaches a certain minimum length. If we want to
		 * pad with 0, we can place a "0" before the field-width specifier e.g. %05d.
		 * The field width specifier can be used with all format specifier excepts %n
		 */
		Formatter formatter9 = new Formatter();
		formatter9.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
		System.out.println(formatter9);
		formatter9.close();
		System.out.println("******************************************");

		// Specifying Precision with Formatter
		/*
		 * For example %10.4f displays a number at least 10 characters wide with 4
		 * decimal places
		 */
		// Format 4 decimal places
		Formatter formatter10 = new Formatter();
		formatter10.format("%.4f", 123.1234567);
		System.out.println(formatter10);
		formatter10.close();
		System.out.println("******************************************");

		// Format to 2 decimal places in a 16-character field
		Formatter formatter11 = new Formatter();
		formatter11.format("%16.2e", 123.1234567);
		System.out.println(formatter11);
		formatter11.close();
		System.out.println("******************************************");

		// Display at most 15 characters in a String
		Formatter formatter12 = new Formatter();
		formatter12.format("%.15s", "Formatting with Java is now easy.");
		System.out.println(formatter12);
		formatter12.close();
		System.out.println("******************************************");

		/*
		 * Format Flags -> The Formatter recognizes a set of format flags that lets you
		 * control various aspects of a conversion. A format flag follows the "%" in a
		 * format specification. They are "-", "#", "0", space, "+", "," and "("
		 */
		/*
		 * %-10.2f left-justifies a floating-point number ith two decimal places in a
		 * 10-character field
		 */
		Formatter formatter13 = new Formatter();
		// Right-justified by default
		formatter13.format("|%10.2f|", 123.123);
		System.out.println(formatter13);
		formatter13.close();
		// Now left-justify
		formatter13 = new Formatter();
		// Right-justified by default
		formatter13.format("|%-10.2f|", 123.123);
		System.out.println(formatter13);
		formatter13.close();
		formatter13 = new Formatter();
		formatter13.format("%+d", 200);
		System.out.println(formatter13);
		formatter13.close();
		formatter13 = new Formatter();
		formatter13.format("% d", 200);
		System.out.println(formatter13);
		formatter13.close();
		formatter13 = new Formatter();
		formatter13.format("%(d", -200);
		System.out.println(formatter13);
		formatter13 = new Formatter();
		formatter13.format("%,.2f", 4356783497.34);
		System.out.println(formatter13);
		formatter13.close();
		formatter13 = new Formatter();
		formatter13.format("%X", 250);
		System.out.println(formatter13);
		formatter13.close();
		System.out.println("******************************************");

		/*
		 * Argument Index -> using this we can explicitly control which argument a
		 * format specifier matches
		 */
		Formatter formatter14 = new Formatter();
		formatter14.format("%3$d %1$f %2$s", 23.2, "Hello", 30);
		System.out.println(formatter14);
		formatter14.close();
		formatter14 = new Formatter();
		formatter14.format("%d in hex is %1$x", 255);
		System.out.println(formatter14);
		formatter14.close();
		formatter14 = new Formatter();
		formatter14.format("%d in hex is %<x", 255);
		System.out.println(formatter14);
		formatter14.close();
		formatter14 = new Formatter();
		Calendar calendar = Calendar.getInstance();
		formatter14.format("Today is day %te of %<tB, %<tY", calendar);
		System.out.println(formatter14);
		formatter14.close();
		System.out.println("******************************************");
	}

}
