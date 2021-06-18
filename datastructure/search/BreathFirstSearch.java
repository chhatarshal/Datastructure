package com.csingh.datastructure.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.csingh.datastructure.BinarySearchTree;
 

public class BreathFirstSearch {
	
	public static List<Integer> breathfirstsearch(BinarySearchTree bst) {
		List<Integer> arr = new ArrayList<>();
		BinarySearchTree.Node head = bst.getHead();
		Queue<Integer> queue = new LinkedList<>();
		BinarySearchTree.Node currentNode = head;
		queue.add(head.value);
		while (queue.size() > 0) {
			Integer val = queue.poll();
			arr.add(val);
			if (currentNode.left != null) {
				queue.add(currentNode.left.value);
			} 
			if (currentNode.right != null) {
				queue.add(currentNode.right.value);
			}
			if (currentNode.left != null) {
				currentNode = currentNode.left;
			} else if (currentNode.right != null) {
				currentNode = currentNode.right;
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree(100);
		binarySearchTree.insert(new Integer(20));
		binarySearchTree.insert(new Integer(120));
		binarySearchTree.insert(new Integer(80));
		binarySearchTree.insert(new Integer(10));
		
		List<Integer> arr =  BreathFirstSearch.breathfirstsearch(binarySearchTree);
		System.out.println(arr);
	}

}
