package com.javaconcepts.stringHandling;

public class StringDataAndCaseConversion {

	public static void main(String[] args) {

		Box2 myBox2 = new Box2();
		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };

		// Data conversion using static and overloaded valueOf() method of String class
		String intToString = String.valueOf(123);
		String doubleToString = String.valueOf(42.34);
		String floatToString = String.valueOf(5.23F);
		String objectToString = String.valueOf(myBox2);
		String characterArrayToString = String.valueOf(chars);
		System.out.println(intToString);
		System.out.println(doubleToString);
		System.out.println(floatToString);
		System.out.println(objectToString);
		System.out.println(characterArrayToString);
		System.out.println("*********************************************");

		// Case Conversion of string (toUpperCase() and toLowerCase())
		String str1 = "1. I love programming in Java";
		System.out.println("Original sentence: " + str1);
		System.out.println("After converting to lower case: " + str1.toLowerCase());
		System.out.println("After converting to upper case: " + str1.toUpperCase());
		System.out.println("*********************************************");

	}

}

class Box2 {
	public String toString() {
		return "This is a Box object";
	}
}
