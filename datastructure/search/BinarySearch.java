package com.csingh.datastructure.search;

import java.util.Arrays;

public class BinarySearch {
	
	
	public static int binarysearch(int arr[], int item) {
		if (arr.length < 1) {
			return -1;
		}
		if (arr.length == 1 && arr[0] == item) {
			return item;
		}
		if (arr.length == 1 && arr[0] != item) {
			return -1;
		}
		
		Arrays.sort(arr);
		//check if element greater than last element of sorted array
		if (arr[arr.length - 1] < item) {
			return -1;
		}
		if (arr[0] > item) {
			return -1;
		}
		int mid = (int)(arr.length / 2);
		return sort(arr, mid,  item);		
	}
	
	public static int sort(int sortedArr[], int mid, int itm) {
		 
		if ((sortedArr[mid] > itm) && mid > 0 && (sortedArr[mid - 1] == itm)) {
			return sortedArr[mid - 1] ;
		}
		if ((sortedArr[mid] < itm) && mid < sortedArr.length -1 && (sortedArr[mid + 1] == itm)) {
			return sortedArr[mid + 1] ;
		}
		if ((sortedArr[mid] > itm) && mid > 0 && (sortedArr[mid - 1] < itm)) {
			return -1;
		}
		if ((sortedArr[mid] < itm) && mid < sortedArr.length -1 && (sortedArr[mid + 1] > itm)) {
			return -1;
		}
		if (sortedArr[mid] > itm) {
			int newmid = mid / 2;
			if (newmid == mid) {
				mid = mid - 1;
			} else {
			mid = newmid;
			}
			return sort(sortedArr, mid, itm);
		}
		if (sortedArr[mid] < itm) {
			int newmid = (sortedArr.length - mid) / 2;
			if (newmid == mid) {
				mid = mid + 1;
			} else {
			mid = newmid;
			}
			return sort(sortedArr, mid, itm);
		}
		if (sortedArr[mid] == itm) {
			return sortedArr[mid];
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(binarysearch(new int [] {1, 4, 10}, 5));
	}

}
