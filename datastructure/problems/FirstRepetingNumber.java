package com.csingh.datastructure.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstRepetingNumber {
	
	
	
	public static int getFirstRepeatingNumberSolutionOne(int arr[]) {
		for (int i = 0; i < arr.length; i ++) {
			for (int j = i; j < arr.length; j ++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	public static int getFirstRepeatingNumberSolution(int arr[]) {
		System.out.println("Time complexity O(n)");
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (countMap.get(arr[i]) != null) {
				return arr[i];
			}
			countMap.put(arr[i], Integer.MIN_VALUE);
		}
		return -1;
		 
	}
	
	public static void main(String[] args) {
		int result = FirstRepetingNumber.getFirstRepeatingNumberSolutionOne(new int [] {4, 5, 5, 2, 4});
		System.out.println(result);
		int result2 = FirstRepetingNumber.getFirstRepeatingNumberSolution(new int [] {});
		System.out.println(result2);
	}

}
