/*Java Variables and Block*/
package com.javaconcepts.dataTypes;

public class JavaVariables {
	/*
	 * A Java Variable is the name of a reserved area allocated in memory to
	 * hold the value while the Java program is executed. Java variables are of
	 * 3 types - 1) Instance (Member) Variables 2) Static (Class) Variables 3)
	 * Local Variables.
	 */
	private static int heightOfPerson = 173; // static or class variable
	private int weightOfPerson; // instance or member variable

	public static void main(String[] args) {
		JavaVariables obj1 = new JavaVariables();
		obj1.setWeightOfPerson(210);
		obj1.biometrics(true);
		System.out.println("***************************************************************");
		JavaVariables obj2 = new JavaVariables();
		obj2.setWeightOfPerson(192);
		obj2.biometrics(false);
		System.out.println("***************************************************************");
		obj2.blockTest();
	}

	private void biometrics(boolean overThirty) {
		int age;
		// "age" and "overThirty" are local variables
		age = overThirty ? 31 : 29;
		System.out.println("Height of the person is: " + heightOfPerson + " cm.(static)");
		System.out.println("Weight of the person is: " + weightOfPerson + " lbs.(instance)");
		System.out.println("Age of the person is: " + age + " years.(local)");
	}

	// lifetime and visibility of variables within blocks
	private void blockTest() {
		int a = 24;
		if (a > 20) {
			int b = a / 2;
			System.out.println("Value of b inside if-block: " + b);
		}
		// System.out.println("Value of b outside if-block: " + b);
		// The above line will not compile since the lifetime and scope of "b"
		// ends with the end of the if-block
	}

	public int getWeightOfPerson() {
		return weightOfPerson;
	}

	public void setWeightOfPerson(int weightOfPerson) {
		this.weightOfPerson = weightOfPerson;
	}

}
