package com.linkedlist;

class LinkedListElement {
	// init member variables
	public LinkedListElement next;
	public Object data;

	public LinkedListElement(LinkedListElement next, Object data) {
		this.data = data;
		this.next = next;
	}

}