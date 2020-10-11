package com.javaconcepts.streamsAndFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Abhishek");
		names.add("Shama");
		names.add("Richard");
		names.add("Akansha");
		names.add("Ashish");

		// Modify existing List, create a new List with the names ending with
		// "a",convert to upper case and extract the first element from the
		// newly created list
		List<String> newNamesList = names.stream().filter(name -> name.endsWith("a")).map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("The first element of the new list is: " + newNamesList.get(0));
		System.out.println("**************************************************************");

		// To print the unique numbers from an Integer list and sort the array
		List<Integer> numberList = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		numberList.stream().distinct().sorted().forEach(number -> System.out.println(number));
	}

}
