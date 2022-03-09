package com.java8.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		optionalNullableCheck("Demo");
		optionalNullableCheck(null);
		
		optionalNullableCheckWithList(Arrays.asList("Demmo"));
		optionalNullableCheckWithList(new ArrayList<>());
		
	}
	
	private static void optionalNullableCheck(String s) {
		Optional.ofNullable(s).ifPresent(System.out::println);
		 
		//  ifPresentOrElse will do 2 things first is consumer and second is runnable methods
		Optional.ofNullable(s).ifPresentOrElse(System.out::println, () -> {
													System.out.println("Runner....IfEmpty");
												});
	}
	
	private static void optionalNullableCheckWithList(List<String> list) {
		Optional.of(list).ifPresent(lst -> System.out.println(lst.size()));
	}
}
