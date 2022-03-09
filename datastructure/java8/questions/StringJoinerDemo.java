package com.java8.questions;

import java.util.StringJoiner;

public class StringJoinerDemo {

	
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		sj.add("a");
		sj.add("b");
		
		System.out.println(sj);
	}
}
