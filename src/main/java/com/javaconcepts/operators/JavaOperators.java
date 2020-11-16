/*Java Operators*/
package com.javaconcepts.operators;

public class JavaOperators {
	/*
	 * Java Operators are used to perform operations on Variables and Values. The
	 * Value is called the "Operand" and the operation performed between the
	 * operands is defined by the Java Operators.
	 */
	public static void main(String[] args) {
		arithmeticOperator();
		assignmentOperator();
		unaryOperator();
		relationalOrComparisonOperator();
		logicalOperator();
		ternaryOrConditionalOperator();
		bitwiseOperator1();
		bitwiseOperator2();
		shiftOperator();
		instanceOfOperator();
	}

	// instanceOf operator
	private static void instanceOfOperator() {
		/*
		 * Type Checking - to check if an object is an instance of a class, a subclass
		 * or an interface.
		 */
		JavaOperators javaOperators = new JavaOperators();
		System.out.println(javaOperators instanceof JavaOperators);
		System.out.println("***************************************************************");
	}

	// shift operator
	private static void shiftOperator() {
		int a = 0x0005;
		int b = -10;
		/* Left Shift (<<) */
		System.out.println("a<<2 = " + (a << 2));
		/* Signed Right Shift (>>) */
		System.out.println("a>>2 = " + (a >> 2));
		/* Shift Right Zero Fill (>>>) */
		System.out.println("b>>>2 = " + (b >>> 2));
		System.out.println("***************************************************************");
	}

	// bitwise operator 1 (Encoding used in 2's complement)
	private static void bitwiseOperator1() {
		// Java defines several bitwise operators which can be used to manipulate the
		// bits of the integer data types (byte, short, int, long, char)

		// Different bitwise operators are as follows:
		// bitwise NOT operator (~) (also known as bitwise complement operator)
		// bitwise OR operator (|)
		// bitwise AND operator (&)
		// bitwise XOR operator (^)
		// bitwise shift right operator (>>)
		// bitwise shift right zero fill operator (>>>)
		// bitwise shift left operator (<<)
		// bitwise OR assignment operator (|=)
		// bitwise AND assignment operator (&=)
		// bitwise XOR assignment operator (^=)
		// bitwise shift right assignment operator (>>=)
		// bitwise shift right zero fill assignment operator (>>>=)
		// bitwise shift left assignment operator (<<=)

		byte myByte1 = 42;
		byte myByte2 = 15;
		System.out.println(~myByte1);
		System.out.println(myByte1 | myByte2);
		System.out.println(myByte1 & myByte2);
		System.out.println(myByte1 ^ myByte2);
		System.out.println(42 << 3); // ....00101010 -> ...101010000

		/* Bitwise AND (&) - returns bit by bit AND of input values */
		int a = 0x0005;
		int b = 0x0007;
		System.out.println("a&b = " + (a & b));
		/* Bitwise OR (|) - returns bit by bit OR of input values */
		System.out.println("a|b = " + (a | b));
		/* Bitwise XOR (^) - returns bit by bit XOR of input values */
		System.out.println("a^b = " + (a ^ b));
		/*
		 * Bitwise Complement (~) - returns the one’s compliment representation of the
		 * input value
		 */
		System.out.println("~a = " + ~a);
		System.out.println("***************************************************************");
	}

	// bitwise operator 2 (Encoding used in 2's complement)
	private static void bitwiseOperator2() {
		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		int a = 3;
		int b = 6;
		int c = a | b;
		int d = a & b;
		int e = a ^ b;
		int f = (~a & b) | (a & ~b);
		int g = ~a & 0x0f;
		System.out.println("a = " + binary[a]);
		System.out.println("b = " + binary[b]);
		System.out.println("a|b = " + binary[c]);
		System.out.println("a&b = " + binary[d]);
		System.out.println("a^b = " + binary[e]);
		System.out.println("(~a & b) | (a & ~b) = " + binary[f]);
		System.out.println("~a = " + binary[g]);
		System.out.println("***************************************************************");
	}

	// ternary or conditional operator
	private static void ternaryOrConditionalOperator() {
		/*
		 * It is a short-hand version of if-else statement and consists of 3 operands
		 * (hence called ternary)
		 */
		int myIntValue1 = 732;
		int myIntValue2 = 53;
		String result = (myIntValue1 >= myIntValue2) ? "Greater Than" : "Less Than";
		System.out.println("The result is: " + result);
		System.out.println("***************************************************************");
	}

	// logical operator
	private static void logicalOperator() {
		boolean isInteger = true;
		boolean isPositive = false;
		/* Logical AND */
		System.out.println(isInteger && isPositive);
		/* Logical OR */
		System.out.println(isPositive || isInteger);
		System.out.println("***************************************************************");
	}

	// relational or comparison operator
	private static void relationalOrComparisonOperator() {
		int myIntValue1 = 20;
		int myIntValue2 = 14;
		/* Equal To */
		System.out.println(myIntValue1 == myIntValue2);
		/* Not Equal To */
		System.out.println(myIntValue1 != myIntValue2);
		/* Greater Than */
		System.out.println(myIntValue2 > myIntValue2);
		/* Less Than */
		System.out.println(myIntValue2 < myIntValue1);
		/* Greater Than or Equal To */
		System.out.println(myIntValue1 >= myIntValue2);
		/* Less Than or Equal To */
		System.out.println(myIntValue1 <= myIntValue2);
		System.out.println("***************************************************************");
	}

	// unary operator
	private static void unaryOperator() {
		int myIntValue1 = 76;
		int myIntValue2 = -34;
		/* Unary Plus */
		System.out.println(+(myIntValue2));
		/* Unary Minus */
		System.out.println(-(myIntValue2));
		/* Pre Increment */
		System.out.println(++myIntValue1);
		/* Post Increment */
		System.out.println(myIntValue1++);
		/* Pre Decrement */
		System.out.println(--myIntValue2);
		/* Post Decrement */
		System.out.println(myIntValue2--);
		/* Logical Not */
		System.out.println(!(true));
		System.out.println("***************************************************************");
	}

	// arithmetic operator
	private static void arithmeticOperator() {
		double myDoubleValue1 = 45.4636;
		double myDoubleValue2 = 5.212;
		/* Addition */
		System.out.println("myDoubleValue1 + myDoubleValue1 = " + (myDoubleValue1 + myDoubleValue2));
		/* Subtraction */
		System.out.println("myDoubleValue1 - myDoubleValue1 = " + (myDoubleValue1 - myDoubleValue2));
		/* Multiplication */
		System.out.println("myDoubleValue2 * 5 = " + (myDoubleValue2 * 5));
		/* Division */
		System.out.println("myDoubleValue1 / 3 = " + (myDoubleValue1 / 3));
		/* Modulus (gives the remainder) */
		System.out.println("myDoubleValue1 % 2 = " + (myDoubleValue1 % 2));
		System.out.println("***************************************************************");

	}

	// assignment operator
	private static void assignmentOperator() {
		/* Assignment Operator and Compound Statement */
		int myVariable = 54;
		/* Here the integer value 54 is assigned to the "myVariable" variable */
		myVariable = myVariable + 2;
		/* The above statement can also be written as: */
		myVariable += 4;
		/* Other compound statement examples */
		myVariable -= 2;
		myVariable *= 4;
		myVariable /= 2;
		myVariable %= 10;
		System.out.println(myVariable);
		System.out.println("***************************************************************");
	}

}
