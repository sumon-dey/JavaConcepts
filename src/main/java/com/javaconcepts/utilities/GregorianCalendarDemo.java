package com.javaconcepts.utilities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
	/*
	 * The "GregorianCalendar" class is a subclass of the "Calendar" abstract class
	 * and implements all the abstract methods of the Calendar class plus it has
	 * some of its concrete methods like isLeapYear()
	 */
	public static void main(String[] args) {
		String[] months = { "Jan", "Feb", "Mar", "April", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int year;

		// create a GregorianCalendar initialized with the current date and time in the
		// default locale and timezone
		GregorianCalendar gregorianCalendar = new GregorianCalendar();

		// display current time and date information
		System.out.print("Date: ");
		System.out.print(months[gregorianCalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gregorianCalendar.get(Calendar.YEAR));

		System.out.print("Time: ");
		System.out.print(gregorianCalendar.get(Calendar.HOUR) + ":");
		System.out.print(gregorianCalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gregorianCalendar.get(Calendar.SECOND));

		// test if the current year is a leap year
		if (gregorianCalendar.isLeapYear(year)) {
			System.out.println("The current year is a Leap Year.");
		} else {
			System.out.println("The current year is not a Leap Year.");
		}

	}

}
