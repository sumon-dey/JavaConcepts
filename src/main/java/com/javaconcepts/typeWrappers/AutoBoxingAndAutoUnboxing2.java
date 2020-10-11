/*Autoboxing and Unboxing*/
package com.javaconcepts.typeWrappers;

public class AutoBoxingAndAutoUnboxing2 {

	private static int myIntValue = 456;
	private static Integer myIntValueWrapped1;
	private static Integer myIntValueWrapped2;
	private static Integer myIntValueWrapped3;
	private static int myUnboxedIntValue1;
	private static int myUnboxedIntValue2;
	private static int myUnboxedIntValue3;
	private static double myDoubleValue = 43.4322;
	private static Double myDoubleValueWrapped1;
	private static Double myDoubleValueWrapped2;
	private static Double myDoubleValueWrapped3;
	private static double myUnboxedDoubleValue1;
	private static double myUnboxedDoubleValue2;
	private static double myUnboxedDoubleValue3;

	public static void main(String[] args) {
		boxingAndAutoboxing();
		unboxingAndAutounboxing();
	}

	/* Boxing and Autoboxing */
	private static void boxingAndAutoboxing() {
		/*
		 * To wrap the primitive variables with their respective wrapper classes
		 */
		/* 1st option */
		myIntValueWrapped1 = Integer.valueOf(myIntValue);
		myDoubleValueWrapped1 = Double.valueOf(myDoubleValue);

		/* 2nd option */
		myIntValueWrapped2 = new Integer(myIntValue);
		myDoubleValueWrapped2 = new Double(myDoubleValue);

		/*
		 * 3rd option (Autoboxing - Java automatically does the boxing for you.)
		 */
		myIntValueWrapped3 = myIntValue;
		myDoubleValueWrapped3 = myDoubleValue;

		/* Display */
		System.out.println(myIntValueWrapped1);
		System.out.println(myIntValueWrapped2);
		System.out.println(myIntValueWrapped3);
		System.out.println(myDoubleValueWrapped1);
		System.out.println(myDoubleValueWrapped2);
		System.out.println(myDoubleValueWrapped3);
		System.out.println("********************************************************************************");
	}

	/* Unboxing and Auto-unboxing */
	private static void unboxingAndAutounboxing() {
		/* 1st option */
		int myUnboxedIntValue1 = myIntValueWrapped1.intValue();
		double myUnboxedDoubleValue1 = myDoubleValueWrapped1.doubleValue();

		/*
		 * 2nd option (Auto-unboxing - Java automatically does the unboxing for
		 * you.)
		 */
		int myUnboxedIntValue2 = myIntValueWrapped2;
		double myUnboxedDoubleValue2 = myDoubleValueWrapped2;

		/* Display */
		System.out.println(myUnboxedIntValue1);
		System.out.println(myUnboxedIntValue2);
		System.out.println(myUnboxedDoubleValue1);
		System.out.println(myUnboxedDoubleValue2);
		System.out.println("********************************************************************************");
	}

}
