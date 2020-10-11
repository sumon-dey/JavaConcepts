package com.javaconcepts.packagesAndAccessModifiers1;

public class Protection {

	int n = 1; // default access modifier
	private int pri_n = 2; // private access modifier
	protected int pro_n = 3; // protected access modifier
	public int pub_n = 4; // public access modifier

	public Protection() {
		System.out.println("Base Constructor");
		System.out.println("n = " + n);
		System.out.println("n = " + pri_n);
		System.out.println("n = " + pro_n);
		System.out.println("n = " + pub_n);
	}

}
