package com.javaconcepts.lambdas;

public class StaticMethodReference1 {
	/*
	 * A method reference provides a way to refer to a method without executing it.
	 * This method reference can be used anywhere in which it is compatible with its
	 * target type.
	 */
	public static void main(String[] args) {
		String inStr = "Java is special";
		String outStr;

		// here a method reference to strReverse is passed to stringOp()
		outStr = stringOp(MyStringOps::strReverse, inStr);

		System.out.println("Original String: " + inStr);
		System.out.println("Reversed String: " + outStr);
	}

	// this method has a functional interface as the type of its first parameter.
	// thus, it can be passed any instance of that interface, including a method
	// reference
	public static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

}

interface StringFunc3 {
	String func(String n);
}

// this class defines a static method called strReverse()
class MyStringOps {
	public static String strReverse(String str) {
		String result = "";
		int i;
		for (i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}
