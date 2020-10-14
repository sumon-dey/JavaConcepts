package com.javaconcepts.unitTesting.junit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JUnitCategories {

	@Test
	@Category(FunctionalGroupTests1.class)
	public void testFunctionalTests1Test1() {
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			count++;
		}
		System.out.println("Group (FunctionalGroupTests1): testFunctionalTests1Test1");
	}

	@Test
	@Category(FunctionalGroupTests1.class)
	public void testFunctionalTests1Test2() {
		int count = 0;
		for (int i = 1000; i < 4000; i++) {
			count++;
		}
		System.out.println("Group (FunctionalGroupTests1): testFunctionalTests1Test2");
	}

	@Test
	@Category(FunctionalGroupTests2.class)
	public void testFunctionalTests2Test1() {
		int count = 0;
		do {
			count++;
		} while (count != 1000);
		System.out.println("Group (FunctionalGroupTests2): testFunctionalTests2Test1");
	}

	@Test
	@Category(FunctionalGroupTests2.class)
	public void testFunctionalTests2Test2() {
		System.out.println("Group (FunctionalGroupTests2): testFunctionalTests2Test2");
	}

	@Test
	@Category({ IntegrationTests.class, FunctionalGroupTests1.class })
	public void testIntegrationTestsTest1() {
		System.out.println("Group (IntegrationTests): testIntegrationTestsTest1");
	}

	@Test
	@Category(SanityTests.class)
	public void testSanityTestsTest1() {
		System.out.println("Group (SanityTests): testSanityTestsTest1");
	}

}
