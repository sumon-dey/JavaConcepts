/*A "Type Annotation" is an annotation which can be used with the types e.g. return type of a method,  the
 * type of "this" within a method, a cast, array levels, an inherited class, a throws clause*/
package com.javaconcepts.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnno {

}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {

}

@Target(ElementType.TYPE_USE)
@interface Unique {

}

@Target(ElementType.TYPE_USE)
@interface MaxLen {
	int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
	String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {

}

@Target(ElementType.METHOD)
@interface Recommended {

}

// Type Annotation on a Type Parameter
class TypeAnnoDemo<@What(description = "Generic data type") T> {

	// Type Annotation on a Constructor
	public @Unique TypeAnnoDemo() {

	}

	// Type Annotation on the "String" type
	@TypeAnno
	String str;

	// Type Annotation on the field "test"
	@EmptyOK
	String test;

	// Type Annotation on "this"
	public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
		return 10;
	}

	/*
	 * Type Annotation on the Method Return Type ("void" return type cannot be
	 * annotated)
	 */
	public @TypeAnno Integer f2(int j, int k) {
		return j + k;
	}

	// Type Annotation on the Method Declaration
	public @Recommended Integer f3(String str) {
		return str.length() / 2;
	}

	// Type Annotation on the "throws" clause
	public void f4() throws @TypeAnno NullPointerException {

	}

	// Type Annotation on Array Levels
	String @MaxLen(10) [] @NotZeroLen [] w;

	// Type Annotation on the Array Element Type
	@TypeAnno
	Integer[] vec;

	public static void myMeth(int i) {

		// Type Annotation on a Type Argument
		TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

		// Type Annotation with "new"
		@Unique
		TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();
		Object x = Integer.valueOf(10);
		Integer y;

		// Type Annotation on a Cast
		y = (@TypeAnno Integer) x;
	}
}

//Type Annotation with Inheritance Clause
public class TypeAnnotation extends @TypeAnno TypeAnnoDemo<Boolean> {

}
