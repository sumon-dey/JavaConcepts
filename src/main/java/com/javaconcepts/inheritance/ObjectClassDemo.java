/*The "Object" class is the superclass of all the classes in Java. The "Object" class consists of the following methods:
 * equals(Object obj)
 * hashCode()
 * toString()
 * wait()
 * wait(long milliseconds)
 * wait(long milliseconds, int nanoseconds)
 * notify()
 * notifyAll()
 * getClass()
 * clone()
 * finalize()*/
/*Except the wait, getClass, notify and notifyAll methods, all other methods can be overridden*/
package com.javaconcepts.inheritance;

public class ObjectClassDemo {

	public static void main(String[] args) {
		Object obj = new ObjectClassDemo();
		obj.equals(obj);
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.getClass());

	}

	public String toString() {
		return "New Object";
	}

}
