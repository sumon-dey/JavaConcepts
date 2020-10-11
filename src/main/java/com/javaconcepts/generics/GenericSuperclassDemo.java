/*Generics Class Hierarchies*/
package com.javaconcepts.generics;

public class GenericSuperclassDemo {

	public static void main(String[] args) {
		Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);
		System.out.print(x.getOb());
		System.out.println(x.getOb2());
	}

}

class GenSuper<T> {
	T ob;

	public GenSuper(T o) {
		ob = o;
	}

	public T getOb() {
		return ob;
	}
}

class Gen2<T, V> extends GenSuper<T> {

	V ob2;

	public Gen2(T o, V o2) {
		super(o);
		ob2 = o2;
	}

	public V getOb2() {
		return ob2;
	}

}
