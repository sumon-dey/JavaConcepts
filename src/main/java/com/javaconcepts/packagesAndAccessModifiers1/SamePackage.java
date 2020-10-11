package com.javaconcepts.packagesAndAccessModifiers1;

public class SamePackage {

	public SamePackage() {
		Protection protection = new Protection();
		System.out.println("Same package constructor");
		System.out.println("n = " + protection.n);
		// This will throw compile error since the variable pri_n is private to
		// the class Derived
		// System.out.println("n = " + protection.pri_n);
		System.out.println("pro_n = " + protection.pro_n);
		System.out.println("pub_n = " + protection.pub_n);
	}

}
