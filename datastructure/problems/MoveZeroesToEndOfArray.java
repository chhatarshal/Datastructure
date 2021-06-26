package com.csingh.datastructure.problems;

import java.util.Arrays;

public class MoveZeroesToEndOfArray {
	
	
	public static int[] moveZeroToEnd(int arr[]) {
		
		int zeros = 0;
		int temparray[] = new int[arr.length];
		for (int i: arr) {
			if (i == 0) {
				zeros = zeros + 1;
			}
		}
		
		int idx = 0;
		for (int i: arr) {
			if (i != 0) {
				temparray[idx] = i;
				idx = idx + 1;
			}
		}
		
		while (zeros>0) {			 
				temparray[idx] = 0;
				idx = idx + 1;	
				zeros = zeros - 1;
		}
		int i = 0;
		for (int val: temparray) {
			arr[i] = val;
			i = i + 1;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		int out[] = moveZeroToEnd(new int [] {1, 3, 0, 2});
		Arrays.stream(out).forEach(System.out::print);
		System.out.println("");
		out = moveZeroToEnd(new int [] {1,0, 0, 0, 5, 0, 3, 0, 2});
		Arrays.stream(out).forEach(System.out::print);
	}

}
