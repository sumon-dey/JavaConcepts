package com.javaconcepts.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
	/*
	 * The "LinkedHashMap" class extends the "HashMap" class. It maintains a linked
	 * list of the entries in the map, in the order in which they were
	 * inserted/accessed. Thus, when iterating through a collection-view of a
	 * LinkedHashMap, the elements will be returned in the order in which they were
	 * inserted/accessed.
	 */
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> myLinkedHashMap = new LinkedHashMap<Integer, String>();
		myLinkedHashMap.put(3, "Pune");
		myLinkedHashMap.put(2, "Chennai");
		myLinkedHashMap.put(5, "Patna");
		myLinkedHashMap.put(1, "Mumbai");
		myLinkedHashMap.put(4, "Kolkata");
		System.out.println(myLinkedHashMap);

		// Iteration on the collection-view of the LinkedHashMap
		Set<Map.Entry<Integer, String>> myLinkedHashMapCollectionView = myLinkedHashMap.entrySet();
		System.out.println("After converting to set: ");
		System.out.println(myLinkedHashMapCollectionView);
		Iterator<Map.Entry<Integer, String>> itr = myLinkedHashMapCollectionView.iterator();
		System.out.println("After iterating using Iterator: ");
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
