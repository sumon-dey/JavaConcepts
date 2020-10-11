package com.javaconcepts.lambdas;

public class InstanceMethodReference1 {

	public static void main(String[] args) {
		String inStr = "Java is special";
		String outStr;
		MyStringOps2 strOps = new MyStringOps2();

		// now a method reference to the instance method strReverse is passed to
		// stringOp()
		outStr = stringOp(strOps::strReverse, inStr);

		System.out.println("Original String: " + inStr);
		System.out.println("Reversed String: " + outStr);
	}

	// this method has a functional interface as the type of its first parameter.
	// Thus, it can be passed any instance of that interface. including method
	// references.
	static String stringOp(StringFunc4 sf, String s) {
		return sf.func(s);
	}

}

// a functional interface for String operations
interface StringFunc4 {
	String func(String n);
}

// this class defines an instance method called strReverse()
class MyStringOps2 {
	String strReverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}