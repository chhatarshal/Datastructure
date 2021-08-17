package com.csingh.datastructure.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.sort.BubbleSort;

class TestBubbleSort {
	
	
	@Test
	public void Test() {
		assertEquals(new int [] {2, 3, 4, 20, 35}, BubbleSort.sort(new int [] {4, 2, 20, 35, 3}));
		//BubbleSort.sort(new int [] {4, 2, 20, 35, 3});
	}
	
}
