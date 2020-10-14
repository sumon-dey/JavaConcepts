package com.javaconcepts.unitTesting.junit;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/*With JUnit rules we can add behavior to each tests in a test class. 
 * We can annotate fields of type TestRule with the @Rule annotation. 
 * We can create objects which can be used and configured in our test methods. 
 * This adds more flexibility to our tests. We could, for example, specify which exception 
 * message we expect during the execution of our test code.*/
public class JUnitBuiltInRules {

	/*
	 * The "TemporaryFolder" class allows to setup files and folders which are
	 * automatically removed after each test run.
	 */
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException {
		File createdFolder = folder.newFolder("newfolder");
		File createdFile = folder.newFile("myfilefile.txt");
		assertTrue(createdFile.exists());
	}

}
