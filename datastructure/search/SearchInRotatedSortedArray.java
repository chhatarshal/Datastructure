package com.csingh.datastructure.search;

public class SearchInRotatedSortedArray {
	
public static int searchPivit(int array[]) {		
		int start = 0;
		int end = array.length - 1;
		if (array.length == 1) {
			return 0;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;	
			// 7, 8, 9  mid = 8
			// 12, 1, 2, 3
			// mid > first
			// 10, 21, 41, 44, 8
			// base case
			
			if (mid == 0  && array[mid + 1] < array[mid]) {
				return mid;
			}
			if (array[0] < array[array.length - 1]) {
				return array.length - 1;
			}
			if (array[mid + 1] < array[mid] && array[mid - 1] < array[mid]) {
				return mid;
			}
			if (array[0] > array[mid]) {
			//pvt in first half
				end = mid - 1;
			} else {
				// pvt in second half
				start = mid + 1;
			}
		}
		return -1;
	}

public static int binarySearh(int number, int array[], int start, int end) {
	while (start <= end) {
		int mid = start + (end - start) / 2;
		if (number > array[mid]) {
			start = mid + 1;
		}
		if (number < array[mid]) {
			end = mid - 1;
		}
		if (number == array[mid]) {
			return mid;
		}
	}		
	
	return -1;
}
	
	public static void main(String[] args) {
		int arry[]= new int [] {1, 2, 3, 4, 5, 6, 7};
		int idx = searchPivit(arry);
		int target = 7;
		int el = binarySearh(target, arry, 0, idx);
		if (el == -1) {
			el = binarySearh(target, arry, idx + 1, arry.length - 1);
		}
		System.out.println("Anser is :  " + el);
		
	}

}
