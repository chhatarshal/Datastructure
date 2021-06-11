package com.csingh.datastructure.search;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static int binarysearch(int arr[], int item) {
		Arrays.sort(arr);
		int mid = (int)(arr.length / 2);
		return sort(arr, mid,  item);		
	}
	
	public static int sort(int sortedArr[], int mid, int itm) {
		if (sortedArr[mid] > itm) {
			mid = mid / 2;
			return sort(sortedArr, mid, itm);
		}
		if (sortedArr[mid] > itm) {
			mid = mid + (sortedArr.length - mid) / 2;
			return sort(sortedArr, mid, itm);
		}
		if (sortedArr[mid] == itm) {
			return mid;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(binarysearch(new int [] {1, 2, 3, 5, 6, 8}, 5));
	}

}
