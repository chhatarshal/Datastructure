package com.csingh.datastructure.recursion;

public class NormalRecursionProblems {
	
	public static void main(String[] args) {
		forwardPrint(5);
		backPrint(5);
		System.out.println(factorial(5));
		System.out.println(sum(5));
		System.out.println(sumDigit(5));
		System.out.println(revsumDigit(5));
		System.out.println(sumOfDigits(543));
		System.out.println(reverseNuber(54373));
		 
	}
	
	private static int reverseNuber(int i) {
		 if (i < 10) {
			 return i;
		 }
		 int lastDigit = i % 10;
		 int reminingDigit = i / 10;
		 
		return (int) (lastDigit * Math.pow(10, String.valueOf(reminingDigit).length())  + reverseNuber(reminingDigit));
	}

	public static void forwardPrint(int n) {
		if (n < 1) {
			return;
		}
		System.out.println(n);
		forwardPrint(n - 1);
	}
	
	public static void backPrint(int n) {
		if (n < 1) {
			return;
		}		
		backPrint(n - 1);
		System.out.println(n);
	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}
	
	public static String sumDigit(int n) {
		if (n == 1) {
			return "1";
		}
		return n +""+ sumDigit(n - 1);
	}
	
	public static String revsumDigit(int n) {
		if (n == 1) {
			return "1";
		}
		return revsumDigit(n - 1) + ""+  n;
	}
	
	public static int sumOfDigits(int n) {
		if (String.valueOf(n).length() == 1) {
			return n;
		}
		return n % 10 + sumOfDigits(n/10);
	}


}
