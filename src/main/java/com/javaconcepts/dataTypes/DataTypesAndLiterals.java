package com.javaconcepts.dataTypes;

/**
 * Primitive Data Types or Simple Data Types:
 * 
 * The primitive data types in java can be classified into Integers (byte,
 * short, int, long) Floating-Point Numbers (float, double), Characters (char)
 * and Boolean (boolean). Though Java is object-oriented, primitive data types
 * are not object-oriented.
 * 
 * @author Sumon Dey
 *
 */
public class DataTypesAndLiterals {

	public static void main(String[] args) {
		integerDataTypes();
		floatingPointDataTypes();
		characterDataTypes();
		booleanDataTypes();
	}

	private static void integerDataTypes() {
		/*
		 * Integers: They are whole valued signed numbers (positive and negative). The
		 * Integer literals can be in the form of decimal(Base 10, e.g.1,2,3),
		 * octal(Base 8, e.g. 07,02), Binary(e.g. OB1010) and Hexadecimal (Base 16, e.g.
		 * 0A0F).
		 */

		/*
		 * byte (takes 8-bits and value ranges from -128 to 127). Useful when working
		 * with a stream of data from a network or file or just raw binary data.
		 */

		/*
		 * Suffix: "long", "float" and "double" data types have suffixes L or l, F or f
		 * and D or d respectively (preferably the upper cases are used). If no suffices
		 * are used with these data types, then they are considered to be of "int" data
		 * type for integral type and "double" for non-integral type. The data types
		 * "byte", "short" and "char" do not have any specific suffices.
		 */

		byte myByteValue1 = 127;
		byte myByteValue2 = -128;
		byte myByteValue3 = 22;
		System.out.println("myByteValue1: " + myByteValue1);
		System.out.println("myByteValue2: " + myByteValue2);
		System.out.println("myByteValue3: " + myByteValue3);
		System.out.println("*********************************************");

		/* short (takes 16-bits storage and value ranges from -32768 to 32767) */
		short myShortValue1 = 32767;
		short myShortValue2 = -32768;
		short myShortValue3 = 452;
		System.out.println("myShortValue1: " + myShortValue1);
		System.out.println("myShortValue2: " + myShortValue2);
		System.out.println("myShortValue3: " + myShortValue3);
		System.out.println("*********************************************");

		/*
		 * int (takes 32-bits storage and value ranges from -2,147,483,648 to 2,147,483,
		 * 647)
		 */
		/*
		 * The data types "byte", "short" and "char" are promoted to "int" when an
		 * expression is evaluated and arithmetic operations can be performed on that.
		 */
		/*
		 * We can use underscores in the literals. This helps us to read large literals.
		 * During compilation, the underscores are ignored. They cannot be used at the
		 * beginning or at the end of the literals, but can be used in-between.
		 */
		int myIntValue1 = 37728892;
		int myIntValue2 = 123_456_789; // Integer literal using underscores
		int myIntValue3 = 123__456__789; // Integer literal using underscores
		int myIntValue4 = 0b1010; // integer literal using binary
		System.out.println("myIntValue1: " + myIntValue1);
		System.out.println("myIntValue2: " + myIntValue2);
		System.out.println("myIntValue3: " + myIntValue3);
		System.out.println("myIntValue4: " + myIntValue4);
		System.out.println("*********************************************");

		/*
		 * long (takes 64-bits and value ranges from -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807). Need to append "L" or "l" at the end of the
		 * literal to specify as long.
		 */
		long myLongValue = 332238487574374L;
		System.out.println("myLongValue: " + myLongValue);
		System.out.println("*********************************************");
	}

