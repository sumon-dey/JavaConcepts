package com.javaconcepts.unitTesting.junit;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/*To write your custom rule, we need to implement the "TestRule" interface. 
 * This interface defines the apply(Statement, Description) method which must return 
 * an instance of Statement. Statement represents the tests within the JUnit runtime and 
 * Statement#evaluate() runs these. Description describes the individual test. It allows to read
 *  information about the test via reflection.*/
public class JUnitCustomRule implements TestRule {
	@Override
	public Statement apply(Statement base, Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				long start = System.currentTimeMillis();
				try {
					base.evaluate();
				} finally {
					System.out.printf("Time taken for %s: %s milli sec%n", description.getDisplayName(),
							System.currentTimeMillis() - start);
				}
			}
		};
	}
}

