package com.javaconcepts.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*Retention
 * Annotation Retention Policies - 
 * SOURCE - retained in the source file and discarded during compilation
 * CLASS - retained in the .class file during compilation but not available through the JVM during runtime
 * RUNTIME - retained in the .class file during compilation and is available through the JVM during runtime*/

/*"Target" specifies which Java elements the custom annotation can be used to annotate*/

/*"Inherited" specifies that the custom Java Annotation used in a class should be inherited
 *  by subclasses inheriting from that class*/

/*"Documented" signals the JavaDoc tool that your custom annotation 
 * should be visible in the JavaDoc for class using your custom annotation*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface CustomAnnotation1 {
	String value() default "Default Value"; // An annotation element with a default value

	String name();
}
