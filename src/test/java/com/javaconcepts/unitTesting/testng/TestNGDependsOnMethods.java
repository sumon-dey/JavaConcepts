package com.javaconcepts.unitTesting.testng;

import org.testng.annotations.Test;

public class TestNGDependsOnMethods {

	@Test
	public void loginTest() {
		System.out.println("Inside the loginTest() method");
	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("Inside the homePageTest() method");
	}

	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest() {
		System.out.println("Inside the searchPageTest() method");
	}

	@Test(dependsOnMethods = "loginTest")
	public void registrationPageTest() {
		System.out.println("Inside the registrationPageTest() method");
	}

}
