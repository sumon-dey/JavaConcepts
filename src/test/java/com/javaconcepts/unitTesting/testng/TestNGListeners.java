package com.javaconcepts.unitTesting.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TestNGListeners {

	@Test
	public void test1() {
		System.out.println("Inside the test1() method");
		Assert.assertEquals(false, true);
	}

}
