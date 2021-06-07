package com.csingh.datastructure;

public class Stack {

	class Node {
		
	}
	
	private Integer stack[];
	private Integer topPointer;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	public Stack() {
		this.topPointer = -1;
		stack = new Integer[100];	
	}
	
	public String push(Integer val) {
		if (this.topPointer <= 100) {
			this.topPointer = this.topPointer + 1;
			this.stack[this.topPointer] = val;
			this.size = this.size + 1;
			return "Success";
		} else {
			return "Stack is full";
		}
	}
	
	public Integer pop() {
		if (this.topPointer >  0) {
			Integer val = this.stack[this.topPointer];
			this.topPointer = this.topPointer - 1;
			this.size = this.size - 1;
			return val;
		} else {
			return -1;
		}
	}
	
	public void printStack() {
		for (int i = 0; i < this.stack.length; i++) {
			System.out.println(this.stack[i]);
		}
	}
	
}
