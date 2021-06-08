package com.csingh.datastructure.problems;

public class StringNumberSeperation {
	
	
	public static String[] seperateStringAndNumericSolutionOne(String fullString) {
		String output[] = new String[2];
		String stringPart = "";
		String integerPart = "";
		for (int i = fullString.length() - 1; i >= 0; i --) {
			 char c = fullString.charAt(i);
			 int ascii = (int)c;
			 // ascii code of a z and A to Z lies between 65 and 122 including
			 if (ascii >= 65 && ascii <= 122) {
				 stringPart = stringPart + c;
			 } else {
				 integerPart = integerPart + c;
			 }
		}
		output [0] = stringPart;
		output [1] = integerPart;
		return output;
	}
	
	public static void main(String[] args) {
		String result[] = StringNumberSeperation.seperateStringAndNumericSolutionOne("abcddddddddd234");
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
