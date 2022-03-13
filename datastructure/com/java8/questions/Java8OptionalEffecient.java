package com.java8.questions;

import java.util.Optional;

public class Java8OptionalEffecient {	
	
	public static void main(String[] args) {
		System.out.println(getAlreadyComputedStatus());
		System.out.println(new Java8OptionalEffecient().getComputedAndReturnStatus());
		System.out.println(new Java8OptionalEffecient().testElse());
	}

	public static String getAlreadyComputedStatus() {			
		Optional<String> status = Optional.of("St");			
		return status.orElse("Not Found");
	}
	
	public String getComputedAndReturnStatus() {			
		Optional<String> status = Optional.empty();			
		return status.orElseGet(this::computer);
	}
	
	public String testElse() {			
		Optional<String> status = Optional.of("St");			
		return status.orElse(computer());
	}
	
	public String computer() {
		return "::".concat("=====");
	}
}


