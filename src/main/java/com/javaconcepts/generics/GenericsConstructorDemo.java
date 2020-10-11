package com.javaconcepts.generics;

public class GenericsConstructorDemo {

	public static void main(String[] args) {
		GenCon myObj1 = new GenCon(23);
		GenCon myObj2 = new GenCon(2.2);
		GenCon myObj3 = new GenCon(24.2F);
		myObj1.showValue();
		myObj2.showValue();
		myObj3.showValue();
	}

}

class GenCon {
	private double val;

	public <T extends Number> GenCon(T ob) {
		val = ob.doubleValue();
	}

	public void showValue() {
		System.out.println("val: " + val);
	}

}
