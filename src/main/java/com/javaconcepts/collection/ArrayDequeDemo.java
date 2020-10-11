package com.javaconcepts.collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	/*
	 * The "ArrayDeque" class extends the "AbstractCollection" class and implements
	 * the "Deque" interface. The ArrayDeque class creates a dynamic array and has
	 * no capacity restrictions.
	 */
	public static void main(String[] args) {
		ArrayDeque<String> myArrayDeque = new ArrayDeque<String>();
		myArrayDeque.add("A");
		myArrayDeque.add("B");
		myArrayDeque.add("C");
		myArrayDeque.add("D");
		myArrayDeque.add("E");
		myArrayDeque.add("F");
		System.out.println("Popping from the stack:");
		while (myArrayDeque.peek() != null) {
			System.out.print(myArrayDeque.pop() + " ");
		}
		System.getProperty("line.separator");
	}

}
