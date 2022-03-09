package com.java8.questions;

public class FunctionalInterfaceExamples {
	
	public static void main(String[] args) {
		System.out.println("Here in this exmaple I created a functional interface with static method. Created a class which has a method which takes interface as argument");
		
		FunctionInterfaceWithStaticMethod tes = () -> {
			System.out.println("Running..");
		};
		tes.def_method();
	 
	}

}


@FunctionalInterface
interface FunctionInterfaceWithStaticMethod {
	
	static void im_static() {
		System.out.println("Hey I am im_static");
	}
	
	static void im_static2() {
		System.out.println("Hey I am im_static2");
	}
	
	default void def_method() {
		System.out.println("Hay I am def_method");
	}
	default void def_method2() {
		System.out.println("Hay I am def_method2");
	}
	private void test() {
		System.out.println("svalue....");
	}
	public void test2();
	 
}

interface demo {
	private String demo1() {
		return " DMOOO";
	}
	
}
