package com.javaconcepts.inheritance;

/**
 * final keyword and Object class
 * 
 * @author Sumon Dey
 *
 */
public class Final {

	public static void main(String[] args) {
		A objA = new A();
		objA.display();
		System.out.println("**********************************************************");
		B objB = new B();
		objB.display2();
		System.out.println("**********************************************************");
		// "Object" is the superclass of all the Java classes
		System.out.println(objB.equals(objA));
		System.out.println(objB.toString());
		System.out.println(objB.getClass());
		System.out.println("**********************************************************");
	}

}

class A {
	public final int COUNT = 2;
	// field marked as "final" cannot be changed and typically acts as a Global
	// Constant

	public final void display() {
		System.out.println("Screen A is displayed");
		System.out.println("Value of COUNT is: " + COUNT);
	}
}

class B extends A {

	// @Override
	// public final void display() {
	// System.out.println("Screen B is displayed");
	// }
	// This will throw compile time error since
	// final method cannot be overriden

	public void display2() {
		System.out.println("Screen B is displayed");
		// COUNT += 1;
		// This will throw compile time error since a final field value cannot
		// be changed
		System.out.println("Value of COUNT is: " + COUNT);
	}

	// Overriding the "toString()" method of the Object class to customize the
	// object description
	@Override
	public String toString() {
		return "This is a customized statement about the object";
	}

}