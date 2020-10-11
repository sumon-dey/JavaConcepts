package com.javaconcepts.packagesAndAccessModifiers1;

public class Derived extends Protection {

	public Derived() {
		System.out.println("n = " + n);
		// This will throw compile error since the variable pri_n is private to
		// the class Derived
		// System.out.println("pri_n = " + pri_n);
		System.out.println("pro_n = " + pro_n);
		System.out.println("pub_n = " + pub_n);
	}

}
