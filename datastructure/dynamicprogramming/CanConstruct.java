package com.csingh.datastructure.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class CanConstruct {
	
	
	public static boolean canConstruct(String target, List<String> constuct) {
		if (target != null && target.trim().length() < 1) {
			return true;
		}
		for (String s:constuct) {
			if (target.contains(s)) {
				String subStr = target.replace(s, "");
				if (canConstruct(subStr, constuct)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(canConstruct("", Arrays.asList("bd", "cd")));
	}

}
