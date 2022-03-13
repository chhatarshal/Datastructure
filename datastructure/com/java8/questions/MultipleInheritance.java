package com.java8.questions;

public class MultipleInheritance {

	
	
	public static void main(String[] args) {
		C c = new C();
		c.domo();
	}
}


class D extends C {
	
	public D() {
		super();
		System.out.println("D Constucter");		
	}	
}

class C implements A, B {

	@Override
	public void a_demo() {
		System.out.print("This is demo");
	}

	@Override
	public void domo() {
		B.super.domo();
		System.out.println("Default method overriden");		
	}
	
}

interface A {
	
	default void domo() {
		System.out.println("Default of A");
	}
	
	public void a_demo();
}

interface B {
	
	default void domo() {
		System.out.println("Default of B");
	}
	
	public void a_demo();
}


