package com.javaconcepts.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*A "map" is an object that stores associations between keys and values or key/value pairs where both keys and
 * values are also objects. A key is an object that we can use to retrieve a value at a later date. 
 * The keys must be unique but the values can be duplicated. Also, some maps can contain
 * null keys and null values whereas others cannot.*/

/*Maps don't implement the "Iterable" interface and "Collection" interface unlike the other Collection classes. Hence, for maps, we cannot use
 * enhanced for loop or iterator to traverse through its elements. But maps can give a collection-view (using the entrySet()
 * method which returns a set containing the element of the map) upon which the iterations can be done using forEach and iterator*/

/*To get the collection-view of the keys, use keySet() method*/

/*To get the collection-view of the values, use values() method*/

/*Following are the Map interfaces:
 * Map -> maps unique keys to values
 * Map.Entry -> describes an element (a key/value pair) in a map. This is an inner class of "Map"
 * NavigableMap -> extends the "SortedMap" interface to handle the retrieval of entries based on closes-match searches
 * SortedMap -> extends the "Map" interface so that the keys are maintained in ascending order.*/
public class AllMapInterfaceMethods {

	public static void main(String[] args) {
		Map<Integer, String> myMap1 = new HashMap<Integer, String>();
		Map<Integer, String> myMap2 = new HashMap<Integer, String>();
		// 1st map
		// put
		myMap1.put(2, "Kolkata");
		myMap1.put(1, "Pune");
		myMap1.put(4, "Mumbai");
		myMap1.put(5, "Kolkata");
		myMap1.put(3, "Bengaluru");
		System.out.println(myMap1);

		// 2nd map
		myMap2.put(2, "Kolkata");
		myMap2.put(1, "Pune");
		myMap2.put(4, "Mumbai");
		myMap2.put(5, "Kolkata");
		myMap2.put(3, "Bengaluru");
		System.out.println(myMap2);

		// size
		System.out.println("The size of myMap1 is: " + myMap1.size());
		// get
		System.out.println(myMap1.get(4));
		// getOrDefault
		System.out.println(myMap1.getOrDefault(2, "Default: This is not present"));
		System.out.println(myMap1.getOrDefault(10, "Default: This is not present"));
		// containsKey
		System.out.println(myMap1.containsKey(4));
		// containsValue
		System.out.println(myMap1.containsValue("Bengaluru"));
		// equals
		System.out.println(myMap1.equals(myMap2));
		// hashCode
		System.out.println(myMap1.hashCode());
		// isEmpty
		System.out.println("Is myMap1 empty?: " + myMap1.isEmpty());
		// clear and isEmpty
		myMap2.clear();
		System.out.println("Is myMap2 empty after clearing?: " + myMap2.isEmpty());

		// entrySet
		Set<Map.Entry<Integer, String>> theMapEntries = myMap1.entrySet();
		System.out.println("Below are the entries of myMap1: ");
		for (Map.Entry<Integer, String> eachEntry : theMapEntries) {
			System.out.println(eachEntry);
		}
		System.out.println("*******************************************************");

		// keySet
		Set<Integer> theMapKeys = myMap1.keySet();
		System.out.println("Below are the keys of myMap1: ");
		for (Integer eachKey : theMapKeys) {
			System.out.println(eachKey);
		}
		System.out.println("*******************************************************");

		// values
		Collection<String> theMapValues = myMap1.values();
		System.out.println("Below are the values of myMap1: ");
		for (String eachValue : theMapValues) {
			System.out.println(eachValue);
		}
		System.out.println("*******************************************************");

		// putAll
		myMap2.putAll(myMap1);
		System.out.println("After putAll, myMap2 is: ");
		System.out.println(myMap2);
		System.out.println("*******************************************************");

		// putIfAbsent
		System.out.println(myMap2.putIfAbsent(2, "Kolkata"));
		System.out.println(myMap2.putIfAbsent(2, "Chennai"));
		System.out.println(myMap2.putIfAbsent(6, "Nashik"));
		System.out.println(myMap2);
		System.out.println("*******************************************************");

		// remove
		myMap2.put(7, "Dehradun");
		System.out.println(myMap2.remove(7));
		System.out.println(myMap2);
		System.out.println(myMap2.remove(5, "Nashik"));
		System.out.println(myMap2.remove(6, "Nashik"));
		System.out.println(myMap2);
		System.out.println("*******************************************************");

		// replace
		myMap2.replace(5, "Kolkata", "Indore");
		System.out.println(myMap2);
		myMap2.replace(5, "Jaipur");
		System.out.println(myMap2);
		System.out.println("*******************************************************");
	}

}
