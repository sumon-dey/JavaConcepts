package com.javaconcepts.stringHandling;

import java.util.Arrays;

/*Both StringBuffer and StringBuilder are mutable classes which provide room for the character 
 * sequence to grow */

/*StringBuilder is same as StringBuffer, only difference being that StringBuilder is not Thread-safe and 
 * hence provides improved performance*/
public class StringBufferDemo {

	public static void main(String[] args) {
		String str1 = "Hello Java World Programmers";
		// by default, StringBuffer reserves room for 16 characters without reallocation
		StringBuffer strBuf1 = new StringBuffer();
		// we can define capacity during the StringBuffer object creation too
		StringBuffer strBuf2 = new StringBuffer(22);
		// we can pass a String in the StringBuffer constructor
		StringBuffer strBuf3 = new StringBuffer(str1);
		// we can pass a character sequence directly in the StringBuffer constructor
		StringBuffer strBuf4 = new StringBuffer("abcde");

		// StringBuffer methods

		// length(), capacity(), ensureCapacity(), setLength()
		System.out.println(strBuf1.length());
		System.out.println("Before ensuring capacity: " + strBuf1.capacity());
		strBuf1.ensureCapacity(40);
		System.out.println("After ensuring capacity: " + strBuf1.capacity());
		System.out.println("**********************************************");
		System.out.println(strBuf2.length());
		System.out.println(strBuf2.capacity());
		System.out.println("**********************************************");
		System.out.println(strBuf3.length());
		System.out.println(strBuf3.capacity());
		System.out.println("**********************************************");
		System.out.println("Before using setLength: " + strBuf4);
		System.out.println("Before using setLength, length is: " + strBuf4.length());
		System.out.println(strBuf4.capacity());
		strBuf4.setLength(4);
		System.out.println("After using setLength: " + strBuf4);
		System.out.println("After using setLength, length is " + strBuf4.length());
		System.out.println("**********************************************");

		// charAt() and setCharAt()
		System.out.println(strBuf4.charAt(2));
		strBuf4.setCharAt(2, 'k');
		System.out.println(strBuf4);
		System.out.println("**********************************************");

		// getChars()
		int start = 0;
		int end = 3;
		char[] chars1 = new char[end - start];
		strBuf4.getChars(0, 3, chars1, 0);
		System.out.println(Arrays.toString(chars1));
		System.out.println("**********************************************");

		// append()
		strBuf3.append(" is inside the StringBuffer"); // overloaded with String
		strBuf3.append(2); // overloaded with int
		Box3 myBox = new Box3();
		strBuf3.append(myBox); // overloaded with object
		System.out.println(strBuf3);
		System.out.println("**********************************************");

		// insert()
		StringBuffer strBuf5 = new StringBuffer("I Java");
		strBuf5.insert(2, "love ");
		System.out.println(strBuf5);
		System.out.println("**********************************************");

		// reverse()
		System.out.println(strBuf5.reverse());
		System.out.println("**********************************************");

		// delete() and deleteCharAt()
		StringBuffer strBuf6 = new StringBuffer("I love Java");
		strBuf6.delete(0, 1);
		System.out.println(strBuf6);
		strBuf6.deleteCharAt(1);
		System.out.println(strBuf6);
		System.out.println("**********************************************");

		// replace()
		StringBuffer strBuf7 = new StringBuffer("I like Java");
		System.out.println("Before replacing: " + strBuf7);
		strBuf7.replace(2, 6, "love");
		System.out.println("After replacing: " + strBuf7);
		System.out.println("**********************************************");

		// substring()
		StringBuffer strBuf8 = new StringBuffer("I love Java");
		System.out.println(strBuf8.substring(2));
		System.out.println(strBuf8.substring(2, 6));
		System.out.println("**********************************************");

		// indexOf() and lastIndexOf()
		StringBuffer strBuf9 = new StringBuffer("Java loves Java");
		System.out.println(strBuf9.indexOf("Java"));
		System.out.println(strBuf8.lastIndexOf("Java"));
		System.out.println("**********************************************");
	}

}

class Box3 {
	public String toString() {
		return ", This is a Box object";
	}
}
