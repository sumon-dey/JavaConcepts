/*Autoboxing is the process by which a Primitive Type is automatically encapsulated (boxed) into its equivalent 
Type Wrapper whenever an object of that type is needed. There is no need to explicitly construct an object*/

/*Auto-Unboxing is the process by which the value of a boxed object is automatically extracted (unboxed) from a 
 * type wrapper when its value is needed. There is no need to call a method such as intValue() or doubleValue()*/
package com.javaconcepts.typeWrappers;

public class AutoBoxingAndAutoUnboxing1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Autobox
		Integer intObj1 = 100;

		// Auto-unbox
		int intPrimitive = intObj1;

		System.out.println("After Wrapped: " + intObj1 + ", After Unwrapped: " + intPrimitive);
		System.out.println("*******************************************");

		// Autoboxing and Auto-unboxing in Method Parameter, Method Return Type and
		// Expressions
		Integer intObj2 = boxCheck(212);
		System.out.println(intObj2);
		System.out.println("*******************************************");
		Boolean boolean1 = true; // primitive got boxed into type wrapper
		booleanCheck(boolean1);
		System.out.println("*******************************************");
	}

	public static int boxCheck(Integer i) {
		return i;
	}

	public static void booleanCheck(Boolean boolean1) {
		if (boolean1) { // type wrapper unboxed to expose primitive
			System.out.println("Auto-unboxing happened correctly");
		} else {
			System.out.println("Auto-unboxing did not happen correctly");
		}
	}

}
