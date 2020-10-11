package com.javaconcepts.utilities;

import java.util.Date;

public class DateDemo {
	/*
	 * The "Date" class encapsulates the current date and time. Much of its original
	 * methods had been moved to the "Calendar" and the "DateFormat" classes.
	 */
	public static void main(String[] args) {

		// instantiate two Date objects
		Date date1 = new Date();
		Date date2 = new Date(545322);

		// display time and date using toString() method
		System.out.println(date1);
		System.out.println(date1.toString());

		// display the number of milliseconds since midnight, January 1, 1970 GMT
		long msec = date1.getTime();
		System.out.println("Millseconds since Jan1, 1970 GMT = " + msec);

		// after
		System.out.println("Is date2 after date1?: " + date2.after(date1));
		// before
		System.out.println("Is date2 before date1?: " + date2.before(date1));

		// clone
		Object date3 = date2.clone();
		System.out.println("After cloned from date2, date3 is: " + date3);

		// compareTo
		System.out.println("Comparing invoking object date2 to date1: " + date2.compareTo(date1));
		System.out.println("Comparing invoking object date1 to date2: " + date1.compareTo(date2));
		System.out.println("Comparing invoking object date2 to date3: " + date2.compareTo((Date) date3));

		// equals
		System.out.println("Does date2 equal date3?: " + date2.equals((Date) date3));
		System.out.println("Does date1 equal date2?: " + date1.equals(date2));

		// hashCode
		System.out.println("Hashcode of date1 is: " + date1.hashCode());

		// toInstant and from
		System.out.println(date2.from(date1.toInstant()));

		// setTime
		date2.setTime(45443);
		System.out.println("After using setTime(), date2 is: " + date2);

	}

}
