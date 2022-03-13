package com.dsa.questions.Questions.exceptions;

import java.io.File;

public class ExceptionHandling {

	
	
	public static void main(String[] args) {
		 System.out.println(getValue());
	}
	
	public static String getValue() {
		try {
			if (1 == 1)
			throw new Exception("Deem");
			return "DM:";
		}
		catch(Exception e) {
			System.out.println("Found some exceptino..");
		}
		finally {
			return "NDM";
		}
	}
}
