/*VM Arguments are passed to the Virtual Machine and are designed to instruct the VM to do something.
 * We can do things like controlling the heap size etc. They can be accessed by the programs via a call to
 * System.getProperty().
 * For Example, we can input:
 * -Dfname="Sam" 
 * -Dlname="Smith" -> In "VM Arguments" field of IDE
 * java -Dfname="Sam" -Dlname="Smith" VMArguments -> From CLI*/
package com.javaconcepts.arguments;

public class VMArguments {

	public static void main(String[] args) {
		System.out.println("First Name: " + System.getProperty("fname"));
		System.out.println("Last Name: " + System.getProperty("lname"));
	}

}
