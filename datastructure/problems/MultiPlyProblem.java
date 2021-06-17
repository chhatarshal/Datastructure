package com.csingh.datastructure.problems;

public class MultiPlyProlem {

	 public static String multiply(String num1, String num2) {
	        // 
		 	if (num1.length() > num2.length()) { 
	        	return multiply(num2, num1);
	        }
	        
	        int n1 = num1.length();
	        int n2 = num2.length();
	        
	        int[] res = new int[n1+n2];
	        
	        int offset = 0;
	        
	        for (int i = n1-1; i >= 0; i--) {
	            int d1 = Character.getNumericValue(num1.charAt(i));
	        
	            int carry = 0;
	            
	            int idx = offset;
	            
	            for (int j = n2-1; j >= 0; j--) {
	            
	            	int d2 = Character.getNumericValue(num2.charAt(j));
	                
	            	int mul = d1*d2 + carry + res[idx];
	                
	            	res[idx++] = mul%10;
	                
	            	carry = mul/10;
	            }
	            while (carry != 0) {
	                
	            	res[idx++] = carry%10;
	                
	            	carry /= 10;
	            }
	            offset++;
	        }
	        int i = res.length-1;
	        while (i >= 0 && res[i] == 0) {
	        	i--;
	        }
	        
	        if (i < 0) {
	        	return "0";
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        while (i >= 0) {
	        	sb.append(res[i--]);
	        }
	        return sb.toString();
	    }
	 
	 public static void main(String[] args) {
		System.out.println(multiply("498828660196", "840477629533"));
	}
}
