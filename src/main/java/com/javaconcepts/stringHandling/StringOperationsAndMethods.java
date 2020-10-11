package com.javaconcepts.stringHandling;

import java.util.Arrays;

public class StringOperationsAndMethods {

	public static void main(String[] args) {
		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
		String str1 = new String(chars);
		System.out.println("str1: " + str1);

		// length
		System.out.println("Length: " + str1.length());
		System.out.println("Length of the String abc is: " + "abc".length());

		// concatenation
		String str2 = str1 + " is a String";
		System.out.println("str2: " + str2);
		int val1 = 1;
		// in the below "int" will be promoted to String by using the overloaded
		// String.valueOf() method and then concatenated
		System.out.println(val1 + ": " + str2);
		// in the below, precedence is given to the String concatenation
		System.out.println("four: " + 2 + 2);
		// in the below, precedence is given to the parenthesis before concatenation
		System.out.println("four: " + (2 + 2));
		System.out.println("*****************************************************");

		// "toString()" method is used to determine the String representation for
		// objects of classes that we create
		Box myBox = new Box(4, 5, 6.2);
		String s = "Box myBox: " + myBox;
		// the Box's toString() method is automatically invoked when when a Box object
		// is used in a concatenation expression or in a call to the println() method
		System.out.println(myBox);
		System.out.println(s);
		System.out.println("*****************************************************");

		// codePoint() (return the Unicode code point)
		String str3 = "This is amazing.";
		String str4 = new String(str3);
		System.out.println(str3.codePointAt(2));
		// contains()
		System.out.println(str3.contains("s a"));
		// contentEquals()
		System.out.println(str4.contentEquals(str3));
		// isEmpty()
		System.out.println(str3.isEmpty());
		// matches (matches with the regex passed as argument)
		System.out.println(str3.matches("(.*)is (.*)"));
		// replaceFirst()
		System.out.println(str3.replaceFirst("is", "X"));
		// replaceAll
		System.out.println(str3.replaceAll(".", "X"));
		// split()
		System.out.println(Arrays.toString(str3.split(" ")));
		System.out.println("*****************************************************");
	}

}

class Box {
	private double width;
	private double height;
	private double depth;

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public String toString() {
		return "Dimensions are " + width + " by " + depth + " by " + height;
	}
}
