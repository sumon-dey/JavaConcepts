package com.javaconcepts.generics;

public class GenericsDemo2 {

	public static void main(String[] args) {

		GenTwo<Integer, String> myObjects = new GenTwo<Integer, String>(92, "Generics Demo 2");

		myObjects.showTypes();
		int v1 = myObjects.getObj1();
		String v2 = myObjects.getObj2();
		System.out.println("Value: " + v1);
		System.out.println("Value: " + v2);
		System.out.println("****************************************************");

	}

}

class GenTwo<T, V> {
	T obj1;
	V obj2;

	public GenTwo(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void showTypes() {
		System.out.println("Type of T is: " + obj1.getClass().getName());
		System.out.println("Type of V is: " + obj2.getClass().getName());
	}

	public T getObj1() {
		return obj1;
	}

	public V getObj2() {
		return obj2;
	}

}
