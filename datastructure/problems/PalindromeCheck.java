package com.csingh.datastructure.problems;

public class PalindromeCheck {
	
	public static boolean palindromeCheck(String texts) {
		if (texts == null || texts.length() < 1) {
			return false;
		}
		int begin = 0;
		int end = texts.length() - 1;
		while (begin < end) {
			if (texts.charAt(begin) != texts.charAt(end)) {
				return false;
			}
			begin = begin + 1;
			end = end - 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String input = "";
		boolean output = PalindromeCheck.palindromeCheck(input);
		System.out.println(output);
	}

}
