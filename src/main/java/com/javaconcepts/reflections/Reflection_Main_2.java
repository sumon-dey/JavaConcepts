/*Java Reflection allows us to inspect or/and modify runtime attributes of classes, interfaces, fields and methods*/
package com.javaconcepts.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Reflection_Main_2 {

	/* To inspect Constructors and create Class Objects at runtime */
	@Test
	public void createClassObject() throws Exception {
		System.out.println("**************************************************");
		System.out.println("Create Object using Constructor Information");
		System.out.println("**************************************************");
		Constructor<?>[] constructors = Bird.class.getConstructors();
		System.out.println("Number of Constructors of the Bird class is: " + constructors.length);
		Constructor<?> constructor1 = Bird.class.getConstructor();
		Constructor<?> constructor2 = Bird.class.getConstructor(String.class);
		Constructor<?> constructor3 = Bird.class.getConstructor(String.class, boolean.class);
		Bird bird1 = (Bird) constructor1.newInstance();
		Bird bird2 = (Bird) constructor2.newInstance("Pigeon");
		Bird bird3 = (Bird) constructor3.newInstance("Sparrow", true);
		System.out.println(bird1.getName());
		System.out.println(bird2.getName());
		System.out.println(bird3.getName());
	}

	/* To access Field values and to Modify them at runtime */
	@Test
	public void accessAndModifyFieldValues() throws Exception {
		System.out.println("**************************************************");
		System.out.println("Access Field Values and modify them");
		System.out.println("**************************************************");
		Bird bird = new Bird();
		Class<?> birdClass = bird.getClass();
		Bird birdObj = (Bird) birdClass.newInstance();
		Field field = birdClass.getDeclaredField("walks");
		field.setAccessible(true);
		System.out.println(field.getBoolean(bird));
		System.out.println(bird.walks());
		field.set(bird, true);
		System.out.println(field.getBoolean(bird));
		System.out.println(bird.walks());
	}

	/* To invoke Methods of a Class at runtime */
	@Test
	public void invokeMethods() throws Exception {
		System.out.println("**************************************************");
		System.out.println("Invoke Methods of a Class");
		System.out.println("**************************************************");
		Class<?> birdClass = Class.forName("com.javaconcepts.reflections.Bird");
		Bird bird = (Bird) birdClass.newInstance();
		Method setWalksMethod = birdClass.getDeclaredMethod("setWalks", boolean.class);
		Method walksMethod = birdClass.getDeclaredMethod("walks");
		boolean walks = (boolean) walksMethod.invoke(bird);
		System.out.println(walks);
		System.out.println(bird.walks());
		setWalksMethod.invoke(bird, true);
		boolean walks2 = (boolean) walksMethod.invoke(bird);
		System.out.println(walks2);
		System.out.println(bird.walks());
	}

}
