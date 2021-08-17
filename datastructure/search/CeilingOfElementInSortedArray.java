package com.csingh.datastructure.search;

public class CeilingOfElementInSortedArray {
	
	
	public static int celling(int arr[], int target) {
		
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;
		
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			}
			if (arr[mid] == target) {
				return arr[mid];
			}
		}		
		return arr[mid];
	}
	
	public static void main(String[] args) {
		System.out.println(celling(new int [] {14, 16, 17}, 15));
	}

}
