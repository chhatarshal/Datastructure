package com.csingh.datastructure;

public class BinarySearchTree {
	
	class Node {		
		Node() {
		}
		
		Node(Integer value1) {
			value = value1;
		}
		 
		private Integer value;
		private Node left;
		private Node right;
	}
	
	Node head;	
	public BinarySearchTree(Integer rootNodeValue) {
		head = new Node(rootNodeValue);
	}
	
	public void insert(Integer value) {
		Node currentNode = head;
		while (true) {
			if (value > currentNode.value) {
				if (currentNode.right == null) {
					Node newNode = new Node(value);
					currentNode.right = newNode;
					break;
				}
				currentNode = currentNode.right;
			} else {
				if (currentNode.left == null) {
					Node newNode = new Node(value);
					currentNode.left = newNode;
					break;
				}
				currentNode = currentNode.left;
			}
		}
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree(100);
		binarySearchTree.insert(new Integer(20));
		binarySearchTree.insert(new Integer(120));
		binarySearchTree.insert(new Integer(80));
		binarySearchTree.insert(new Integer(10));
		System.out.println("Insertion done");
	}
	
}
