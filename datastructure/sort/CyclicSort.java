package com.csingh.datastructure.sort;

import java.util.Arrays;

public class CyclicSort {

	
	public static void main(String[] args) {
		int array[] =  new int []{2, 3, 1, 5, 4};
		
		for (int i = 0; i < array.length; i++) {
			while (array[i] != i + 1) {
				swap(array, i, array[i] - 1);
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
