package com.javaconcepts.dataTypes;

/**
 * Java Variables and Blocks
 * 
 * @author Sumon Dey
 *
 */
public class VariablesAndBlocks {
	/*
	 * A Java Variable is the name of a reserved area allocated in memory to hold
	 * the value while the Java program is being executed. Java variables are of 3
	 * types - 1) Instance (Member) Variables 2) Static (Class) Variables 3) Local
	 * Variables. A variable is defined by the combination of an identifier, a type
	 * and an optional initializer. All variables have a "scope" which defines their
	 * lifetime and visibility.
	 */
	private static int heightOfPerson = 173; // static or class variable
	private int weightOfPerson; // instance or member variable

	public static void main(String[] args) {
		VariablesAndBlocks obj1 = new VariablesAndBlocks();
		obj1.setWeightOfPerson(210);
		obj1.biometrics(true);
		System.out.println("***************************************************************");
		VariablesAndBlocks obj2 = new VariablesAndBlocks();
		obj2.setWeightOfPerson(192);
		obj2.biometrics(false);
		System.out.println("***************************************************************");
		obj2.blockAndScopeTest();
	}

	private void biometrics(boolean overThirty) {
		int age;
		/* "age" and "overThirty" are local variables */
		age = overThirty ? 31 : 29;
		System.out.println("Height of the person is: " + heightOfPerson + " cm.(static)");
		System.out.println("Weight of the person is: " + weightOfPerson + " lbs.(instance)");
		System.out.println("Age of the person is: " + age + " years.(local)");
	}

	/* Variable Scope: lifetime and visibility of variables within blocks */
	private void blockAndScopeTest() {
		int a = 24;
		if (a > 20) {
			int b = a / 2;
			System.out.println("Value of b inside if-block: " + b);
		}
		// System.out.println("Value of b outside if-block: " + b);
		/*
		 * The commented-out above line will not compile and throw compile error since
		 * the lifetime and scope of "b" ends with the end of the if-block.
		 */
	}

	int getWeightOfPerson() {
		return weightOfPerson;
	}

	void setWeightOfPerson(int weightOfPerson) {
		this.weightOfPerson = weightOfPerson;
	}

}
