package com.csingh.datastructure.sort;

public class CyclicSortProblem {
	
	public static void main(String[] args) {
		int array[] =  new int []{5, 4, 2, 1, 0};
		int missing = findMissingNumber(array);
		System.out.println(missing);
	}
	
	public static int findMissingNumber(int array[]) {
		sort(array);
		for (int i = 0; i < array.length; i++) {
			if (i != array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void sort(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
	}
	
	static void swap(int arr[], int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;
	}

}
