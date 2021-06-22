package com.csingh.datastructure.problems;

public class LongestPalindrom {

	public static String helper(String s, int beg, int end) {
		while (beg >= 0 && end < s.length()) {
			if (s.charAt(beg) != s.charAt(end)) {
				break;
			}
			beg = beg - 1;
			end = end + 1;
		}
		return s.substring(beg + 1, end);
	}
	
	public static void main(String[] args) {
		String inp = "abcbaabba";
		String largest = "";
		for (int i = 1; i < inp.length(); i++) {
			String result1 = helper(inp, i - 1, i + 1);
			String result2 = helper(inp, i - 1, i);
			if (result1.length() > 1 && largest.length() < result1.length()) {
				largest = result1;
			}
			if (result2.length() > 1 && largest.length() < result2.length()) {
				largest = result2;
			}
		}
		System.out.println(largest);
	}
}
