package com.csingh.datastructure.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
	
	public static boolean canConstruct_efficient(String target, List<String> constuct) {
		Map<String, Boolean> memo = new HashMap<>();
		return helper(target, constuct, memo);		
	}
	
	public static boolean helper(String target, List<String> constuct, Map<String, Boolean> memo) {
		if (target != null && target.trim().length() < 1) {
			return true;
		}
		Optional<Boolean> opt = Optional.ofNullable(memo.get(target));
		if (opt.isPresent()) {
			return opt.get();
		}
		for (String s:constuct) {
			if (target.contains(s)) {
				String subStr = target.replace(s, "");
				if (helper(subStr, constuct, memo)) {
					memo.put(subStr, true);
							return true;
				}
			}
		}
		memo.put(target, false);
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(canConstruct("", Arrays.asList("bd", "cd")));
		System.out.println(canConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar")));
		System.out.println(canConstruct_efficient("skatedgddsgsdhdhghfddfgsdfsdsfgsdgfsdfsgsdfgreqgjuykbxzvxc5fhdhfhfhfhhfhfrfgsdtdgdfdfgsgdsfboard", Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", 
				"i", "j", "k", "l", "m","n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")));
	}

}
