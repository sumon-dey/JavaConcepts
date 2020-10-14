package com.javaconcepts.unitTesting.testng;

import org.testng.annotations.Test;

public class TestNGTimeout {

	/* timeout -> The maximum number of milliseconds a test case should take */
	@Test(timeOut = 5000) // time in mulliseconds
	public void thisTestShouldPass() throws InterruptedException {
		Thread.sleep(4000);
	}

	@Test(timeOut = 1000)
	public void thisTestShouldFail() {
		while (true)
			;
	}
}
