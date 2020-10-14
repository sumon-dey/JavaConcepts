package com.javaconcepts.unitTesting.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGPriorityAndGroups {

	@Test(priority = 3, groups = "Regression")
	public void myTest1() {
		System.out.println("This is Regression Test1");
	}

	@Test(priority = 1, groups = "Regression")
	public void myTest2() {
		System.out.println("This is Regression Test2");
	}

	@Test(priority = 2, groups = "Smoke")
	public void myTest3() {
		System.out.println("This is Smoke Test");
	}

	@BeforeGroups(groups = "Regression")
	public void beforeGroups() {
		System.out.println("Inside the beforeGroups() method");
	}

	@AfterGroups(groups = "Regression")
	public void afterGroups() {
		System.out.println("Inside the afterGroups() method");
	}

}
