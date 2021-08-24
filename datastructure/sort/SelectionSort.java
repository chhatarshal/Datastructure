package com.csingh.datastructure.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		System.out.println("Good  for small list");
		System.out.println("N square is complexity");
		System.out.println("Rule is simple");
		System.out.println("Find max element in array\n"
				+ " Swap with last element of array\n"
				+ "Now again find max element in n-1 length array and do same\n"
				+ "Why n -1 this time because one element is already sorted in first attempt"
				+ "\n"
				+ "Like this size of array keeps on reducing");
		
		int sourceArray[] = new int[] { -4, 3, -5 };
		for (int i = 0; i < sourceArray.length - i; i++) {
			int max = findMax(sourceArray, 0, sourceArray.length - i - 1);
			swap(sourceArray, max, sourceArray.length - i - 1);
		}
		Arrays.stream(sourceArray).forEach(System.out::print);
	}

	public static int findMax(int arr[], int start, int end) {
		int max = start;
		for (int i = start; i <= end; i ++) {
			if (arr[i] > arr[max]) {
				max = i;
			} 
		}
		return max;
	}
	
	static void swap(int arr[], int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}
}
