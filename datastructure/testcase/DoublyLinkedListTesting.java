package com.csingh.datastructure.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.DoublyLinkedList;

class DoublyLinkedListTesting {

	@Test
	void InsertTest() {
		DoublyLinkedList<Integer> doubleList = new DoublyLinkedList<>(10);
		doubleList.insertNodeInEnd(10);
		assertEquals(doubleList.getSize(), 1);
	}
	
	@Test
	void deleteTest() {
		DoublyLinkedList<Integer> doubleList = new DoublyLinkedList<>(10);
		for (int i = 0; i < 10; i ++) {
			doubleList.insertNodeInEnd(i);
		}
		assertEquals(doubleList.getSize(), 10);
	}
	
	@Test
	void checkNthElement() {
		DoublyLinkedList<Integer> doubleList = new DoublyLinkedList<>(10);
		doubleList.insertNodeInEnd(11);
		doubleList.insertNodeInEnd(12);
		doubleList.insertNodeInEnd(13);
		doubleList.insertNodeInEnd(14);
		doubleList.deleteNodeInEnd();
		doubleList.deleteNodeInEnd();
		assertEquals(doubleList.getNthValue(1), new Integer(11));
		assertEquals(doubleList.getHeadValue(), new Integer(10));
	}
	
	@Test
	void testForwardBackWardMove() {
		DoublyLinkedList<Integer> doubleList = new DoublyLinkedList<>(10);
		for (int i = 0; i < 100; i ++) {
			doubleList.insertNodeInEnd(i);
		}
		assertEquals(doubleList.getNthValue(50), new Integer(49));
		doubleList.insertNodeAtNthPositions(500, 50);
		assertEquals(doubleList.getNthValue(50), new Integer(500));
		assertEquals(doubleList.getHeadValue(), new Integer(10));
	}

}
