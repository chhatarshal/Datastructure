package com.csingh.datastructure.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.search.BinarySearch;

class BinarySearchTreeTest {

	@Test
	void test1() {
		assertEquals(BinarySearch.binarysearch(new int [] {1, 2, 3, 5, 340, 50, 60, 10, 6, 8}, 5), 5);
	}
	
	@Test
	void test2() {
		assertEquals(BinarySearch.binarysearch(new int [] {1}, 5), -1);
	}
	
	@Test
	void test3() {
		assertEquals(BinarySearch.binarysearch(new int [] {1, 4}, 5), -1);
	}
	
	@Test
	void test4() {
		assertEquals(BinarySearch.binarysearch(new int [] {1, 4, 5}, 5), 5);
	}
	
	@Test
	void test5() {
		assertEquals(BinarySearch.binarysearch(new int [] {1, 4, 10}, 5), -1);
	}
	
	@Test
	void test6() {
		assertEquals(BinarySearch.binarysearch(new int [] {}, 5), -1);
	}

}
