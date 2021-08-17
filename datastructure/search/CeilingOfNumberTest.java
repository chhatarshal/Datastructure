package com.csingh.datastructure.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeilingOfNumberTest {

	@Test
	void test() {
		assertEquals(14, CeilingOfElementInSortedArray.celling(new int [] {14, 16, 17}, 15));
	}
	

	@Test
	void test2() {
		assertEquals(14, CeilingOfElementInSortedArray.celling(new int [] {14}, 14));
	}
	
	@Test
	void test3() {
		assertEquals(10, CeilingOfElementInSortedArray.celling(new int [] {1, 2, 3, 10}, 14));
	}

}
