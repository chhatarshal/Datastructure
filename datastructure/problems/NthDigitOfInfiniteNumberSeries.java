package com.csingh.datastructure.problems;

public class NthDigitOfInfiniteNumberSeries {

	public static int getNthDigit(int n) {
		if (n < 10) {
			return n;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
		return Character.getNumericValue(sb.toString().charAt(n - 1));
	}

	public static int getNthDigit2(int n) {
		if (n < 10) {
			return n;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
		return Character.getNumericValue(sb.toString().charAt(n - 1));
	}

	public static int helper(int n, int total) {
		return n;
	}

	public static int countDigit(int n) {
		int total = 0;
		if (n < 10) {
			return n;
		}
		int h = n / 10;
		total = (int) Math.pow(h, 10) - 1;
		return total;
	}

	public static String buildNDigitString(int n) {
		String output = "";
		// 9 12 1200
		int c = n / 10; // 0 1 120
		int r = c % 10; // 9 2 0

		return output;
	}

	public static void main(String[] args) {
		System.out.println("Try to solve this problem with AI");
		// int digit = NthDigitOfInfiniteNumberSeries.getNthDigit(10000000);
		// System.out.println(digit);
		System.out.println(findNthDigit(10));
	}

	public static int findNthDigit(int n) {
		System.out.println("This solution is copied from somewhere");
		System.out.println("Core of this problem is to find out number of which we will get nth digits");
		int number_of_digits = 1;
		int num_digits_in_interval = 9;

		while (n - num_digits_in_interval > 0) {
			n = n - num_digits_in_interval;
			number_of_digits += 1;
			num_digits_in_interval = 9 * ((int) Math.pow(10, number_of_digits - 1)) * number_of_digits;
			if (num_digits_in_interval < 0)
				break;
		}

		int base = ((int) Math.pow(10, number_of_digits - 1));

		int number = base + (n - 1) / number_of_digits;

		char digit_in_number = String.valueOf(number).charAt((n - 1) % number_of_digits);
		return digit_in_number - '0';
	}

}
