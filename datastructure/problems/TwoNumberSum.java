package com.csingh.datastructure.problems;

public class TwoNumberSum {
	
	public static int[] findSum(int input[], int target) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if ((input[i] + input[j]) == target) {
					return new int [] {input[i], input[j]};
				}
			}
		}
		return new int [] {};
	}
	
	
	public static void main(String[] args) {
		int output[] = TwoNumberSum.findSum(new int [] {8, 2, 4, 5, 6, 12}, 6);
		System.out.println(output[0]);
		System.out.println(output[1]);
	}

}
