package com.javaconcepts.collection;

import java.util.SortedMap;
import java.util.TreeMap;

/*The "SortedMap" interface extends the "Map" interface. It ensures that the entries are maintained in ascending
 * order based on the keys.*/

public class AllSortedMapInterfaceMethods {

	public static void main(String[] args) {
		SortedMap<Integer, String> mySortedMap = new TreeMap<Integer, String>();
		mySortedMap.put(2, "Kolkata");
		mySortedMap.put(1, "Pune");
		mySortedMap.put(4, "Mumbai");
		mySortedMap.put(5, "Kolkata");
		mySortedMap.put(3, "Bengaluru");
		System.out.println(mySortedMap);

		// comparator (returns null if already sorted)
		System.out.println(mySortedMap.comparator());

		// firstKey and lastKey
		System.out.println("First key of mySortedMap is: " + mySortedMap.firstKey());
		System.out.println("Last key of mySortedMap is: " + mySortedMap.lastKey());

		// headMap
		System.out.println("The headMap ending before 3 is: " + mySortedMap.headMap(3));

		// tailMap
		System.out.println("The tailMap starting after 3 is: " + mySortedMap.tailMap(3));

		// subMap
		System.out.println("The subMap starting with 2 and ending with 4 is: " + mySortedMap.subMap(2, 4));
	}

}
