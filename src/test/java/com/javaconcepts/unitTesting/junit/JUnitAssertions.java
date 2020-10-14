package com.javaconcepts.unitTesting.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

/*The JUnit Assertions are used to test for certain conditions. They allows us to specify the error messages, the expected
 * and the actual results. An assertion method compares the actual value returned by a test to the expected value. It 
 * throws an "AssertException" if the comparison fails*/

public class JUnitAssertions {

	@Test
	public void methodWithAssertions() {
		boolean a = true;
		boolean b = false;
		String name = "Sam";
		JUnitAssertions jUnitAssertions1 = null;
		JUnitAssertions jUnitAssertions2 = new JUnitAssertions();
		JUnitAssertions jUnitAssertions3 = jUnitAssertions2;

		// checks that the two values are same
		assertEquals("Message -> The two values are not equal", a, !b);
		// checks that the float/double values match. The tolerance is the number of
		// decimals which must be the same.
		assertEquals("Message -> The two float/double values are not equal with tolerance", 43.3343d, 43.3355f, 2);

		// checks that the two values are not same
		Assert.assertNotEquals(43.4333, 5443L);

		// checks that the boolean condition is true
		Assert.assertTrue(a);
		Assert.assertTrue("Message -> The boolean condition is not true", a);

		// checks that the boolean condition is false
		Assert.assertFalse(b);
		Assert.assertFalse("Message -> The boolean condition is not false", b);

		// checks that the object is null
		Assert.assertNull("Message -> The reference variable is not a null reference", jUnitAssertions1);

		// checks that the object is not null
		Assert.assertNotNull("Message -> The reference variable is  a null reference", jUnitAssertions2);

		// checks that both the variables refer to the same object.
		Assert.assertSame("Message -> The variables do not refer to the same object", jUnitAssertions2,
				jUnitAssertions3);

		// checks that both variables refer to different objects
		Assert.assertNotSame("Message -> The variables refer to the same object", jUnitAssertions2, jUnitAssertions1);

		// Let the method fail. This might be used to check that a certain part of the
		// code is
		// not reached or to have a failing test before the test code is implemented.
		// The message parameter is optional.
		Assert.fail("Failed intentionally");
	}

}
