package com.dsa.questions.Questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToNumber {

	    
	    
	    static Map<Integer, String> values = new LinkedHashMap<>();
		//={1000:"M",900:"CM",500:"D",400:"CD",100:"C",90:"XC",50:"L",40:"XL",10:"X",9:"IX",5:"V",4:"IV",1:"I"}
		static {
	          values.put(1000, "M");
	         values.put(900, "CM");
	          values.put(500, "D");
	         values.put(400, "CD"); 
	        values.put(100, "C");
	         values.put(90, "XC");        
	         values.put(50, "L");
	         values.put(40, "XL");
			 values.put(10, "X");
			 values.put(9, "IX");
			 values.put(5, "V");
			 values.put(4, "IV");
		       values.put(1, "I");
			
		}
	    
	    public static String calculate(int num) {
			String result = "";
			for (Map.Entry<Integer, String> entr: values.entrySet()) {
	        	Integer key = entr.getKey();
	        		if (num / key > 0) {
	        			result = result + entr.getValue();
	        			num = num - key;
	        			result = result +calculate(num);
	        			break;
	        		}
	        			
	        }
			return result;
		}
	    
	    public String intToRoman(int num) {
	       return calculate(num);
	        
	    }
	
}
