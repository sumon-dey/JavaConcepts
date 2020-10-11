/*Maps*/
package com.javaconcepts.streamsAndFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMaps {

	public static void main(String[] args) {
		// Print all the names, having last letter 'a', in UpperCase
		List<String> names = new ArrayList<>();
		names.add("Azbhishek");
		names.add("Shama");
		names.add("Richard");
		names.add("Akansha");
		names.add("Ashish");
		names.stream().filter(name -> name.endsWith("a")).map(name -> name.toUpperCase())
				.forEach(name -> System.out.println(name));
		System.out.println("*************************************************");

		// Print all the names, having first letter 'a', in UpperCase in a
		// sorted way
		names.stream().filter(name -> name.startsWith("A")).sorted().map(name -> name.toUpperCase())
				.forEach(name -> System.out.println(name));
		System.out.println("*************************************************");

	}

}
