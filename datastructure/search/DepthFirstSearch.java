package com.csingh.datastructure.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.csingh.datastructure.BinarySearchTree;

public class DepthFirstSearch {
	
	public static List<Integer> preOrderTraversal(BinarySearchTree bst) {
		List<Integer> output = new ArrayList<>();
		System.out.println("to do...");
		BinarySearchTree.Node headNode = bst.getHead();
		BinarySearchTree.Node currentNode = headNode;
		Stack<BinarySearchTree.Node> stack = new Stack<>();
		stack.push(currentNode);
		while (!stack.isEmpty()) {				
			if (currentNode.left == null) {
				BinarySearchTree.Node nodeToProcess = stack.pop();
				output.add(nodeToProcess.value);
				if (nodeToProcess.right != null) {
					stack.push(nodeToProcess.right);
					currentNode = nodeToProcess.right;
				}
			}
			if (currentNode.left != null) {
				currentNode = currentNode.left;	
				stack.push(currentNode);	
			}
		}		
		return output;
	}
	
	public static void postOrderTraversal(BinarySearchTree bst) {
		System.out.println("to do...");
	}
	
	public static void inOrderTraversal(BinarySearchTree bst) {
		System.out.println("to do...");
	}
	
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree(100);
		binarySearchTree.insert(new Integer(20));
		binarySearchTree.insert(new Integer(120));
		binarySearchTree.insert(new Integer(80));
		binarySearchTree.insert(new Integer(10));
		binarySearchTree.insert(new Integer(70));
		binarySearchTree.insert(new Integer(40));
		binarySearchTree.insert(new Integer(32));
		binarySearchTree.insert(new Integer(101));
		List<Integer> allNodes = DepthFirstSearch.preOrderTraversal(binarySearchTree);
		allNodes.forEach(System.out::println);
	}

}
