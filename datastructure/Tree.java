package com.csingh.datastructure;

public class Tree <T> {
	
	class Node <T> {		
		 
		private T value;
		private Node left;
		private Node right;
	}
	
	Node head;
	
	public Tree(T value) {
		this.head = new Node();
		this.head.value = value;
	}
	
	public void addNode(T value) {
		
	}

}
