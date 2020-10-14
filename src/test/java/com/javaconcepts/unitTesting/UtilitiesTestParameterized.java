package com.javaconcepts.unitTesting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
	private Utilities utils;
	private String input;
	private String output;

	public UtilitiesTestParameterized(String input, String output) {
		this.input = input;
		this.output = output;
	}

	@Before
	public void setup() {
		utils = new Utilities();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testConditions() {
		return Arrays.asList(new Object[][] { { "ABCDEFF", "ABCDEF" }, { "AB88EFFG", "AB8EFG" },
				{ "112233445566", "123456" }, { "A", "A" } });
	}

	@Test
	public void removePairs() throws Exception {
		assertEquals(output, utils.removePairs(input));
	}
}
