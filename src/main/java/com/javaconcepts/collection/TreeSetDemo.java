package com.javaconcepts.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * The "TreeSet" class extends the "AbstractSet" class and implements the
	 * "NavigableSet" interface. It creates a collection that uses a tree for
	 * storage and objects are stored in sorted and ascending order. Access and
	 * Retrieval times are quite fast which which makes TreeSet an excellent choice
	 * when storing large amounts of sorted information that must be found quickly.
	 */
	/* The TreeSet uses all the methods declared by the "NavigableSet" interface */
	public static void main(String[] args) {
		TreeSet<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("J");
		myTreeSet.add("C");
		myTreeSet.add("I");
		myTreeSet.add("F");
		myTreeSet.add("L");
		myTreeSet.add("B");
		myTreeSet.add("D");
		myTreeSet.add("K");
		myTreeSet.add("A");
		myTreeSet.add("G");
		myTreeSet.add("E");
		myTreeSet.add("H");
		System.out.println("Contents of the myTreeSet: " + myTreeSet);
	}

}
