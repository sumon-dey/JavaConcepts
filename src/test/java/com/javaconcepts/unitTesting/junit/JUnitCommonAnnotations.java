package com.javaconcepts.unitTesting.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*JUnit is a Java unit testing framework which uses annotations to identify methods that specify a test and 
 * to configure them*/
public class JUnitCommonAnnotations {

	// @BeforeClass -> executed once, before the start of all the tests. It is used
	// to
	// perform time intensive activities, e.g. to connect to a database.
	// Methods marked with this annotation need to be defined as static to work with
	// JUnit.
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside beforeClass() method");
	}

	// @Before -> executed before each test (usually used to prepare the test
	// environments e.g. reading input data, initializing classes)
	@Before
	public void before() {
		System.out.println("Inside before() method");
	}

	// @Test -> identifies a method as a test method
	@Test
	public void firstTest() {
		System.out.println("Inside firstTest() method");
	}

	@Test
	public void secondTest() {
		System.out.println("Inside secondTest() method");
	}

	@Test
	public void thirdTest() {
		Assert.fail();
	}

	// @After -> executed after each test (usually used to cleanup the test
	// environment e.g. deleting temporary data, restoring defaults.It can also
	// save memory by cleaning up expensive memory structures)
	@After
	public void after() {
		System.out.println("Inside after() method");
	}

	// @AfterClass -> executed once, after all the tests have been executed. It is
	// used to perform clean-up activities, e.g. to disconnect from a database.
	// Methods annotated with this annotation need to be defined as static to work
	// with JUnit.
	@AfterClass
	public static void afterClass() {
		System.out.println("Inside afterClass() method");
	}

}
