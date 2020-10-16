package com.javaconcepts.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetAndLinkedHashSetDemo {
	/*
	 * The "HashSet" class extends the "AbstractSet" class and implements the "Set"
	 * interface. It creates a collection that uses a hash table for storing
	 * elements using the "hashing" technique.
	 */
	/*
	 * Hashing -> "Hashing" is a mechanism in which the informational content of a
	 * key is used to determine a unique value (hashcode). The hashcode is then used
	 * as the index at which the data associated with the key is stored. The
	 * transformation of the key into its hashcode is performed automatically. Our
	 * code cannot directly index the hash table. Advantage of "hashing" is that it
	 * allows the execution time of add(), contains(), remove() and size() to remain
	 * constant even for large sets.
	 */
	/*
	 * HashSet does not guarantee the order of its elements because the "hashing"
	 * process does not usually lend itself to the creation of sorted sets.
	 */
	public static void main(String[] args) {
		// HashSet
		HashSet<String> myHashSet = new HashSet<String>();
		myHashSet.add("Cricket");
		myHashSet.add("Football");
		myHashSet.add("Hockey");
		myHashSet.add("Badminton");
		myHashSet.add("Tennis");
		System.out.println("Contents of myHashSet: " + myHashSet);
		System.out.println("*************************************************************");

		// LinkedHashSet -> It maintains a linked list of the entries in the Set in the order in which they were inserted.
		LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<String>();
		myLinkedHashSet.add("Cricket");
		myLinkedHashSet.add("Football");
		myLinkedHashSet.add("Hockey");
		myLinkedHashSet.add("Badminton");
		myLinkedHashSet.add("Tennis");
		System.out.println("Contents of myLinkedHashSet: " + myLinkedHashSet);
		System.out.println("*************************************************************");
	}

}
