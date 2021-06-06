package com.csingh.datastructure;

public class LinkedList<T> {
	
	class Node {
		private T value;
		private Node next;
		
		Node() {
			this.next = null;
		}
		
		Node(Node  node) {
			this();
			this.next = node;
		}
		
		Node(T  value) {
			this();
			this.value = value;
		}
		
		Node(T object, Node  node) {
			this();
			this.value = object;
			this.next = node;
		}
	}
	
	private Node head;
	
	public LinkedList(T object) {
		this();		
		this.head.value = object;
	}
	
	public LinkedList() {
		head = new Node();
	}
	
	public T getHeadValue() {
		return this.head.value;
	}
	
	public void insertNodeInEnd(T object) {
		Node node = this.head;
		while (node.next != null) {
			node = node.next;
		}
		Node newNode = new Node(object);
		node.next = newNode;
	}
	
	public void insertNodeInBegning(T object) {
		Node oldNext = this.head.next;
		Node newNode = new Node(object);
		this.head.next = newNode;
		newNode.next = oldNext;
	}
	
	public void insertNodeAtNthPositions(T object, int position) {
		
	}
	
	public void deleteNodeInEnd() {
		Node node = this.head;
		Node oneStepBackPointer = null;
		while (node.next != null) {
			oneStepBackPointer = node;
			node = node.next;
		}
		oneStepBackPointer.next = null;
	}
	
	public void deleteNodeInBegning() {
		this.head = this.head.next;
	}
	
	public void deleteNodeAtNthPositions(int position) {
		// get node before nth node
		if (position == 0) {
			deleteNodeInBegning();
			return;
		}
		Node node = getPreNthNode(position);
		// this is node to remove
		Node deleteNode = node.next;
		// plug n+1 th node
		node.next = deleteNode.next;
	}
	
	public T getFirstNode() {
		return this.head.value;
	}
	
	private Node getPreNthNode(int n) {
		int count = 0;
		Node node = this.head;
		while (node != null && node.next != null) {			
			if (count == (n - 1)) {
				break;				
			}
			node = node.next;
			count = count + 1;
		}
		return node;
	}
	
	public int length() {
		int len = 0;
		Node node = this.head;
		while (node.next != null) {
			len = len + 1;
			node = node.next;
		}
		return len;
	}
	
	public T getNthValue(int n) {
		if (n < 0) {
			return null;
		}
		if (n == 0) {
			return this.head.value;
		}
		Node node = this.head.next;
		int count = 1;
		while (node != null && node.next != null) {			
			if (count == n || count >=  n) {
				break;				
			}
			node = node.next;
			count = count + 1;
		}
		return node == null ? null : node.value;
	}

}
