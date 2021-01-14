package com.javaconcepts.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Annotation - Java feature that enables us to embed supplemental information
 * into a source file. All annotation automatically extend the "Annotation"
 * interface. Annotations can be applied to classes, methods, fields, parameters
 * and enum constants. Java built-in Annotations (From the
 * "java.lang.annotation" package) are:- Retention, Documented, Target,
 * Inherited, Repeatable, Native, Override, Deprecated, SuppressWarnings,
 * FunctionalInterface, SafeVarargs.
 * 
 * @author Sumon Dey
 * 
 */
@CustomAnnotation2
public class CustomAnnotationDemo {

	// custom annotation to field (instance variable)
	@CustomAnnotation3
	protected String vehicleName;

	// built-in annotation to method
	@Deprecated
	public String getVehicleName() {
		return this.vehicleName;
	}

	// custom annotation to method parameter
	public void setVehicleName(@CustomAnnotation4 String vehicleName) {
		this.vehicleName = vehicleName;
	}

	// custom, built-in and marker annotations to method
	@CustomAnnotation1(value = "123", name = "Modified Name")
	@SuppressWarnings(value = { "rawtypes" })
	@MarkerAnnotation
	public List addVehicleNameToList(List names) {

		// custom annotation to field (local variable)
		@CustomAnnotation5
		List localNames = names;
		if (localNames == null) {
			localNames = new ArrayList<>();
		}
		localNames.add(getVehicleName());
		return localNames;
	}

}
