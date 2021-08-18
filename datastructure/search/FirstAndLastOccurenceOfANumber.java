package com.csingh.datastructure.search;

public class FirstAndLastOccurenceOfANumber {
	public static int[] binarySearh(int number, int array[]) {			
			int start = 0;
			int end = array.length - 1;
			int firstLast[] = new int[2];
			int knownIdex = -1;
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (number > array[mid]) {
					start = mid + 1;
				}
				if (number < array[mid]) {
					end = mid - 1;
				}
				if (number == array[mid]) {
					//return mid;
					knownIdex = mid;
					break;
				}
			}		
			if (knownIdex != -1) {
				int startIdx = knownIdex;
				int endIdx = knownIdex;
				int fixedKnown = knownIdex;
				
				while (array[knownIdex] == number) {
					knownIdex = knownIdex - 1;
				}
				startIdx = knownIdex + 1;
				knownIdex = fixedKnown;
				
				while (array[knownIdex] == number) {
					knownIdex = knownIdex + 1;
				}
				endIdx = knownIdex - 1;
				firstLast[0] = startIdx;
				firstLast[1] = endIdx;
			}
			return firstLast;
		}
	
	public static void main(String[] args) {
		int result[] = binarySearh(1, new int [] {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 16});
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
