package com.javaconcepts.stringHandling;

public class StringComparison {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Java";
		String str4 = "HELLO";

		// "equals() and equalsIgnoreCase()"
		System.out.println("str1 is equal to str2  -> " + str1.equals(str2));
		System.out.println("str1 is equal to str3  -> " + str1.equals(str3));
		System.out.println("str2 is equal to str4 (ignoring the case sensitivity)  -> " + str2.equalsIgnoreCase(str4));
		System.out.println("**********************************************");

		// "regionMatches"
		String str5 = "This is Hello World Java";
		String str6 = "Hello";
		System.out.println(str5.regionMatches(8, str6, 0, 5));
		System.out.println("**********************************************");
		// where 8-> start index of the invoking string
		// str6 -> the String being compared with
		// 0 -> start index of str6
		// 5 -> The number of characters which are compared

		// "startsWith() and endsWith()"
		String str7 = "Foobar";
		System.out.println("str7 starts with Foo -> " + str7.startsWith("Foo"));
		System.out.println("str7 ends with ar -> " + str7.endsWith("ar"));
		System.out.println(str7.startsWith("ob", 2)); // with starting index
		System.out.println("**********************************************");

		// "compareTo() and compareToIgnoreCase()"
		/*
		 * In "compareTo()", a String is less than another if it comes before the other
		 * in dictionary order and a String is greater than another if it comes after
		 * the other in dictionary order. The method compareTo() is specified by the
		 * Comparable<T> interface which the "String" class implements. The result of
		 * the comparison is as follows:- less than 0 = The invoking string is less than
		 * the compared string, greater than 0 = The invoking string is greater than the
		 * compared string, 0 = The two strings are equal
		 */
		String[] arr = { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid",
				"of", "their", "country" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[i]) < 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		System.out.println("**********************************************");
	}

}
