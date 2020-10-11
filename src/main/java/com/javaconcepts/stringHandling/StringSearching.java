package com.javaconcepts.stringHandling;

public class StringSearching {

	public static void main(String[] args) {
		String str1 = "Hello World Java";

		// "indexOf()"
		System.out.println(str1.indexOf("W"));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.indexOf("Universe")); // This will output -1
		System.out.println("***********************************************");

		// "lastIndexOf()"
		System.out.println(str1.lastIndexOf("o"));
		System.out.println(str1.lastIndexOf(" "));
		System.out.println(str1.lastIndexOf("Universe")); // This will output -1
		System.out.println("***********************************************");
	}

}
