package com.javaconcepts.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	/*
	 * The "TreeMap" class extends the "AbstractMap" class and implements the
	 * "NavigableMap" interface. It creates map stored in a tree-structure. It
	 * provides an efficient means of storing key/value pairs in sorted (ascending
	 * key) order and allows rapid retrieval.
	 */
	public static void main(String[] args) {
		TreeMap<String, Double> myTreeMap = new TreeMap<String, Double>();
		myTreeMap.put("John Doe", 3224.22);
		myTreeMap.put("Tom Smith", 533.74);
		myTreeMap.put("Jane Baker", 6343.12);
		myTreeMap.put("Tod Hall", 53.2);
		myTreeMap.put("Ralph Smith", -32.3);
		System.out.println(myTreeMap);
		System.out.println("*******************************************************");

		// Iterating over the elements
		System.out.println("After converting to set: ");
		Set<Map.Entry<String, Double>> myTreeMapCollectionViewAsSet = myTreeMap.entrySet();
		System.out.println(myTreeMapCollectionViewAsSet);
		System.out.println("After iterating using for-each: ");
		for (Map.Entry<String, Double> eachEntry : myTreeMapCollectionViewAsSet) {
			System.out.println("Key: " + eachEntry.getKey() + ", Value: " + eachEntry.getValue());
		}
		System.out.println("*******************************************************");
	}

}
