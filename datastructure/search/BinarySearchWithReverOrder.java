package com.csingh.datastructure.search;

public class BinarySearchWithReverOrder {

	public static int binarySearh(int number, int array[]) {
		
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (number > array[mid]) {
				end = mid - 1;
			}
			if (number < array[mid]) {
				start = mid + 1;
			}
			if (number == array[mid]) {
				return mid;
			}
		}		
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(binarySearh(1, new int [] {10, 5, 3, 1}));
	}
}
