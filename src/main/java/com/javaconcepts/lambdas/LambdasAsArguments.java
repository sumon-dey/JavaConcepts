package com.javaconcepts.lambdas;

public class LambdasAsArguments {

	public static void main(String[] args) {
		String inStr = "Java is special";
		String outStr;
		System.out.println("Here is input string: " + inStr);

		// this passes an expression lambda that uppercases a String
		outStr = stringOp((String str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);
		System.out.println("****************************************************");

		// this passes a block lambda that removes spaces
		outStr = stringOp((String str) -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			return result;
		}, inStr);
		System.out.println("The string with spaces removed: " + outStr);
		System.out.println("****************************************************");

		// this reverses a String
		StringFunc2 reverse = (String str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println("The string reversed: " + stringOp(reverse, inStr));
		System.out.println("****************************************************");

	}

	// this method has a functional interface as the type of its first parameter.
	// Thus, it can be passed as a reference to any instance of that interface,
	// including the instance created by a lambda expression
	public static String stringOp(StringFunc2 sf, String s) {
		return sf.func(s);
	}

}

interface StringFunc2 {
	String func(String n);
}
