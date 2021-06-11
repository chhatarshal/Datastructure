package com.csingh.datastructure.search;

public class LinearSearch {
	
	public static int searchIndex(int []arr, int itm) {
		for (int i =0; i < arr.length; i++) {
			if (arr[i] == itm) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Index value is " + LinearSearch.searchIndex(new int [] {2, 4, 5, 6, 4, 3, 6},  3));
	}

}
