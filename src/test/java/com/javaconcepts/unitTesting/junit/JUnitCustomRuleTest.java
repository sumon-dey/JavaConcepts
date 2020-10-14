package com.javaconcepts.unitTesting.junit;

import org.junit.Rule;
import org.junit.Test;

public class JUnitCustomRuleTest {
	@Rule
	public JUnitCustomRule jUnitCustomRule = new JUnitCustomRule();

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("running testMethod1()");
		Thread.sleep(200);
	}

	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("running testMethod2()");
		Thread.sleep(150);
	}

	@Test
	public void testMethod3() throws InterruptedException {
		System.out.println("running testMethod3()");
		Thread.sleep(100);
	}
}
