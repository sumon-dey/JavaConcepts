/*Data Type Conversion, Type Casting and Automatic Type Promotion in Expressions*/
package com.javaconcepts.dataTypes;

public class DataTypeConversionCastingPromotion {

	public static void main(String[] args) {
		/*
		 * Widening Type Conversion (Automatic Type Conversion/Implicit Type
		 * Casting). This conversion does not require to declare casting
		 * explicitly. byte -> short -> int -> long -> float -> double
		 */
		// Conditions-
		// The two types are compatible and
		// The destination type is larger than the source type
		byte myByteValue1 = 114;
		short myShortValue1 = myByteValue1;
		int myIntValue1 = myShortValue1;
		long myLongValue1 = myIntValue1;
		float myFloatValue1 = myLongValue1;
		double myDoubleValue1 = myFloatValue1;
		System.out.println("***Widening Type Casting***");
		System.out.println("The variable of type byte has value of: " + myByteValue1);
		System.out.println("The variable of type short has value of: " + myShortValue1);
		System.out.println("The variable of type int has value of: " + myIntValue1);
		System.out.println("The variable of type long has value of: " + myLongValue1);
		System.out.println("The variable of type float has value of: " + myFloatValue1);
		System.out.println("The variable of type double has value of: " + myDoubleValue1);
		System.out.println("***************************************************************");

		/*
		 * Narrowing Type Conversion (Explicit Type Casting). In this type of
		 * casting it mandatorily requires you to declare casting explicitly.
		 * byte <- short <- int <- long <- float <- double
		 */
		double myDoubleValue2 = 34.34633355632;
		float myFloatValue2 = (float) myDoubleValue2;
		long myLongValue2 = (long) myFloatValue2;
		int myIntValue2 = (int) myLongValue2;
		short myShortValue2 = (short) myIntValue2;
		byte myByteValue2 = (byte) myShortValue2;

		System.out.println("***Narrowing Type Casting***");
		System.out.println("The variable of type double has value of: " + myDoubleValue2);
		System.out.println("The variable of type float has value of: " + myFloatValue2);
		System.out.println("The variable of type long has value of: " + myLongValue2);
		System.out.println("The variable of type int has value of: " + myIntValue2);
		System.out.println("The variable of type short has value of: " + myShortValue2);
		System.out.println("The variable of type byte has value of: " + myByteValue2);
		System.out.println("***************************************************************");

		// Converting from "float/double" to "int" (Truncation)
		double myDoubleValue3 = 453.24555552;
		float myFloatValue3 = 532.43F;
		int myFirstIntValue3 = (int) myDoubleValue3;
		int mySecondIntValue3 = (int) myFloatValue3;
		System.out.println("After truncation of double, the int value is: " + myFirstIntValue3);
		System.out.println("After truncation of float, the int value is: " + mySecondIntValue3);
		System.out.println("***************************************************************");

		// Reduced Modulo (The remainder of an integer division)
		int myFirstIntValue4 = 130;
		byte myByteValue3 = (byte) myFirstIntValue4;
		System.out.println("After reduced modulo: " + myByteValue3);
		System.out.println("***************************************************************");

		automaticTypePromotionInExpressions();
	}

	// Automatic Type Promotion in Expressions
	private static void automaticTypePromotionInExpressions() {
		// Type Promotion Rules in Expressions -
		// All "byte","short","char" values are promoted to "int"
		// If one operand is "long", the whole expression is promoted to "long"
		// If one operand is "float", the whole expression is promoted to
		// "float"
		// If one operand is "double", the whole expression is promoted to
		// "double"
		byte a = 20;
		byte b = 30;
		byte c = 40;
		int result = a * b / c;
		// here, bytes a and b are promoted to int and then multiplication took
		// place
		System.out.println("After type promotion and expression evaluation: " + result);
		System.out.println("***************************************************************");
		// c=c*2; -> This will throw compile error since the data type of c is
		// byte, but the expression promotes type of c to int and then
		// multiplied with 2 which results in an int. It needed to be "cast".
		c = (byte) (c * 2);
		System.out.println("After casting, the value of c is: " + c);
		System.out.println("***************************************************************");
	}

}
