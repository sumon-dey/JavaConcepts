/*Enum -> a list of public static final named constants that define a new class data type and its legal values*/
/*Enum class data type can have constructors, methods and instance variables*/
package com.javaconcepts.enums;

enum Apple {
	// enumeration constants (public static final named constants)
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumerationBasic {

	public static void main(String[] args) {
		// create a variable of enum type
		Apple ap;
		// only values that can be assigned to "ap" are those defined by the enum
		ap = Apple.Jonathan;

		// output an enum value
		System.out.println("Value of ap: " + ap);
		System.out.println();
		System.out.println("*************************************************");

		ap = Apple.GoldenDel;
		// compare two enum values
		if (ap == Apple.GoldenDel) {
			System.out.println("ap contains GoldenDel. \n");
		}
		System.out.println("*************************************************");

		// use of enum to control a switch statement
		switch (ap) {
		case Jonathan:
			System.out.println("Jonathan is Red.");
			break;
		case GoldenDel:
			System.out.println("Golden Delicious is Yellow.");
			break;
		case RedDel:
			System.out.println("Red Delicious is Red.");
			break;
		case Winesap:
			System.out.println("Winesap is Red.");
			break;
		case Cortland:
			System.out.println("Cortland is Red.");
			break;
		}
		System.out.println("*************************************************");

		// values() and valueOf() methods
		Apple[] allApples = Apple.values();
		for (Apple a : allApples) {
			System.out.println(a);
		}
		System.out.println("*************************************************");
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
		System.out.println("*************************************************");
	}

}
