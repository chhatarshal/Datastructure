package com.csingh.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Its like partial sort");
		System.out.println("Why use insertion sort?"
				+ "\n Usefull when array is already sorted"
				+ "\n Stable algorithm"
				+ "");
		
		int array[] =  new int []{};
		
		for (int i = 0; i < array.length - 1; i++) {
			//left from i loop
			for (int j = i + 1; j > 0; j --) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j -1);
				}
			}
		}
		Arrays.stream(array).forEach(System.out::print);
	}
	
	static void swap(int arr[], int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}
}
