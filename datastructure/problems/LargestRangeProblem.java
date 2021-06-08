package com.csingh.datastructure.problems;

import java.util.Arrays;

public class LargestRangeProblem {

	
	public static int[] getLartestAdjecentRange(int arr[]) {
		Arrays.sort(arr);
		int start = 0;
		int i = 0;
		int count = 0;
		int count2 = 0;
		int start2 = 0;
		if (arr.length < 2) {
			return new int [] {};
		}
		while (i < arr.length - 1) {
			if (arr[i] + 1 == arr[i + 1]) {
				if (count == 0) {
					start = i;
				}
				count = count + 1;
			} else {
				if ((count2 == 0 && count >0) || (count2 != -1 && count2 < count)) {
					count2 = count;
					start2 = start;
					count = 0;
					start = 0;
				} 
			}
			i = i + 1;
		}		
		System.out.println(start2);
		System.out.println(count2 + start2);
		return new int [] {arr[start2], arr[count2 + start2]};
	}
	
	
	
	public static void main(String[] args) {
		int outarr[] = LargestRangeProblem.getLartestAdjecentRange(new int [] {-8, 19});
		System.out.println(outarr.length);
		System.out.println(outarr[0]);
		System.out.println(outarr[1]);
	}
}
