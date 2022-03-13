package com.java8.questions;

public class MultipleInheritance2 {

}


interface A11 {
	public abstract void a();
	public void c();
}

interface B1{
	public void b();
	public default void demo() {
		System.out.println("System defualt method");
	}
}

interface C1 {
	public void b();
	public default void demo() {
		System.out.println("System defualt method");
	}
}

class DC implements B1, C1 {

	@Override
	public void b() {
		System.out.println("This is implemtation");
	}
	
	
	
}