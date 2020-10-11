package com.javaconcepts.packagesAndAccessModifiers2;

public class OtherPackage {

	public OtherPackage() {
		com.javaconcepts.packagesAndAccessModifiers1.Protection p = new com.javaconcepts.packagesAndAccessModifiers1.Protection();
		System.out.println("Other package constructor");
		// This is for class or package only
		// System.out.println("n = " + p.n);
		// This is for class only
		// System.out.println("pri_n = " + p.pri_n);
		// This is for class, subclass or package only
		// System.out.println("pro_n = " + p.pro_n);
		System.out.println("pub_n = " + p.pub_n);
	}

}
