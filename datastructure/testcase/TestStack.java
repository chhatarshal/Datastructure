package com.csingh.datastructure.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.Stack;

class TestStack {

	@Test
	void test() {
		Stack stack = new Stack();
		stack.push(200);
		stack.push(100);
		assertEquals(stack.getSize(), 2);
	}
	
	@Test
	void test2() {
		Stack stack = new Stack();
		assertEquals(stack.pop(), -1);
		stack.push(100);
		assertEquals(stack.getSize(), 1);
	}

}
