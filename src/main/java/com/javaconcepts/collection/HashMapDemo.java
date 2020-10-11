package com.javaconcepts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	/*
	 * The "HashMap" class extends the "AbstractMap" class and implements the "Map"
	 * interface. It uses a hash table to store the map. It does not guarantee the
	 * order of the elements.
	 */
	public static void main(String[] args) {
		HashMap<String, Double> accountBalances = new HashMap<String, Double>();
		accountBalances.put("John Doe", 3224.22);
		accountBalances.put("Tom Smith", 533.74);
		accountBalances.put("Jane Baker", 6343.12);
		accountBalances.put("Tod Hall", 53.2);
		accountBalances.put("Ralph Smith", -32.3);
		System.out.println(accountBalances);
		System.out.println("*******************************************************");

		// converting to the collection-view of Set
		Set<Map.Entry<String, Double>> accountBalancesSet = accountBalances.entrySet();
		System.out.println("After conversion to the Set view: " + accountBalancesSet);
		System.out.println("*******************************************************");
		// iterating over the set
		for (Map.Entry<String, Double> eachAccountBalance : accountBalancesSet) {
			System.out.println(eachAccountBalance.getKey() + ": " + eachAccountBalance.getValue());
		}
		System.out.println("*******************************************************");
		// changing a value
		double johnSmithsAccountBalance = accountBalances.get("John Doe");
		accountBalances.put("John Smith", johnSmithsAccountBalance + 1000);
		System.out.println("After changing John Smith's account balance:");
		System.out.println(accountBalances);
		System.out.println("*******************************************************");
	}

}
