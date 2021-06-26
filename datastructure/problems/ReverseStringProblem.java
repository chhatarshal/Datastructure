package com.csingh.datastructure.problems;

public class ReverseStringProblem {

	
	public static String reverse(StringBuilder input) {
		int left = 0;
		int right = input.length() - 1;
		// abcd   left = 0 right = 4
		while (left <= right) {
			char temp = input.charAt(left);
			input.setCharAt(left, input.charAt(right));
			input.setCharAt(right, temp);
			left = left + 1;
			right = right - 1;
		}
		return input.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse a string using java StringBuilder instead of string because we cant modify String" );
		System.out.println(reverse(new StringBuilder("a")));
	}
}
