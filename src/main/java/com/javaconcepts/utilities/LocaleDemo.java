package com.javaconcepts.utilities;

import java.util.Locale;

public class LocaleDemo {
	/*
	 * The "Locale" class is instantiated to produce objects that describe a
	 * geographical or cultural region. It provides us the ability to write programs
	 * that can execute in different international environments
	 * ("Internationalization") e.g. the Locale.CANADA represents the "Locale"
	 * object for Canada.
	 * 
	 * The Java Locale class object represents a specific geographic, cultural, or
	 * political region. It is a mechanism to for identifying objects, not a
	 * container for the objects themselves. A Locale object logically consists of
	 * the fields like languages, script, country, variant, extensions.
	 */
	public static void main(String[] args) {
		// create a new locale
		Locale locale = new Locale("EN", "INDIA");
		System.out.println("Locale: " + locale);

		// getDisplayLanguage()
		System.out.println("Language: " + locale.getDisplayLanguage());

		// getDisplayCountry()
		System.out.println("Country Name: " + locale.getDisplayCountry());

		// getDisplayName()
		System.out.println("Name: " + locale.getDisplayName());

		// hashCode() for the locale
		System.out.println("HashCode for this locale: " + locale.hashCode());
	}

}
