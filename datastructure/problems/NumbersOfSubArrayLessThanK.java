package com.csingh.datastructure.problems;

import java.util.Arrays;

public class NumbersOfSubArrayLessThanK {
	
	
	public static int countSubArray(int []array, int k) {
		// Base case1
		if (array == null || array.length < 1) {
			return 0;
		}
		// Sorting array 
		Arrays.sort(array);
		
		// Again base case check because we have sorted array
		if (k < array[0]) {
			return 0;
		}
		// we do not need to check whole array because array is sorted just find subarray where you have to find all less than k combination
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			 if (array[i] < k) {
				j = j + 1;
			 }
		}
		int totalcount = j;
		int l =0;
		
		int cumm = 0;
		int processing = 0;
		while (processing < j) {
			cumm = cumm + array[l];
			if (cumm < k) {
				for (int i = l + 1; i < j; i++) {
					int tmp = cumm + array[i];
					if (tmp >= k) {
						break;
					}
					totalcount = totalcount + 1;					
				}
			}
			l = l + 1;
			if (l == j) {
				processing = processing + 1;
				l = processing;
				cumm = 0;
			}
		}
		return totalcount;
	}
	
	public static void main(String[] args) {
		long result = countSubArray(new int [] {12, 11, 20}, 10);
		// [1], [2], [3], [1, 2, 3], [1, 2], [1, 3], [2, 3]   {1, 2, 3}, 10
		System.out.println(result);
	}

}
