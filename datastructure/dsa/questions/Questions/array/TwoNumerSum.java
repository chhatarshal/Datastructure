package com.dsa.questions.Questions.array;

import java.util.Arrays;

public class TwoNumerSum {
	
	public static void main(String[] args) {
		int result[] = twoNumberSum(new int[] {12, 3, 4, 5, -2}, 10);
		Arrays.stream(result).forEach(System.out::print);
	}

	private static int[] twoNumberSum(int[] is, int target) {
		for (int val : is) {
			int rm = target - val;
			for (int val2 : is) {
				if (val == val2) {
					continue;
				}
				if (rm == val2) {
					return new int[] {val, val2};
				}
			}
		}
		return new int[] {};
	}

}
