package com.csingh.datastructure.problems;

import java.util.Stack;

public class BalanceBracket {

	private static Stack stack = new Stack();
	private static String allBrackets = "[] {}()";
	public static boolean balanceBracker(String s) {
		for (int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			if (!isBracket(c)) {
				continue;
			}
			if (stack.isEmpty()) {
				stack.push(c);
			} else {
				char c2 = (char)stack.pop();
				if (isPair(c2, c)) {
					continue;
				} else {
					stack.push(c2);
					stack.push(c);
				}
			}
		}
		
		return stack.isEmpty() ? true : false;
	}
	
	public static boolean isBracket(char c) {
		return allBrackets.contains(String.valueOf(c));
	}
	
	public static boolean isPair(char c, char c2) {
		if (c == '{') {
			if (c2 == '}') {
				return true;
			}
		}
		if (c == '[') {
			if (c2 == ']') {
				return true;
			}
		}
		if (c == '(') {
			if (c2 == ')') {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(balanceBracker("{[sffd[]{[][}]gdfgdf]}"));
	}
	
}
