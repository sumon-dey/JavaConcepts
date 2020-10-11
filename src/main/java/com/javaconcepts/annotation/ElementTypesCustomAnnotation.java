/*Element Types for Target Annotation*/
package com.javaconcepts.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*Various Element Types and where they can be applied to*/
/*ANNOTATION_TYPE -> another annotation*/
/*CONSTRUCTOR -> constructor*/
/*FIELD -> field*/
/*LOCAL_VARIABLE -> local variable*/
/*METHOD -> method*/
/*MODULE -> module*/
/*PACKAGE -> package*/
/*PARAMETER -> parameter*/
/*TYPE -> class, interface or enumeration*/
/*TYPE_PARAMETER -> type parameter*/
/*TYPE_USE -> type use*/

// how to include multiple element types in the Target annotation
@Target({ ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD })
public @interface ElementTypesCustomAnnotation {

}
