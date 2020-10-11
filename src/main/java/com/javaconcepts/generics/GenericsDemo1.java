package com.javaconcepts.generics;

// Generic class where T=type parameter
public class GenericsDemo1<T> {
	public static void main(String[] args) {
		// create a Gen reference for Integers
		// the "Type Argument(e.g. Integer)" passed to the "Type Parameter(T)" should be
		// a Reference Type
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();

		int v = iOb.getOb();
		System.out.println("Value: " + v);
		System.out.println("****************************************************");

		Gen<String> strOb = new Gen<String>("Generics Demo 1");
		strOb.showType();

		String str = strOb.getOb();
		System.out.println("Value: " + str);

		// the below will show compile error since their Type Arguments (<Integer> and
		// <String>) differ
		// iOb=strOb;
	}
}

class Gen<T> {

	// declare an object of type T
	T ob;

	// pass the constructor a reference to an object of type T
	public Gen(T obj) {
		ob = obj;
	}

	// return ob
	public T getOb() {
		return ob;
	}

	// show type of T
	public void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}
}
