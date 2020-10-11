package com.javaconcepts.systemAndCompiler;

public class ObjectCloneDemo1 {
	/*
	 * The clone() method generates a duplicate copy of the object on which it is
	 * called. Only classes that implements the "Cloneable" interface can be cloned
	 */
	public static void main(String[] args) {
		CloneDemo1 x1 = new CloneDemo1();
		CloneDemo1 x2;
		x1.a = 10;
		x1.b = 20.98;
		x2 = x1.cloneTest();
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
	}

}

class CloneDemo1 implements Cloneable {
	int a;
	double b;

	// This method calls Object's clone().
	public CloneDemo1 cloneTest() {
		try {
			// call clone in Object
			return (CloneDemo1) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}

}
