package com.java8.questions;

import java.util.stream.Stream;

public class Streams {
	
	public static void main(String[] args) {
		long count = Stream.of(1, 2, 3, 4, 5)
						.filter(i -> i <4) // Intermediate Operation filter
						.count(); // Ter
					System.out.println(count);
					
					Stream.of(1, 2, 3, 4, 5).findFirst().ifPresent(Integer::intValue);


					
					Stream.of(1, 2, 3, 4, 5)
					.map(val -> val * val)
					.reduce(0, (a, b) -> a + b);
					
					
					
					 
	}

}
