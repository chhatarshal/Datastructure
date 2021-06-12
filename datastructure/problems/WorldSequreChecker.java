package com.csingh.datastructure.problems;

import java.util.Arrays;
import java.util.List;

public class WorldSequreChecker {
	
	public static boolean validate(List<String> words) {
		if (words.size() < 1) {
			return false;
		}
		int i = 0;
		for (String s1 : words) {
			if (s1.length() < 1) {
				return false;
			}
			
			if (!(s1.equals(getVerticalWord(words, i)))) {
				return false;
			}
			i = i + 1;
		}		
		return true;
	}
	
	public static String getVerticalWord(List<String> words, int index) {
		String word = "";
		for (String s: words) {
			if (s.length() - 1 >= index)
			word = word + s.charAt(index);
		}
		return word;
	}
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("abc", "bc", "d");
		System.out.println(validate(words));
	}

}
