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
		return Character.getNumericValue(sb.toString().charAt(n-1));
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
		return Character.getNumericValue(sb.toString().charAt(n-1));
	}
	
	public static int helper(int n, int total)  {
		return n;
	}
	
	public static int countDigit(int n) {
		int total = 0;
		if (n < 10) {
			return n;
		}
		int h = n /  10;
		total = (int)Math.pow(h, 10) - 1;
		return total;		
	}
	
	public static String buildNDigitString(int n) {
		String output = "";
		// 9 12 1200
		int c = n / 10; // 0  1 120
		int r = c % 10; // 9 2   0
		
		
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println("Try to solve this problem with AI");
		//int digit = NthDigitOfInfiniteNumberSeries.getNthDigit(10000000);
		//System.out.println(digit);
		System.out.println(findNthDigit(10));
	}
	
	
	 public static int findNthDigit(int n) {
	       	System.out.println("This solution is copied from somewhere");
	        // Lets find the number which contains the n'th digit. We know the following about the
	        // intervals of power of 10. 
	        
	        // Num of digits in 1 - 9: 9*10^0  * 1 = 9
	        // Num of digits in 10 - 99: 9*10^1 * 2 = 180
	        // Num of digits in 100 - 999: 9*10^2 * 3 = 2700 
	        // Num of digits in 1000 - 9999: 9'^10*^3 * 4 = 36000
	        // so on...
	        
	        // The first thing we do is find the interval, so we know how many digits the 
	        // number containing the n'th digit consist of. We do this by subtracting n with
	        // the number of digits in the previous intervals and stop if we come under zero: Ex. if n = 234 
	        // then the interval is 234 - 9 (1. interval) - 180 (2. interval) = 45 (we stop here or else the next
	        // interval brings us under zero), so the number falls in the interval with three digits which gives 
	        // us that our number consist of three digits with one of them the n'th digit.
	        
	        int digit = 1; // How many digits does our number with the n'th digit consist of.
	        int num_digits_in_interval = 9; // How many digits are there in this current interval
	        
	        while (n - num_digits_in_interval > 0) {
	            n -= num_digits_in_interval; 
	            digit += 1;
	            num_digits_in_interval = 9 * ((int) Math.pow(10, digit - 1))*digit; // calculate numbers of digits in next interval
	           
	            // This test ensures that we break if we overflow
	            if (num_digits_in_interval < 0) break;
	        }
	        
	        // We now know how many digits our number containing the n'th digit consist of (the variable digit).
	        // Now lets find that specific number so we can extract the n'th digit from it.
	        
	        // We do this by first locating the interval (variable base). With n = 234, the base is 10^(digit - 1) = 10^(3 - 1) = 100.
	        int base = ((int) Math.pow(10, digit - 1));
	        
	        // What is the number then? Well its just a matter of dividing whats left in the variable n with the
	        // number of digits each number in this interval consist of. Taking our exampel with 234. After the while loop n = 45, so 
	        // our number is (base + (n - 1) / digit = 100 + (45 - 1) / 3) = 114. Why are we extracting -1? Because we count from zero, 
	        // and if n was 3 then the n'th digit is in the base 100 which itself consist of 3 digits.
	        int number =  base + (n - 1) / digit;
	  
	        // Lastly we can find the n'th digit. We do this by converting our number to String to make it easy for us to
	        // extract the n'th digit. The n'th digit is just then ((n - 1) % digit). Why -1? Again because we count from 0. Finishing
	        // our example the n'th number is "114".charAt((45 - 1) % 3) = "114".charAt(2) = '4'
	        char digit_in_number = String.valueOf(number).charAt((n - 1) % digit);
	        
	        // digit_in_number is a char, we need to convert it to integer, we do this by extracting the char '0'.
	        return digit_in_number - '0';
	    }
	
}
