package com.javaconcepts.arguments;

/**
 * 
 * Variable Length arguments (or Varargs) are used to pass variable number of
 * parameters (of same or different types) in a method in the form of String
 * array (represented by 3 periods(...)). It simplifies the creation of methods
 * that need to take a variable number of arguments. A method that takes a
 * variable number of arguments is called a "varargs method". The "…" syntax
 * tells the compiler that varargs have been used and these arguments should be
 * stored in the array referred to.
 * 
 * @author Sumon Dey
 *
 */
public class VariableLengthArguments {

	public static void main(String[] args) {
		VarCheck varCheck = new VarCheck();
		varCheck.display(true, "Orange");
		System.out.println("**************************************************");
		varCheck.display(true, "Red", "Yellow", "Green");
		System.out.println("**************************************************");
		varCheck.display("Blue");
		System.out.println("**************************************************");
		varCheck.display(); // This will display nothing as the passed String array is empty
		System.out.println("**************************************************");
		// varCheck.display(true);
		/*
		 * The above will show compile error due to ambiguity between boolean normal
		 * argument and boolean vararg (in the 3rd method)
		 */
		System.out.println("**************************************************");
	}

}

class VarCheck {

	void display(String... colors) {
		for (String color : colors) {
			System.out.println("Color is: " + color);
		}
	}

	void display(boolean isColor, String... colors) {
		for (String color : colors) {
			System.out.println("Color is: " + color);
		}
	}

	void display(boolean isColor, boolean... colorPresence) {
		for (boolean isColorPresent : colorPresence) {
			System.out.println("Is color present?: " + isColorPresent);
		}
	}

}
