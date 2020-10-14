package com.javaconcepts.unitTesting.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGCommonAnnotations {

	// TestNG tags order -> suite>test>groups>classes>class>methods>method

	// Pre-Condition Annotations -> starting with @Before
	@BeforeSuite
	public void setUp() {
		System.out.println("BeforeSuite -> Setup System Property from Chrome");
	}

	@BeforeTest
	public void login() {
		System.out.println("BeforeTest -> Launch Chrome Browser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass -> Login to App");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("BeforeMethod -> Enter URL");
	}

	// Test Cases -> starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Test -> Testing the Google page title");
	}

	@Test
	public void searchTest() {
		System.out.println("Test -> Testing to Search");
	}

	@Test
	public void googleLogoTest() {
		System.out.println("Test -> Testing the Google logo");
	}

	// Post-Condition Annotations -> starting with @After
	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod -> Logout from App");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass -> Close Chrome Browser");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest -> Delete All Cookies");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("AfterSuite -> Generate Test Report");
	}

}
