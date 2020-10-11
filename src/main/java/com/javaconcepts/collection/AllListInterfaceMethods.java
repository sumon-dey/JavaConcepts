package com.javaconcepts.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class AllListInterfaceMethods {

	public static void main(String[] args) {
		// 1st list
		List<String> citiesInAustralia = new ArrayList<>();
		citiesInAustralia.add("Sydney");
		citiesInAustralia.add("Melbourne");
		citiesInAustralia.add("Perth");
		citiesInAustralia.add("Adelaide");
		citiesInAustralia.add("Brisbane");
		// 2nd list
		List<String> citiesInIndia = new ArrayList<>();
		citiesInIndia.add("Pune");
		citiesInIndia.add("Mumbai");
		// 3rd list
		List<String> citiesInUS = new ArrayList<>();
		citiesInUS.add("New York");
		citiesInUS.add("New Jersey");

		/* Methods inherited from the Collection interface */
		// add
		citiesInIndia.add(1, "Kolkata");
		System.out.println(citiesInIndia.toString());
		// addAll
		citiesInIndia.addAll(citiesInAustralia);
		citiesInIndia.addAll(citiesInUS);
		System.out.println(citiesInIndia.toString());
		// remove
		citiesInIndia.remove(1);
		System.out.println(citiesInIndia.toString());
		// removeAll
		citiesInIndia.removeAll(citiesInUS);
		System.out.println(citiesInIndia.toString());
		// retainAll
		citiesInIndia.retainAll(citiesInAustralia);
		System.out.println(citiesInIndia.toString());
		// clear
		citiesInIndia.clear();
		System.out.println(citiesInIndia.toString());
		// isEmpty
		System.out.println(citiesInIndia.isEmpty());
		// contains
		citiesInIndia.add("Pune");
		citiesInIndia.add("Mumbai");
		System.out.println(citiesInIndia.contains("Pune"));
		// containsAll
		System.out.println(citiesInIndia.containsAll(citiesInIndia));
		// equals
		System.out.println(citiesInIndia.equals(citiesInIndia));
		System.out.println(citiesInIndia.equals(citiesInUS));
		// size
		System.out.println(citiesInAustralia.size());
		// iterator
		Iterator<String> itr = citiesInAustralia.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// splititerator
		Spliterator<String> splitItr = citiesInAustralia.spliterator();
		splitItr.forEachRemaining(System.out::println);
		// hashCode
		System.out.println(citiesInAustralia.hashCode());
		// stream
		System.out.println(citiesInAustralia.stream());
		// parallelStream
		System.out.println(citiesInAustralia.parallelStream());
		// toArray
		Object[] indianCities = citiesInIndia.toArray();
		System.out.println(Arrays.toString(indianCities));

		System.out.println("****************************************************");

		/* Concrete methods of the List interface */
		// add (int index,E object)
		citiesInIndia.add(1, "Kolkata");
		System.out.println(citiesInIndia.toString());
		// addAll (int index, Collection<? extends E> c)
		citiesInIndia.addAll(2, citiesInUS);
		System.out.println(citiesInIndia.toString());
		// get
		System.out.println(citiesInIndia.get(0));
		// indexOf
		System.out.println(citiesInIndia.indexOf("Mumbai"));
		// lastIndexOf
		System.out.println(citiesInIndia.lastIndexOf("Mumbai"));
		// listIterator
		ListIterator<String> listItr1 = citiesInIndia.listIterator();
		while (listItr1.hasNext()) {
			System.out.println(listItr1.next());
		}
		ListIterator<String> listItr2 = citiesInIndia.listIterator(3);
		while (listItr2.hasNext()) {
			System.out.println(listItr2.next());
		}
		// remove
		citiesInIndia.remove(2);
		citiesInIndia.remove("New Jersey");
		System.out.println(citiesInIndia.toString());
		// set
		citiesInIndia.set(1, "Bengaluru");
		System.out.println(citiesInIndia.toString());
		// subList
		System.out.println(citiesInIndia.subList(1, 3));
		System.out.println("****************************************************");
	}

}
