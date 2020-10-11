package com.javaconcepts.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

// Getting the Annotation Information at runtime
public class CustomAnnotationDemo2 {

	public static void main(String[] args) {
		CustomAnnotationDemo obj1 = new CustomAnnotationDemo();
		// get the Class
		Class<?> annotationClass = obj1.getClass();
		// get the Method
		try {
			Method annotationMethod = annotationClass.getMethod("addVehicleNameToList", List.class);
			CustomAnnotation1 customAnnotation1 = annotationMethod.getAnnotation(CustomAnnotation1.class);
			System.out.println("customAnnotation1.value() -> " + customAnnotation1.value());
			System.out.println("customAnnotation1.name() -> " + customAnnotation1.name());
			System.out.println("************************************************");

			// to get all the annotations associated with RunTime
			Annotation[] allClassAnnotations = annotationClass.getAnnotations();
			System.out.println("********************** All Annotations of the class **************************");
			for (Annotation annotation : allClassAnnotations) {
				System.out.println(annotation);
			}
			System.out.println("********************** All Annotations of the methods **************************");
			Method[] allMethods = annotationClass.getMethods();
			for (Method method : allMethods) {
				Annotation[] methodAnnotation = method.getAnnotations();
				for (Annotation an : methodAnnotation) {
					System.out.println(an);
				}
			}
			System.out.println("********************* Marker Annotation **********************");
			Method m = annotationClass.getMethod("addVehicleNameToList", List.class);
			System.out.println("Is MarkerAnnotation present? " + m.isAnnotationPresent(MarkerAnnotation.class));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}
}
