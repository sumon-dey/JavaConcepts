/*Java Reflection allows us to inspect or/and modify runtime attributes of classes, interfaces, fields and methods*/
package com.javaconcepts.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Reflection_Main_1 {

	/*
	 * Extracting information about the Person class and its constructor at
	 * runtime
	 */
	@Test
	public void extractClassInfo() {
		System.out.println("**************************************************");
		System.out.println("Extract Class Information");
		System.out.println("**************************************************");
		Object person = new Person("Sam", 30, 1.72);
		System.out.println("Class name is: " + person.getClass().getName());
		System.out.println("Class name is: " + person.getClass().getSimpleName());
		System.out.println("Class name is: " + person.getClass().getCanonicalName());
		Constructor<?>[] constructors = person.getClass().getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("Constructor: " + constructor);
		}
	}

	/* Extracting information about the fields of the Person class at runtime */
	@Test
	public void extractFieldnfo() throws Throwable {
		System.out.println("**************************************************");
		System.out.println("Extract Field Information");
		System.out.println("**************************************************");
		Object person = new Person("Sam", 30, 1.72);
		// Private field is not included
		System.out.println("**************************************************");
		System.out.println("Private field not included");
		System.out.println("**************************************************");
		Field[] fieldNames = person.getClass().getFields();
		for (Field fieldName : fieldNames) {
			System.out.println("Field: " + fieldName.getName() + " with Type: " + fieldName.getType());
		}
		// Private field is included
		System.out.println("**************************************************");
		System.out.println("Private field included");
		System.out.println("**************************************************");
		Field[] declaredFieldNames = person.getClass().getDeclaredFields();
		for (Field declaredFieldName : declaredFieldNames) {
			System.out.println("Field: " + declaredFieldName.getName() + " with Type: " + declaredFieldName.getType());
		}
		Field privateField = person.getClass().getDeclaredField("name");
		System.out.println("Private field in the Person class: " + privateField.getName());

	}

	/*
	 * Extracting information about the methods of the Person class at runtime
	 */
	@Test
	public void extractMethodnfo() {
		System.out.println("**************************************************");
		System.out.println("Extract Method Information");
		System.out.println("**************************************************");
		Object person = new Person("Sam", 30, 1.72);
		Method[] declaredMethodNames = person.getClass().getDeclaredMethods();
		for (Method declaredMethodName : declaredMethodNames) {
			System.out.println("Method: " + declaredMethodName.getName());
		}
	}

	/*
	 * To create an object of the Person class at runtime if we only know it's
	 * fully qualified class name
	 */
	@Test
	public void createObject() throws ClassNotFoundException {
		System.out.println("**************************************************");
		System.out.println("Create Object with class name");
		System.out.println("**************************************************");
		Class<?> clazzObject = Class.forName("com.javaconcepts.reflections.Person");
		System.out.println(clazzObject.getSimpleName());
		System.out.println(clazzObject.getName());
		System.out.println(clazzObject.getCanonicalName());
	}

	/* Extract the class modifiers used on a class at runtime */
	@Test
	public void extractClassModifier() throws ClassNotFoundException {
		System.out.println("**************************************************");
		System.out.println("Extract the Class Modifier");
		System.out.println("**************************************************");
		Class<?> personClass = Class.forName("com.javaconcepts.reflections.Person");
		int personClassModifiers = personClass.getModifiers();
		System.out.println(Modifier.isPublic(personClassModifiers));
		System.out.println(Modifier.isAbstract(personClassModifiers));
		System.out.println(Modifier.isPrivate(personClassModifiers));
	}

	/* Extract the package name of a class or object at runtime */
	@Test
	public void extractPackageName() throws ClassNotFoundException {
		System.out.println("**************************************************");
		System.out.println("Extract the Package Name of a class or object");
		System.out.println("**************************************************");
		Person person = new Person("Sam", 30, 1.72);
		Class<?> personClass = person.getClass();
		Package pkg = personClass.getPackage();
		System.out.println("Package Name: " + pkg.getName());
	}

	/* Extract the superclass name of a class at runtime */
	@Test
	public void extractSuperclassName() throws ClassNotFoundException {
		System.out.println("**************************************************");
		System.out.println("Extract the Superclass Name of the String class");
		System.out.println("**************************************************");
		String sampleString = "This is a sample string";
		System.out.println("Superclass of String class: " + sampleString.getClass().getSuperclass().getName());
	}

	/* Extract the interface name implemented by a class at runtime */
	@Test
	public void extractInterfaceName() throws ClassNotFoundException {
		System.out.println("**************************************************");
		System.out.println("Extract the Interface Name implemented by a class");
		System.out.println("**************************************************");
		Class<?> personClass = Class.forName("com.javaconcepts.reflections.Person");
		Class<?>[] personInterfaces = personClass.getInterfaces();
		System.out.println("Implemented Interface: " + personInterfaces[0].getName());
	}

}
