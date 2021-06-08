package com.csingh.datastructure.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoNumberSum {

	@Test
	void test() {
		int sumArray[] = com.csingh.datastructure.problems.TwoNumberSum.findSum(new int [] {8, 2, 4, 5, 6, 12}, 6);
		assertEquals(2, sumArray.length);
		assertEquals(2, sumArray[0]);
		assertEquals(4, sumArray[1]);
	}
	
	@Test
	void test2() {
		int sumArray[] = com.csingh.datastructure.problems.TwoNumberSum.findSum(new int [] {8, 2, 4, 5, 6, 12}, 12);
		assertEquals(2, sumArray.length);
		assertEquals(8, sumArray[0]);
		assertEquals(4, sumArray[1]);
	}
	
	@Test
	void test3() {
		int sumArray[] = com.csingh.datastructure.problems.TwoNumberSum.findSum(new int [] {}, 12);
		assertEquals(0, sumArray.length);
	}
	
	@Test
	void test4() {
		int sumArray[] = com.csingh.datastructure.problems.TwoNumberSum.findSum(new int [] {12, 32}, 12);
		assertEquals(0, sumArray.length);
	}
	
	@Test
	void test5() {
		int sumArray[] = com.csingh.datastructure.problems.TwoNumberSum.findSum(new int [] {1, 2}, 4);
		assertEquals(0, sumArray.length);
	}
	
	@Test
	void test6() {
		int sumArray[] = com.csingh.datastructure.problems.TwoNumberSum.findSum(new int [] {1, 4, 5, 6, 9, 20, 30, 40, 55, 2, 3}, 4);
		assertEquals(2, sumArray.length);
		assertEquals(1, sumArray[0]);
		assertEquals(3, sumArray[1]);
	}

}
