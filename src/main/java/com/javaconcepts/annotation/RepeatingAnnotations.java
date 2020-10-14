package com.javaconcepts.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Repeating Annotation - An annotation can be repeated on the same element with
 * the help of the @Repeated annotation.
 * 
 * @author Sumon Dey
 *
 */
public class RepeatingAnnotations {

	public static void main(String[] args) {
		myMeth("test", 10);
	}

	@MyAnno(str = "First Annotation", val = -1)
	@MyAnno(str = "Second Annotation", val = 100)
	public static void myMeth(String str, int i) {
		RepeatingAnnotations ob = new RepeatingAnnotations();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		} catch (NoSuchMethodException e) {
			System.out.println("Method not found");
		}
	}

}

// This is the Repeatable Annotation
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
	String str() default "Testing";

	int val() default 9000;
}

// This is the Container Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
	MyAnno[] value();
}
