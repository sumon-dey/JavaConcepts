package com.javaconcepts.systemAndCompiler;

public class ObjectCloneDemo2 {
	/*
	 * The clone() method generates a duplicate copy of the object on which it is
	 * called. Only classes that implements the "Cloneable" interface can be cloned
	 */
	public static void main(String[] args) {
		CloneDemo2 x1 = new CloneDemo2();
		CloneDemo2 x2;
		x1.a = 10;
		x1.b = 20.98;
		// clone() has been called directly in the below statement
		x2 = (CloneDemo2) x1.clone();
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
	}

}

class CloneDemo2 implements Cloneable {
	int a;
	double b;

	// Object's clone() method is overriden here and is public
	public Object clone() {
		try {
			// call clone in Object
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}

}