	private static void floatingPointDataTypes() {
		/*
		 * Floating-Point Numbers: They are Real Numbers with Fractional Precisions.
		 * They can be expressed in either "Standard Notation" or "Scientific Notation".
		 */

		/*
		 * Java implements the standard IEEE-754 set of floating point types and
		 * operators. There are 2 kinds of floating-point types - 1) float 2) double
		 */

		/*
		 * float (specifies a single-precision value, takes 32-bits of storage). We need
		 * to append "F" or "f" at the end to specify as float, 6 to 7 significant
		 * decimal digits, typically used when we need a fractional component but don't
		 * require a larger degree of precision.
		 */

		/*
		 * We can use underscores in the literals. This helps us to read large literals.
		 * During compilation, the underscores are ignored. They cannot be used at the
		 * beginning or at the end of the literals, but can be used in-between.
		 */
		float myFloatValue1 = 24.346436F; // Standard Notation
		float myFloatValue2 = 3.24E12F; // Scientific Notation
		float myFloatValue3 = 0X31.3P21F; // In Hexadecimal form
		System.out.println("myFloatValue1: " + myFloatValue1);
		System.out.println("myFloatValue2: " + myFloatValue2);
		System.out.println("myFloatValue3: " + myFloatValue3);
		System.out.println("*********************************************");

		/*
		 * double (specifies a double-precision value, takes 64-bits, putting "D" or "d"
		 * at the end is optional, 15 significant decimal digits, faster than single
		 * precision float)
		 */
		double myDoubleValue1 = 422.5552643337774D;
		double myDoubleValue2 = 422.55_52_6433_37774D; // double literals using underscores
		double myDoubleValue3 = 422.555__2643337__774D; // double literals using adjacent underscores
		double myDoubleValue4 = 42__2.55526_4333_7774D; // double literals using single and adjacent underscores
		System.out.println("myDoubleValue1: " + myDoubleValue1);
		System.out.println("myDoubleValue2: " + myDoubleValue2);
		System.out.println("myDoubleValue3: " + myDoubleValue3);
		System.out.println("myDoubleValue4: " + myDoubleValue4);
		System.out.println("*********************************************");

		/* Difference between float and double */
		float diffFloatValue = 5F / 3F;
		double diffDoubleValue = 5D / 3D;
		System.out.println("The variable of type float gives: " + diffFloatValue);
		System.out.println("The variable of type double gives: " + diffDoubleValue);
		System.out.println("*********************************************");

		/* Conversion of double to float with 3 significant digits after decimal */
		double doubleValueToConvert = 41.746380532;
		System.out.println(String.format("%.3f", doubleValueToConvert));
		System.out.println("*********************************************");
	}

	private static void characterDataTypes() {
		/*
		 * Characters: They are the symbols in a character set like letters and numbers.
		 * Java uses Unicode character-set to represent characters. Unicode defines a
		 * fully international character set that can represent all of the characters
		 * found in all human languages (including the ASCII - ranging from 0 to 127).
		 * char (takes 16-bits storage, Range is from 0 to 65536, unsigned - no negative
		 * chars)
		 */
		char myChar1 = 's';
		char myChar2 = '\u00A9'; // "char" literal using hexadecimal notation of Unicode
		char myChar3 = '\141'; // "char" literal using octal notation of Unicode
		char myChar4 = 88; // Unicode or ASCII value for X
		System.out.println("myChar1 + myChar2 = : " + (myChar1 + myChar2));
		/*
		 * Below 's' is raised to "int" data type and added to 1, the addition is then
		 * casted to "char" which prints out "t" (can be used as an integer type to
		 * perform integer operations)
		 */
		System.out.println("New value: " + (char) ('s' + 1));
		System.out.println("myChar3: " + myChar3);
		System.out.println("myChar4: " + myChar4);
		System.out.println("*********************************************");

		/*
		 * Escape Sequences for Character Literals: They are used to signal an
		 * alternative interpretation of a series of characters. In Java, a character
		 * preceded by a backslash (\) is an Escape Sequence and has special meaning to
		 * the Java compiler.
		 */
		System.out.println(" \"Java\""); // Double Quote
		System.out.println(" \'is\'"); // Single Quote
		System.out.println(" a\\"); // Backslash
		System.out.println(" statically\r"); // Carriage Return
		System.out.println(" typed\n"); // New Line or Line Feed
		System.out.println(" programming\tlanguage\b\f"); // Whitespaces (Tab, Backspace and
															// Form Feed)
		System.out.println("*********************************************");
	}

	private static void booleanDataTypes() {
		/* Boolean: It represents the logical values "true" and "false" */
		/*
		 * boolean (value can be either "true" or "false"). This type is returned by all
		 * the relational operators and it is also required by the conditional
		 * expressions that dictate the Control Statements (like "for" and "if")
		 */
		boolean myBooleanValue = true;
		System.out.println("myBooleanValue: " + myBooleanValue);
		System.out.println("!myBooleanValue: " + !myBooleanValue);
		System.out.println("*********************************************");
	}

}
