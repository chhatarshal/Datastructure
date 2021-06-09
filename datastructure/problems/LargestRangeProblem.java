package com.csingh.datastructure.problems;

import java.util.Arrays;

public class LargestRangeProblem {

	
	public static int[] getLartestAdjecentRange(int arr[]) {
		System.out.println("Complexity : O(n)");
		Arrays.sort(arr);
		int start = 0;
		int i = 0;
		int count = 0;
		int count2 = 0;
		int start2 = 0;
		if (arr.length == 2) {
			return arr;
		}
		if (arr.length == 1) {
			return new int[] {arr[0], arr[1]};
		}
		while (i < arr.length - 1) {
			if ((arr[i] + 1 == arr[i + 1]) || (arr[i] ==  arr[i + 1])) {
				if (count == 0) {
					start = i;
				}	
				count = count + 1;
				if (arr[i] + 1 != arr[i + 1]) {
					i = i + 1;
					continue;
				}
			} else {
				if (count > count2) {
					count2 = count;
					start2 = start;
					count = 0;
					start = 0;
				} 
			}
			i = i + 1;
		}		
		if (count2 > count && arr[start2] != arr[count2 + start2]) {
			return new int [] {arr[start2], arr[count2 + start2]};
		} else {
			return new int [] {arr[start], arr[count + start]};
		}
	}
	
	
	
	public static void main(String[] args) {
		int outarr[] = LargestRangeProblem.getLartestAdjecentRange(new int [] {1, 1, 1, 3, 4});
		System.out.println(outarr.length);
		System.out.println(outarr[0]);
		System.out.println(outarr[1]);
	}
}
