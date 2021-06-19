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
	
	public boolean lookup(int value) {
		boolean flag = false;
		Node currentNode = this.head;
		
		while (currentNode != null) {
		 	if (value > currentNode.value) {
				currentNode = currentNode.right;
			} if (value == currentNode.value) {
		 		flag = true;
		 		break;
		 	} else {
				currentNode = currentNode.left;
			}
		}
		
		return flag;
	}
	
	public void delete(int value) {
		Node currentNode = this.head;
		//check if head need to delete
		if (value == this.head.value) {
			System.out.println("To be implemented.... in future....");
			return;
		}
		Node parent = null;
		while (currentNode != null) {
		 	if (value > currentNode.value) {
		 		parent = currentNode;
				currentNode = currentNode.right;
			} if (value == currentNode.value) {
		 		if (currentNode.left == null && currentNode.right == null && parent != null) {
		 			if (parent.left != null && parent.left.value == currentNode.value) {
		 				parent.left = null;
		 			} else {
		 				parent.right = null;
		 			}
		 			break;
		 		}
		 	} else {
		 		parent = currentNode;
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
		boolean flag = binarySearchTree.lookup(80);
		System.out.println(flag);
		flag = binarySearchTree.lookup(81);
		System.out.println(flag);
		System.out.println("Insertion done");
	}
	
}
