/* Primitive Data Types or Simple Data Types*/
package com.javaconcepts.dataTypes;

public class DataTypesAndLiterals {

	public static void main(String[] args) {
		/*
		 * The primitive data types in java can be classified into Integers (byte,
		 * short, int, long) Floating-Point Numbers (float, double), Characters (char)
		 * and Boolean (boolean). Though Java is object-oriented, primitive data types
		 * are not object-oriented
		 */

		// *** Integers - whole valued signed numbers (positive & negative)***//

		// byte (takes 8-bits and value ranges from -128 to 127)
		// useful when working with a stream of data from a network or file/ raw
		// binary data

		/*
		 * Suffix -> long, float and double data types have suffixes L or l, F or f and
		 * D or d respectively (preferably the uppercases are used). If no suffices are
		 * used with these data types, then they are considered to be of "int" data type
		 * for integral type and "double" for non-integral type. The data types "byte",
		 * "short" and "char" do not have any specific suffices.
		 */

		byte myByteValue = 127;
		System.out.println("byte: " + myByteValue);
		System.out.println("*********************************************");

		// short (takes 16-bits and value ranges from -32768 to 32767)
		short myShortValue = 32767;
		System.out.println("short: " + myShortValue);
		System.out.println("*********************************************");

		/*
		 * int (takes 32-bits and value ranges from -2,147,483,648 to 2,147,483, 647)
		 */
		// The data types "byte", "short" and "char" are promoted to "int" in an
		// expression and arithmetic operations can be performed on that
		int myIntValue1 = 37728892;
		int myIntValue2 = 123_456_789; // Integer literal using underscores
		int myIntValue3 = 123__456__789; // Integer literal using underscores
		int myIntValue4 = 0b1010; // integer literal using binary
		System.out.println("int: " + myIntValue1);
		System.out.println("int: " + myIntValue2);
		System.out.println("int: " + myIntValue3);
		System.out.println("int: " + myIntValue4);
		System.out.println("*********************************************");

		/*
		 * long (takes 64-bits and value ranges from -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807)
		 */
		// need to append "L" at the end of the literal to specify as long
		long myLongValue = 332238487574374L;
		System.out.println("long: " + myLongValue);
		System.out.println("*********************************************");

		// *** Floating-Point Numbers - Real Numbers with Fractional
		// Precisions***//

		// Java implements the standarad IEEE-754 set of floating point types
		// and operators
		/*
		 * float (specifies a single-precision value, takes 32-bits, need to append "f"
		 * at the end to specify as float, 6 to 7 significant decimal digits, typically
		 * used when we need a fractional component but don't require a larger degree of
		 * precision)
		 */
		float myFloatValue1 = 24.346436F;
		System.out.println("float: " + myFloatValue1);
		System.out.println("*********************************************");

		/*
		 * double (specifies a double-precision value, takes 64-bits, putting "d" at the
		 * end is optional, 15 significant decimal digits, faster than single precision)
		 */
		double myDoubleValue1 = 422.5552643337774D;
		// double literal using underscores
		double myDoubleValue2 = 422.55_52_6433_37774D;
		double myDoubleValue3 = 422.555__2643337__774D;
		double myDoubleValue4 = 42__2.55526_4333_7774D;
		System.out.println("double: " + myDoubleValue1);
		System.out.println("double: " + myDoubleValue2);
		System.out.println("double: " + myDoubleValue3);
		System.out.println("double: " + myDoubleValue4);
		System.out.println("*********************************************");

		// Characters - Symbols in a character set like letters and numbers
		// Java uses Unicode character-set to represent characters
		// Unicode defines a fully international character set that can
		// represent all of the characters found in all human languages
		// (including the ASCII - ranging from 0 to 127)
		/* char (takes 16-bits, 0 to 65536(unsigned - no negative chars)) */
		char myChar1 = 's';
		char myChar2 = '\u00A9'; // hexadecimal notation of Unicode
		char myChar3 = '\141'; // octal notation of Unicode
		char myChar4 = 88; // Unicode or ASCII value for X
		System.out.println("char: " + myChar1 + myChar2);
		System.out.println("char: " + (char) ('s' + 1));
		// 's' is raised to "int" type and added to 1, the addition is then
		// casted to "char" which prints out "t" (can be used as an integer type
		// to perform integer operations)
		System.out.println("char: " + myChar3);
		System.out.println("char: " + myChar4);
		System.out.println("*********************************************");

		// Escape Sequences for Character Literals
		System.out.println(" \"Java\""); // Double Quote
		System.out.println(" \'is\'"); // Single Quote
		System.out.println(" a\\"); // Backslash
		System.out.println(" statically\r"); // Carriage Return
		System.out.println(" typed\n"); // New Line or Line Feed
		System.out.println(" programming\tlanguage\b\f"); // Tab, Backspace and
															// Form Feed
		System.out.println("*********************************************");

		// Boolean - to represent logical values "true" and "false"
		/* boolean (value can be "true" or "false" only) */
		boolean myBooleanValue = true;
		System.out.println("boolean: " + myBooleanValue);
		System.out.println("boolean: " + !myBooleanValue);
		System.out.println("*********************************************");

		// Difference between float and double primitive data types
		float diffFloatValue = 5F / 3F;
		double diffDoubleValue = 5D / 3D;
		System.out.println("The variable of type float gives: " + diffFloatValue);
		System.out.println("The variable of type double gives: " + diffDoubleValue);
		System.out.println("*********************************************");

		// Conversion of double to float with 3 significant digits after decimal
		double doubleValueToConvert = 41.746380532;
		System.out.println(String.format("%.3f", doubleValueToConvert));
		System.out.println("*********************************************");

	}

}
