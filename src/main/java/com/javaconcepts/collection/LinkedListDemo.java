package com.javaconcepts.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * The "LinkedList" class extends the "AbstractSequentialList" class and
	 * implements the "List","Queue" and "Deque" interfaces. It provides a
	 * linked-list data structure and can use all the methods defined by the
	 * "List","Queue" and "Deque" interfaces.
	 */
	public static void main(String[] args) {
		LinkedList<String> myLinkedList1 = new LinkedList<String>();
		myLinkedList1.add("F");
		myLinkedList1.add("B");
		myLinkedList1.add("D");
		myLinkedList1.add("E");
		myLinkedList1.add("C");
		myLinkedList1.addLast("Z");
		myLinkedList1.addFirst("A");
		myLinkedList1.add(1, "A2");
		// display the LinkedList
		System.out.println("Original contents of myLinkedList1: " + myLinkedList1);
		// remove elements from the LinkedList
		myLinkedList1.remove("F");
		myLinkedList1.remove(2);
		System.out.println("Contents of myLinkedList1 after deletions: " + myLinkedList1);
		// remove the first and the last elements from the LinkedList
		myLinkedList1.removeFirst();
		myLinkedList1.removeLast();
		System.out.println("Contents of myLinkedList1 after deleting first and last: " + myLinkedList1);
		// get and set a value
		String val = myLinkedList1.get(2);
		myLinkedList1.set(2, val + " Changed");
		System.out.println("myLinkedList1 after change: " + myLinkedList1);

	}

}
