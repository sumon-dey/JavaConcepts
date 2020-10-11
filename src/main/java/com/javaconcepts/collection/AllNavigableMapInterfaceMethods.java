package com.javaconcepts.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

/*The "NavigableMap" interface extends the "SortedMap" interface and declares the behavior of a map
 * that supports the retrieval of entries based on the closest match to a given key or keys. */

public class AllNavigableMapInterfaceMethods {

	public static void main(String[] args) {
		NavigableMap<Integer, String> myNavigableMap = new TreeMap<Integer, String>();
		myNavigableMap.put(2, "Kolkata");
		myNavigableMap.put(1, "Pune");
		myNavigableMap.put(4, "Mumbai");
		myNavigableMap.put(5, "Kolkata");
		myNavigableMap.put(3, "Bengaluru");
		System.out.println(myNavigableMap);

		// firstEntry
		System.out.println("First Entry: " + myNavigableMap.firstEntry());

		// lastEntry
		System.out.println("Last Entry: " + myNavigableMap.lastEntry());

		// ceilingEntry and ceilingKey
		System.out.println(myNavigableMap.ceilingEntry(3));
		System.out.println(myNavigableMap.ceilingKey(3));

		// floorEntry and floorKey
		System.out.println(myNavigableMap.floorEntry(4));
		System.out.println(myNavigableMap.floorKey(4));

		// higherEntry and higherKey
		System.out.println(myNavigableMap.higherEntry(4));
		System.out.println(myNavigableMap.higherKey(4));

		// lowerEntry and lowerKey
		System.out.println(myNavigableMap.lowerEntry(3));
		System.out.println(myNavigableMap.lowerKey(3));

		// descendingKeySet
		System.out.println("descendingKeySet: " + myNavigableMap.descendingKeySet());

		// navigableKeySet
		System.out.println("navigableKeySet: " + myNavigableMap.navigableKeySet());

		// descendingMap
		System.out.println(myNavigableMap.descendingMap());

		// headMap
		System.out.println(myNavigableMap.headMap(3, true));
		System.out.println(myNavigableMap.headMap(3, false));

		// tailMap
		System.out.println(myNavigableMap.tailMap(2, true));
		System.out.println(myNavigableMap.tailMap(2, false));

		// subMap
		System.out.println("SubMap: " + myNavigableMap.subMap(3, true, 5, false));
		System.out.println("SubMap: " + myNavigableMap.subMap(3, false, 5, true));

		// pollFirstEntry and pollLastEntry
		System.out.println("Polled first entry: " + myNavigableMap.pollFirstEntry());
		System.out.println("After polling first entry: " + myNavigableMap);
		System.out.println("Polled last entry: " + myNavigableMap.pollLastEntry());
		System.out.println("After polling last entry: " + myNavigableMap);
	}

}
