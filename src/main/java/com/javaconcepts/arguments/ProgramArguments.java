package com.javaconcepts.arguments;

/**
 * Program Arguments are used to pass information to the program from outside
 * (IDE or CLI). A Java application can accept any number of arguments from the
 * command line or IDE. This allows the user to specify configuration
 * information when the application is launched. From CLI :- run -> java
 * ProgramArguments Value1 Value2 Value3 From IDE :- Value1 Value2 Value3 (in
 * Program Arguments field of the IDE). The data gets passed as strings in the
 * String array argument of the main() method.
 * 
 * @author Sumon Dey
 *
 */
public class ProgramArguments {

	public static void main(String[] args) {

		for (String argument : args) {
			System.out.println("Argument passed is: " + argument);
		}

		System.out.println("*************************************************************");

		for (int counter = 0; counter < args.length; counter++) {
			System.out.println("Argument no." + (counter + 1) + " is: " + args[counter]);
		}

	}

}
