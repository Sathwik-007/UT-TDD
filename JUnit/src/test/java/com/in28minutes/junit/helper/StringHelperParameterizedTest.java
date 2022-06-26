package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	private String actual;
	private String expectedOutput;
	
	StringHelper helper = new StringHelper();

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.actual = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static List<String[]> testCases(){
		String [][]testcases = {{"true", "AABAA"}, {"false", "AABA"}};
		
		return Arrays.asList(testcases);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Yes() {
		assertEquals(expectedOutput, helper.areFirstAndLastTwoCharactersTheSame(actual));
	}

}
