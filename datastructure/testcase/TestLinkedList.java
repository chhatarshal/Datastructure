package com.csingh.datastructure.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.LinkedList;

class TestLinkedList {

	
	@Test
	void test() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);
	}
	
	@Test
	void test2() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);
		assertEquals(linkedList.getHeadValue(), new Integer(10));
	}
	
	@Test
	void test3() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);		
		assertEquals(linkedList.getNthValue(0), new Integer(10));
	}
	
	@Test
	void test4() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);		
		System.out.println(linkedList.getNthValue(1));
		assertEquals(linkedList.getNthValue(1), null);
	}
	
	@Test
	void test5() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);		
		linkedList.insertNodeInEnd(20);
		assertEquals(linkedList.getNthValue(1), new Integer(20));
	}
	
	@Test
	void test6() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);		
		linkedList.insertNodeInEnd(20);
		linkedList.insertNodeInEnd(30);
		linkedList.insertNodeInEnd(100);
		linkedList.insertNodeInEnd(90);
		assertEquals(linkedList.getNthValue(1), new Integer(20));
		assertEquals(linkedList.getNthValue(3), new Integer(100));
		assertEquals(linkedList.getNthValue(4), new Integer(90));
	}
	
	@Test
	void test7() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);		
		linkedList.insertNodeInEnd(20);
		linkedList.insertNodeInEnd(30);
		linkedList.insertNodeInEnd(100);
		linkedList.insertNodeInEnd(90);
		assertEquals(linkedList.getNthValue(1), new Integer(20));
		assertEquals(linkedList.length(), 4);
		linkedList.deleteNodeInEnd();
		assertEquals(linkedList.length(), 3);
		linkedList.deleteNodeInEnd();
		linkedList.deleteNodeInEnd();
		assertEquals(linkedList.length(), 1);
		//assertEquals(linkedList.getNthValue(3), new Integer(100));
		//assertEquals(linkedList.getNthValue(4), new Integer(90));
	}
	
	@Test
	void test8() {
		LinkedList<Integer> linkedList = new LinkedList<>(10);		
		linkedList.insertNodeInEnd(20);
		linkedList.insertNodeInEnd(30);
		linkedList.insertNodeInEnd(100);
		linkedList.insertNodeInEnd(90);
		assertEquals(linkedList.getNthValue(2), new Integer(30));
		assertEquals(linkedList.length(), 4);
		linkedList.deleteNodeAtNthPositions(new Integer(2));
		assertEquals(linkedList.getNthValue(2), new Integer(100));
		assertEquals(linkedList.length(), 3);
		linkedList.deleteNodeAtNthPositions(new Integer(0));
		assertEquals(linkedList.getNthValue(0), new Integer(20));
		
		linkedList.deleteNodeInEnd();
		assertEquals(linkedList.length(), 1);
		//assertEquals(linkedList.getNthValue(3), new Integer(100));
		//assertEquals(linkedList.getNthValue(4), new Integer(90));
	}
}
