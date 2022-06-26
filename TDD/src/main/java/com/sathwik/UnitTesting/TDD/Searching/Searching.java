package com.sathwik.UnitTesting.TDD.Searching;

public class Searching {
	public boolean performBinarySearch(int arr[], int target) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = ((high - low) / 2) + low;
			if(arr[mid] == target) return true;
			else if(arr[mid] < target) low = mid+1;
			else if(arr[mid] > target) high = mid;
		}
		
		return false;
	}
	
	public boolean performLinearSearch(int arr[], int target) {
		for(int itr = 0; itr < arr.length; itr++) {
			if(arr[itr] == target) return true;
		}
		return false;
	}
}
