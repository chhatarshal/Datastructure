package com.dsa.questions.Questions.exceptions;

import java.util.Optional;

public class OptionalNullCheckExample {

	
	public static void main(String[] args) throws MyException {
		String s = null;
		String S = Optional.ofNullable(s)
		.orElseThrow(
				() -> new MyException("Employee not found with id ")
				);
		 System.out.println(S);
	}
}


class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public MyException() {
		
	}

	public MyException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "This is some special exception " + this.message;
	}
}