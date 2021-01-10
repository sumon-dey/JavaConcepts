package com.javaconcepts.stringHandling;

public class StringConstantPoolAndHeap {

	public static void main(String[] args) {

		/*
		 * In the below, two objects got created (with the content "Hello") - one in the
		 * heap area (whose reference is str1) and another in the SCP (String Constant
		 * Pool) area whose reference is implicitly held by the JVM.
		 */
		String str1 = new String("Hello");

		/*
		 * In the below, no new object will get created since the literal "Hello" is
		 * already present in the SCP area. And now a reference str2 is pointing to the
		 * SCP area holding the literal "Hello".
		 */
		String str2 = "Hello";
		System.out.println(str1 == str2); // false

		/*
		 * Here, a new object with content "Hello" will get created in the Heap area
		 * (with reference str3) and no new new object will get created in the SCP area
		 * since the string literal "Hello" is already present in the SCP.
		 */
		String str3 = new String("Hello");
		System.out.println(str1 == str3); // false
		System.out.println(str2 == str3); // false

		/*
		 * Here, a new object (with content "Hello Java", without any reference and
		 * eligible for garbage collection) will get created in the heap area and
		 * another object with the content " Java" will get created in the SCP area.
		 */
		str1.concat(" Java");

		/*
		 * Here, no new object in SCP will get created since an object with the literal
		 * content " Java" is already present in the SCP area
		 */
		String str4 = " Java";

		/*
		 * Here, str5 reference points to the String literal content "Hello Java" of the
		 * object created in the SCP area. In the next line, since both "Hello" and
		 * " Java" are constant String literals, hence the addition will take place in
		 * compile time, resulting in "Hello Java" and thus no new object in SCP will
		 * get created.
		 * 
		 * 
		 */
		String str5 = "Hello Java";
		String str6 = "Hello" + " Java";
		System.out.println(str5 == str6); // true

		/*
		 * In the below, since there is a variable in the addition expression, hence the
		 * total expression will be evaluated during run time and two separate objects
		 * with the literals "Hello" and " Java" will get created in the SCP area.
		 */
		String str7 = "Hello Java";
		String str8 = "Hello";
		String str9 = str8 + " Java";
		System.out.println(str7 == str9); // false

		/*
		 * In the below, since "final" keyword is used with the variable str11, it
		 * essentially becomes a constant and hence the expression with addition is
		 * evaluated at compile time.
		 */
		String str10 = "Hello Java";
		final String str11 = "Hello";
		String str12 = str11 + " Java";
		System.out.println(str10 == str12); // true

	}

}
