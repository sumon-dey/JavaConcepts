package com.javaconcepts.systemAndCompiler;

public class ClassAndClassLoaderDemo {
	/*
	 * "Class" class encapsulates the runtime state of a class or interface. Objects
	 * of type "Class" are created automatically when classes are loaded. We cannot
	 * create an object of the class "Class"
	 */
	/*
	 * The "ClassLoader" class defines how the classes are loaded by the Java
	 * runtime system
	 */
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		Class<?> classObj;
		classObj = x.getClass();
		System.out.println("x is an object of type: " + classObj.getName());
		classObj = y.getClass();
		System.out.println("y is an object of type: " + classObj.getName());
		classObj = classObj.getSuperclass();
		System.out.println("The superclass of the object y is: " + classObj.getName());
		System.out.println(classObj.getClassLoader().getClass().getName());
	}

}

class X {
	int a;
	float b;
}

class Y extends X {
	double c;
}
