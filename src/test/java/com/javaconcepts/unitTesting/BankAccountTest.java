/*Junit Asserts*/
/*Some more Junit asserts*/
/*assertNotEquals() - We can use this instead of assertEquals() when we don't want the actual value to be equal to 
 * specific value */
/*assertArrayEquals() -  When we want to verify the value of an array. The assetEquals() method won't work because it
 * will consider two arrays equal if they are the same instance. The assertArrayEquals() method considers two arrays equal
 * when their lengths are the same and every elements in both the arrays are same and are in the same order*/
/* assertNull() and assertNotNull() - we can use this method to check for null (and non-null) values. We can use 
 * assertEquals() to check for null, but as with assertTrue() and assertFalse() methods, using assertNull() and assertNotNull()
 *  makes the inention clearer, and we only have to pass the actual value to the method.*/
/*assertSame() and assertNotSame() - We use this when we want to check whether two instances are the exact same instance.
 * Remember that the assertEquals() method uses the equals() method to test for quality. The assertSame() method compares
 * the object references.*/
/*assertThat() (in Junit4.4 and above) - This method compares the actual value against a matcher (not the matcher in the JDK, but a Junit matcher class).
 * This is more powerful than the other assert methods, since we compare the actual value against a range of values.*/
package com.javaconcepts.unitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
	private BankAccount account;
	private static int count;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This executes before the test cases start running. Count= " + count++);
	}

	@Before
	public void setup() {
		account = new BankAccount("Sam", "Dey", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test....");
	}

	@org.junit.Test
	public void deposit() throws Exception {
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance, 0); // Third parameter is the delta - the
											// range within which the test case
											// will be considered pass
	}

	@Test
	public void withdraw_branch() throws Exception {
		double balance = account.withdraw(600.00, true);
		assertEquals(400.00, balance, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void withdraw_notBranch() throws Exception {
		account.withdraw(600.00, false);
		fail("Should have thrown an IllegalArgumentException");
	}

	@Test
	public void getBalance_deposit() throws Exception {
		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(), 0);
	}

	@Test
	public void getBalance_withdraw() throws Exception {
		account.withdraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}

	@Test
	public void isChecking_true() throws Exception {
		assertEquals(true, account.isChecking());
		assertTrue("The account is NOT a checking account", account.isChecking());
	}

	@Test
	public void dummyTest() throws Exception {
		assertEquals(20, 21);
	}

	@After
	public void teardown() {
		System.out.println("Count= " + count++);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("This executes after all the test cases are run. Count= " + count++);
	}

}
