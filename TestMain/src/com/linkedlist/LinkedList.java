package com.linkedlist;

import com.main.Log;

class LinkedList<T> {
	// init member variables
	LinkedListElement head, tail;
	int size = 0;

	// inserts data after the last element
	public void push(T data) {

		if(isEmpty()) {
			head = new LinkedListElement(null, data);
			tail = head;
		} else {
			// update tail to point to the new data
			tail = insertLast(tail, data);
		}

		this.size++;
	}

	private LinkedListElement insertLast(LinkedListElement tail, T data) {
		LinkedListElement le = new LinkedListElement(null, data);

		// update old tail data to point to this new data
		tail.next = le;
		return le;		
	}

	// inserts data to the first element 
	public void pushFront(T data) {
		if(isEmpty()) {
			head = new LinkedListElement(null, data);
			tail = head;
		}
		else {
			head = insertFront(head, data);
		}
		
		this.size++;
	}

	private LinkedListElement insertFront(LinkedListElement head, T data) {
		LinkedListElement le = new LinkedListElement(head, data);
		return le;	

	}

	// remove last element 
	public LinkedListElement pop() {
		if(isEmpty()){
			Log.o("List is emtpy");
			return null;
		}
		
		LinkedListElement currNode = head;		
		head = currNode.next;
		
		this.size--;
		return currNode;
	}
	
	private LinkedListElement insertAfter(LinkedListElement old, LinkedListElement nw) {
		nw.next = old.next;
		old.next = nw;
		return old;
	}
	
	private LinkedListElement removeAfter(LinkedListElement old, LinkedListElement rm) {
		old.next = rm.next;
		return old;
	}
	
	// remove object
	public LinkedListElement pop(Object data) {
		if(isEmpty()) {
			Log.o("List is empty");
			return null;
		}
		
		LinkedListElement currNode = head;
		LinkedListElement prevNode = head;
		
		while(currNode.data != data) {
			prevNode = currNode;
			currNode = currNode.next;
			
			// We have gone through the nodes
			if(currNode == null) {
				Log.o("Can not find the data to be deleted", data);
				return null;
			}
			
		}
		
		if(currNode == head) {
			head = currNode.next;
		}
		else {
			prevNode.next = currNode.next;
		}
		
		this.size--;
		
		return currNode;
	}

	// get the size of the linked list
	public int size() {
		return this.size;
	}

	// find data in linked list 
	public LinkedListElement find(Object data) {
		if(isEmpty()) {
			Log.o("List is empty");
			return null;
		}
		
		LinkedListElement temp = head;

		while(temp.data != data) {
			temp = temp.next;
			if(temp == null) {
				Log.o("Can not find the data you are looking for", data);
				return null;
			}
		}

		return temp;
	}

	public boolean isEmpty() {
		return (head == null);
	}
	
	public void print() {
		if(isEmpty()) {
			Log.o("List is empty");
			return;
		}
		
		int i = 0;
		LinkedListElement temp = head;
		while(temp != null && temp.data != null) {
			Log.o("Value "+(++i)+": "+temp.data.toString());
			temp = temp.next;
		}
	}
	
	




}