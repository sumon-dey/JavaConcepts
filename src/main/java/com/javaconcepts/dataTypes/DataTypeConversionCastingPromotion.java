package com.javaconcepts.dataTypes;

/**
 * Data Type Conversion, Date Type Casting and Automatic Type Promotion in
 * Expressions:
 * 
 * If the data types are compatible and the destination data type is larger than
 * the source data type, then "Automatic Type Conversion(Widening Type
 * Conversion/Implicit Type Casting)" takes place e.g. from byte to int. But if
 * the data types are not compatible with each other, then "Data Type
 * Casting(Narrowing Type Conversion/Explicit Type Casting)" has to be used to
 * explicitly convert from one data type to another e.g. int to byte, int to
 * String etc.
 * 
 * @author Sumon Dey
 *
 */
public class DataTypeConversionCastingPromotion {

	public static void main(String[] args) {
		wideningTypeConversion();
		narrowingTypeConversion();
		automaticTypePromotionInExpressions();
	}

	/*
	 * Widening Type Conversion (Automatic Type Conversion/Implicit Type Casting).
	 * This conversion does not require to declare casting explicitly. byte -> short
	 * -> int -> long -> float -> double
	 */
	/*
	 * Conditions: The two types are compatible and The destination type is larger
	 * than the source type
	 */
	private static void wideningTypeConversion() {
		byte myByteValue1 = 114;
		short myShortValue1 = myByteValue1;
		int myIntValue1 = myShortValue1;
		long myLongValue1 = myIntValue1;
		float myFloatValue1 = myLongValue1;
		double myDoubleValue1 = myFloatValue1;
		System.out.println("***Widening Type Casting***");
		System.out.println("The variable myByteValue1 of type byte has value of: " + myByteValue1);
		System.out.println("The variable myShortValue1 of type short has value of: " + myShortValue1);
		System.out.println("The variable myIntValue1 of type int has value of: " + myIntValue1);
		System.out.println("The variable myLongValue1 of type long has value of: " + myLongValue1);
		System.out.println("The variable myFloatValue1 of type float has value of: " + myFloatValue1);
		System.out.println("The variable myDoubleValue1 of type double has value of: " + myDoubleValue1);
		System.out.println("***************************************************************");
	}

	/*
	 * Narrowing Type Conversion (Explicit Type Casting). In this type of casting it
	 * mandatorily requires you to declare casting explicitly. byte <- short <- int
	 * <- long <- float <- double
	 */
	private static void narrowingTypeConversion() {
		double myDoubleValue2 = 34.34633355632;
		float myFloatValue2 = (float) myDoubleValue2;
		long myLongValue2 = (long) myFloatValue2;
		int myIntValue2 = (int) myLongValue2;
		short myShortValue2 = (short) myIntValue2;
		byte myByteValue2 = (byte) myShortValue2;

		System.out.println("***Narrowing Type Casting***");
		System.out.println("The variable myDoubleValue2 of type double has value of: " + myDoubleValue2);
		System.out.println("The variable myFloatValue2 of type float has value of: " + myFloatValue2);
		System.out.println("The variable myLongValue2 of type long has value of: " + myLongValue2);
		System.out.println("The variable myIntValue2 of type int has value of: " + myIntValue2);
		System.out.println("The variable myShortValue2 of type short has value of: " + myShortValue2);
		System.out.println("The variable myByteValue2 of type byte has value of: " + myByteValue2);
		System.out.println("***************************************************************");

		/*
		 * Conversion from "float/double" to "int" (Truncation - the fractional
		 * component is lost)
		 */
		double myDoubleValue3 = 453.24555552;
		float myFloatValue3 = 532.43F;
		int myFirstIntValue3 = (int) myDoubleValue3;
		int mySecondIntValue3 = (int) myFloatValue3;
		System.out.println("After truncation of double, the int value is: " + myFirstIntValue3);
		System.out.println("After truncation of float, the int value is: " + mySecondIntValue3);
		System.out.println("***************************************************************");

		/* Reduced Modulo (The remainder of an integer division) */
		int myFirstIntValue4 = 130;
		byte myByteValue3 = (byte) myFirstIntValue4;
		System.out.println("After reduced modulo: " + myByteValue3);
		System.out.println("***************************************************************");
	}

	/*
	 * Automatic Type Promotion in Expressions:
	 * 
	 * Type Promotion Rules in Expressions:- All "byte","short","char" values are
	 * promoted to "int" in expression. If one operand is "long", the whole
	 * expression is promoted to "long". If one operand is "float", the whole
	 * expression is promoted to "float". If one operand is "double", the whole
	 * expression is promoted to "double".
	 */
	private static void automaticTypePromotionInExpressions() {
		byte a = 20;
		byte b = 30;
		byte c = 40;
		/*
		 * Below bytes a and b are promoted to int and then multiplication took place.
		 */
		int result = a * b / c;
		System.out.println("After type promotion and expression evaluation: " + result);
		System.out.println("***************************************************************");
		// c=c*2;
		/*
		 * the above commented-out statement will throw compile error since the data
		 * type of c is byte, but the expression promotes type of c to int and then
		 * multiplies with 2 which results in an int. It requires "casting" (like below)
		 */
		c = (byte) (c * 2);
		System.out.println("After casting, the value of c is: " + c);
		System.out.println("***************************************************************");
	}

}
