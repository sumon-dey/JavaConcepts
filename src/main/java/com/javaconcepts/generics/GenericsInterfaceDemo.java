package com.javaconcepts.generics;

public class GenericsInterfaceDemo {

	public static void main(String[] args) {
		Integer[] iNums = { 3, 6, 2, 8, 6 };
		Character[] chs = { 'b', 'r', 'p', 'w' };
		MyClass<Integer> iOb = new MyClass<Integer>(iNums);
		MyClass<Character> cOb = new MyClass<Character>(chs);
		System.out.println("Max value in iNums: " + iOb.max());
		System.out.println("Min value in iNums: " + iOb.min());
		System.out.println("Max value in chs: " + cOb.max());
		System.out.println("Min value in chs: " + cOb.min());
	}

}

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;

	public MyClass(T[] o) {
		vals = o;
	}

	@Override
	public T min() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v) < 0) {
				v = vals[i];
			}
		}
		return v;
	}

	@Override
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v) > 0) {
				v = vals[i];
			}
		}
		return v;
	}

}
