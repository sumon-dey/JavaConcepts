package com.javaconcepts.unitTesting.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/*This will run the JUnit tests in alphabetical order. By default, JUnit assumes that all test methods can be executed in
 * an arbitrary order.*/

// @TestMethodOrder(MethodOrderer.Alphanumeric.class) -> Applicable for JUnit5
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitOrdering {

	@Test
	public void B() {
		System.out.println("This is inside method B.");
	}

	@Test
	public void A() {
		System.out.println("This is inside method A.");
	}

	@Test
	public void D() {
		System.out.println("This is inside method D.");
	}

	@Test
	public void E() {
		System.out.println("This is inside method E.");
	}

	@Test
	public void C() {
		System.out.println("This is inside method C.");
	}

}
