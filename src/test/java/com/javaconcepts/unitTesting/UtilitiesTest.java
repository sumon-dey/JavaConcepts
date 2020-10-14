package com.javaconcepts.unitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class UtilitiesTest {
	private Utilities utils;

	@Before
	public void setUp() {
		utils = new Utilities();
	}

	@Test
	public void everyNthChar() throws Exception {
		char[] output = utils.everyNthChar(new char[] { 'h', 'e', 'l', 'l', 'o' }, 2);
		assertArrayEquals(new char[] { 'e', 'l' }, output);
		char[] output2 = utils.everyNthChar(new char[] { 'h', 'e', 'l', 'l', 'o' }, 8);
		assertArrayEquals(new char[] { 'h', 'e', 'l', 'l', 'o' }, output2);
	}

	@Test
	public void removePairs() throws Exception {
		assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
		assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
		assertNull("Did not get null returned when argument passed was null", utils.removePairs(null));
		assertEquals("A", utils.removePairs("A"));
		assertEquals("", utils.removePairs(""));
	}

	@Test
	public void converter() throws Exception {
		assertEquals(300, utils.converter(10, 5));
	}

	@Test(expected = ArithmeticException.class)
	public void converter_arithmeticException() throws Exception {
		utils.converter(10, 0);
	}

	@Test
	public void nullIfOddLength() throws Exception {
		assertNull(utils.nullIfOddLength("odd"));
		assertNotNull(utils.nullIfOddLength("even"));
	}

}
