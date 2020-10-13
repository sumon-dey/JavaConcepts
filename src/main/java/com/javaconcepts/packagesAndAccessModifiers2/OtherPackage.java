package com.javaconcepts.packagesAndAccessModifiers2;

public class OtherPackage {

	public OtherPackage() {
		com.javaconcepts.packagesAndAccessModifiers1.Protection p = new com.javaconcepts.packagesAndAccessModifiers1.Protection();
		System.out.println("Other package constructor");
		/* This is for class or package only */
		// System.out.println("default_n = " + p.default_n);
		/* This is for class only */
		// System.out.println("private_n = " + p.private_n);
		/* This is for class, subclass or package only */
		// System.out.println("protected_n = " + p.protected_n);
		System.out.println("public_n = " + p.public_n);
	}

}
