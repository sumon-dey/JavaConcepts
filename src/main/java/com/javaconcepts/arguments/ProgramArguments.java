/*Program Arguments are used to pass information to the program from outside (IDE or CLI)
From CLI :- java ProgramArguments Value1 Value2 Value3
From IDE :- Value1 Value2 Value3 (in Program Arguments field of the IDE)
The data gets passed as strings in the String array argument of the main() method*/
package com.javaconcepts.arguments;

public class ProgramArguments {

	public static void main(String[] args) {

		for (String argument : args) {
			System.out.println("Argument passed is: " + argument);
		}

	}

}
