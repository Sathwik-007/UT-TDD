package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testStringAtFirstTwoPositions() {
		assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
	}

	@Test
	public void testStringAtLastTwoPositions() {
		assertEquals("BCAA", helper.truncateAInFirst2Positions("BCAA"));
	}

	@Test
	public void testStringInBetween() {
		assertEquals("BBAAC", helper.truncateAInFirst2Positions("BBAC"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TestCaseFalse() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("AABB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TestCaseTrue() {
		assertEquals("Not a basic True returning scenario", helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
