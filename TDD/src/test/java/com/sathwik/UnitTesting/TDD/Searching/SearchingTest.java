package com.sathwik.UnitTesting.TDD.Searching;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SearchingTest {

	private int target = 5;
	
	Searching searching;

	@Before
	public void initializer() {
		Searching searching = new Searching();
	}
	
	@Test
	public void test_BinarySearchIfElementPresent_ReturnsTrue() {
		int arr[] = { 1, 2, 3, 4, 5 };
		// int target = 4;
		assertTrue(searching.performBinarySearch(arr, target));
		System.out.println("Binary Search : " + searching.performBinarySearch(arr, target));
	}

	@Test
	public void test_LinearSearchIfElementPresent_ReturnsTrue() {
		int arr[] = { 1, 2, 3, 4, 5 };
//		int target = 1;
		assertTrue(searching.performLinearSearch(arr, target));
		System.out.println("Linear Search : " + searching.performLinearSearch(arr, target));
	}

	@Test
	public void test_BinarySearchIfElementNotPresent_ReturnsFalse() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int target = 12;
		assertFalse(searching.performBinarySearch(arr, target));
		System.out.println("Binary Search : " + searching.performBinarySearch(arr, target));
	}

	@Test
	public void test_LinearSearchIfElementNotPresent_ReturnsFalse() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int target = 12;
		assertFalse(searching.performLinearSearch(arr, target));
		System.out.println("Linear Search : " + searching.performLinearSearch(arr, target));
	}
}