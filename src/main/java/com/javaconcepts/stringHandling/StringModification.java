package com.javaconcepts.stringHandling;

public class StringModification {

	public static void main(String[] args) {
		String str1 = "Hello Java World";

		// substring()
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2, 10));
		System.out.println("**************************************************");

		// concat()
		System.out.println(str1.concat(" ...this is added after the statement."));
		System.out.println("**************************************************");

		// replace()
		System.out.println(str1.replace('o', '\u00A9'));
		System.out.println(str1.replace("Java", "Python"));
		System.out.println("**************************************************");

		// trim() -> to remove the leading and trailing whitespaces
		String str2 = "   Hello World Java         \t \r \n     ";
		System.out.println(str2.trim());
		System.out.println("**************************************************");

		// join() -> Added in JDK8
		String str3 = String.join(",", "I", "love", "Java", "Programming");
		// here, "," is the delimiter
		System.out.println(str3);
		String str4 = String.join(":  ", "I", "love", "Java", "Programming");
		// here, ": " is the delimiter
		System.out.println(str4);
		System.out.println("**************************************************");
	}

}
