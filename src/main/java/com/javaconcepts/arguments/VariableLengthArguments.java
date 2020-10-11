/*Variable Length arguments or Varargs are used to pass variable number of parameters in a method
 * in the form of String array*/
package com.javaconcepts.arguments;

public class VariableLengthArguments {

	public static void main(String[] args) {
		VarCheck varCheck = new VarCheck();
		varCheck.display(true, "Orange");
		System.out.println("**************************************************");
		varCheck.display(true, "Red", "Yellow", "Green");
		System.out.println("**************************************************");
		varCheck.display("Blue");
		System.out.println("**************************************************");
		varCheck.display(); // This will display nothing
		System.out.println("**************************************************");
		// varCheck.display(true); // This will show compile error due to
		// ambiguity between boolean normal argument and boolean vararg
		System.out.println("**************************************************");
	}

}

class VarCheck {

	public void display(String... colors) {
		for (String color : colors) {
			System.out.println("Color is: " + color);
		}
	}

	public void display(boolean isColor, String... colors) {
		for (String color : colors) {
			System.out.println("Color is: " + color);
		}
	}

	public void display(boolean isColor, boolean... colorPresence) {
		for (boolean isColorPresent : colorPresence) {
			System.out.println("Is color present?: " + isColorPresent);
		}
	}

}
