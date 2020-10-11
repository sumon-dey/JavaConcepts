package com.javaconcepts.utilities;

import java.util.SimpleTimeZone;

public class SimpleTimeZoneDemo {
	/*
	 * The "SimpleTimeZone" class is a subclass of the "TimeZone" class and
	 * implements its abstract methods. It allows us to work with time zones for a
	 * Gregorian calendar. It also computes daylight saving time.
	 */
	public static void main(String[] args) {
		SimpleTimeZone s1 = new SimpleTimeZone(730, "Australia");
		System.out.println("SimpleTimeZone representation of s1: " + s1);

		SimpleTimeZone s2 = new SimpleTimeZone(730, "Australia");
		System.out.println("Original s1: " + s1);

		// clone()
		Object c1 = s1.clone();
		System.out.println("Cloned object is: " + c1);

		// getRawOffset()
		int o1 = s1.getRawOffset();
		System.out.println("Returns offset of TimeZone s1: " + o1);

		// equals()
		System.out.println("Checking if both have same TimeZone: " + s1.equals(s2));
		System.out.println("Initial value is: " + s1);

		// setStartYear()
		s1.setStartYear(2020);
		System.out.println("Final value is: " + s1);

		// useDaylightTime()
		System.out.println("Checks whether s2 Use day light time: " + s2.useDaylightTime());

		// getDSTSavings()
		int d1 = s1.getDSTSavings();
		System.out.println("DST saving time for s1 is: " + d1);
	}

}
