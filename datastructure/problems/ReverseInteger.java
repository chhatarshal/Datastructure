package com.csingh.datastructure.problems;

public class ReverseInteger {
	
	 public static int reverse(int x) {
	        int rev = 0;	        
	        while (x != 0) {
	            int reminder = x % 10;
	            x = x / 10;
	            // base case 
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;
	            rev = rev * 10 + reminder;
	        }
	        return rev;
	    }
	 
	 public static int reverse_(int x) {
		 return Integer.valueOf(new StringBuilder().append(x).reverse().toString());
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(reverse(29));
		 System.out.println(reverse_(29));	
	 }

}
