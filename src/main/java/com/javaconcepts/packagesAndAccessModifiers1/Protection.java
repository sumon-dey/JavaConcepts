package com.javaconcepts.packagesAndAccessModifiers1;

public class Protection {
	int default_n = 1; // default access modifier
	private int private_n = 2; // private access modifier
	protected int protected_n = 3; // protected access modifier
	public int public_n = 4; // public access modifier

	public Protection() {
		System.out.println("Base Constructor");
		System.out.println("n = " + default_n);
		System.out.println("n = " + private_n);
		System.out.println("n = " + protected_n);
		System.out.println("n = " + public_n);
	}
}

/* The class "Derived" is a subclass of the class "Protection" */
class Derived extends Protection {

	public Derived() {
		System.out.println("default_n = " + default_n);
		/*
		 * This will throw compile error since the variable "private_n" is private to
		 * the class Derived
		 */
		// System.out.println("private_n = " + private_n);
		System.out.println("protected_n = " + protected_n);
		System.out.println("public_n = " + public_n);
	}

}

/*
 * The class "SamePackage" is in the same package as that of the class
 * "Protection" but it is not its subclass.
 */
class SamePackage {

	public SamePackage() {
		Protection protection = new Protection();
		System.out.println("Same package constructor");
		System.out.println("default_n = " + protection.default_n);
		/*
		 * The below will throw compile error since the variable "pri_n" is private to
		 * the class Derived
		 */
		// System.out.println("n = " + protection.pri_n);
		System.out.println("protected_n = " + protection.protected_n);
		System.out.println("public_n = " + protection.public_n);
	}

}
