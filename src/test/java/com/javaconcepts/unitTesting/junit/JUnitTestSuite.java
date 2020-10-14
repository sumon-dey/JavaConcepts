package com.javaconcepts.unitTesting.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*If we have several test classes, we can combine them into a test suite. 
 * Running a test suite executes all test classes in that suite in the specified order. 
 * A test suite can also contain other test suites.*/
@RunWith(Suite.class)
@Suite.SuiteClasses({ JUnitTestSuiteDemoTest1.class, JUnitTestSuiteDemoTest2.class })

public class JUnitTestSuite {

}
