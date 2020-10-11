package com.javaconcepts.utilities;

import java.util.TimeZone;

public class TimeZoneDemo {
	/*
	 * The "TimeZone" is an abstract class which allows us to work with timezone
	 * offsets from Greenwich Mean Time (GMT) which is also referred to as
	 * Coordinated Universal Time (UTC). It also computes Daylight saving time.
	 */
	public static void main(String[] args) {

		// getAvailableIDs()
		String[] ids = TimeZone.getAvailableIDs();
		System.out.println("In TimeZone class, available IDs are: ");
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		System.out.println("******************************************************");

		// default
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone);

		// getID
		System.out.println(timeZone.getID());
		
		// getRawOffset
		System.out.println(timeZone.getRawOffset());
		
		// getTimeZone
		System.out.println(TimeZone.getTimeZone("IST"));
	}

}
