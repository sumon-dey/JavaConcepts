package com.javaconcepts.unitTesting.junit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*Using JUnit parameterization technique, a class can contain one test method and this method can 
 * be executed with different parameters provided. It helps developers save time when executing the same tests 
 * which differ only in their inputs and expected results*/
@RunWith(Parameterized.class)
public class JUnitParameterization {

	// fields used together with @Parameter must be public
	@Parameterized.Parameter(0)
	public int intValue1;
	@Parameterized.Parameter(1)
	public String stringValue1;

	/*
	 * Alternatively to use the @Parameter annotation we can use a constructor in
	 * which we can store the values for each test. The number of elements in each
	 * array provided by the method annotated with @Parameters must correspond to
	 * the number of parameters in the constructor of the class. The class is
	 * created for each parameter and the test values are passed via the constructor
	 * to the class.
	 */
	// Here, the fields used can be private, no need to be public when using
	// Parameterized with Constructor
	/*
	 * private int intValue2; public String stringValue2;
	 * 
	 * public JUnitParameterization(int intValue2, String stringValue2) {
	 * this.intValue2 = intValue2; this.stringValue2 = stringValue2; }
	 */

	/*
	 * A static method annotated with the @Parameters annotation generates and
	 * returns a collection of arrays. Each item in this collection is used as
	 * parameter for the test method.
	 */
	@Parameters
	public static Collection<Object[]> getData() {
		Object[][] data = new Object[][] { { 1, "Java" }, { 2, "Python" }, { 3, "JavaScript" }, { 4, "Kotlin" } };
		return Arrays.asList(data);
	}

	// Test Case
	@Test
	public void parameterizationTest() {
		System.out.println("The formed sentence is: " + intValue1 + " - " + stringValue1);
		System.out.println("*************************************************");
	}

}
