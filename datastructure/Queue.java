package com.csingh.datastructure;

public class Queue<T> {

	LinkedList<T> linkedList = null;
	
	long queuelength = 0;
	public Queue() {
		linkedList = new  LinkedList<>();
	}
	
	public void insert(T item) {
		linkedList.insertNodeInEnd(item);
		queuelength = queuelength + 1;
	}
	
	public void remove() {
		linkedList.deleteNodeInBegning();
		queuelength = queuelength - 1;
	}
	
	public long getQueueLength() {
		return queuelength;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.insert(10l);
		queue.insert(100l);
		queue.printQueue();
		System.out.println(queue.getQueueLength());
		queue.remove();
		System.out.println(queue.getQueueLength());
	}

	private void printQueue() {
		
		System.out.println("Printing Queue");
	}
	
}
