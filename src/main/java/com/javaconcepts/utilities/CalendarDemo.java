package com.javaconcepts.utilities;

import java.util.Calendar;

public class CalendarDemo {
	/*
	 * The "Calendar" is an abstract class (subclass example:- GregorianCalendar)
	 * that provides a set of methods that allows us to convert a time in
	 * milliseconds to a number of useful components (year, month, day, hour,
	 * minute, second)
	 */
	public static void main(String[] args) {
		String[] months = { "Jan", "Feb", "Mar", "April", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		// create a calendar initialized with the current date and time in the default
		// locale and timezone
		Calendar calendar = Calendar.getInstance();

		// display current time and date information
		System.out.print("Date: ");
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE) + " ");
		System.out.println(calendar.get(Calendar.YEAR));

		System.out.print("Time: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));

		// set the time and date information and display it
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);
		System.out.print("Updated Time: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));
	}

}
