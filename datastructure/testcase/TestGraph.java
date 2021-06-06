package com.csingh.datastructure.testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.csingh.datastructure.Graph;

class TestGraph {

	@Test
	void test() {
		Graph graph = new  Graph();
		graph.addVertix(1);
		graph.addVertix(2);
		graph.addEdge(1, 2);
		assertEquals("Success", graph.printGraph()); 
	}
	
	@Test
	void test2() {
		Graph graph = new  Graph();
		graph.addEdge(1, 2);
		assertEquals("Not a Graph", graph.printGraph()); 
	}
	
	@Test
	void test3() {
		Graph graph = new  Graph();
		graph.addVertix(1);
		graph.addEdge(1, 2);
		assertEquals("Success", graph.printGraph()); 
	}

}
