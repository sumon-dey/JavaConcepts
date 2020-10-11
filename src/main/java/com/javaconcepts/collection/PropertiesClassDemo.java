package com.javaconcepts.collection;

import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesClassDemo {
	/*
	 * The "Properties" class is a non-generic subclass of the "Hashtable" class. It
	 * is used to maintain the lists of values in which the key is a "String" and
	 * the value is also a "String". It is the type of object returned by
	 * System.getProperties() when obtaining the environmental values.
	 */
	public static void main(String[] args) {

		Properties prop1 = new Properties();
		prop1.put("Bangladesh", "Dhaka");
		prop1.put("USA", "Washington D.C.");
		prop1.put("Kenya", "Nairobi");
		prop1.put("India", "Delhi");
		prop1.put("UK", "London");
		// get a set-view of the keys
		Set<?> countries = prop1.keySet();
		// show all the countries and their capitals
		for (Object country : countries) {
			System.out.println("The capital of " + country + " is " + prop1.getProperty((String) country) + ".");
		}
		System.out.println();
		// look for country and capital not in list (use of default value)
		String str1 = prop1.getProperty("Sri Lanka", "Not Found");
		System.out.println("The capital of Sri Lanka is " + str1 + ".");
		System.out.println("***********************************************************");

		// use of default list
		Properties defaultPropertiesList = new Properties();
		defaultPropertiesList.put("Sri Lanka", "Default capital of Sri Lanka");
		defaultPropertiesList.put("Nepal", "Default capital of Nepal");
		Properties prop2 = new Properties(defaultPropertiesList);
		prop2.put("Bangladesh", "Dhaka");
		prop2.put("USA", "Washington D.C.");
		prop2.put("Kenya", "Nairobi");
		prop2.put("India", "Delhi");
		prop2.put("UK", "London");
		// get a set-view of the keys
		Set<?> countries2 = prop2.keySet();
		// show all the countries and their capitals
		for (Object country : countries2) {
			System.out.println("The capital of " + country + " is " + prop2.getProperty((String) country) + ".");
		}
		System.out.println();
		// look for country and capital not in list (use of default value)
		String str2 = prop2.getProperty("Sri Lanka");
		String str3 = prop2.getProperty("Nepal");
		System.out.println("The capital of Sri Lanka is " + str2 + ".");
		System.out.println("The capital of Nepal is " + str3 + ".");
		System.out.println("***********************************************************");

		// obtaining the Properties object from System.getProperties()
		Properties prop3 = System.getProperties();
		Set<Object> prop3KeysAsSet = prop3.keySet();
		Collection<Object> prop3ValuesAsCollection = prop3.values();
		System.out.println("******************************************************");
		System.out.println("Environmental Variable Keys: ");
		System.out.println("******************************************************");
		for (Object prop3KeysElement : prop3KeysAsSet) {
			System.out.println(prop3KeysElement.toString());
		}
		System.out.println("******************************************************");
		System.out.println("Environmental Variable Values: ");
		System.out.println("******************************************************");
		for (Object prop3ValuesElement : prop3ValuesAsCollection) {
			System.out.println(prop3ValuesElement.toString());
		}
		System.out.println("******************************************************");
	}

}
