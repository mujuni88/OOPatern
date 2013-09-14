package com.linkedlist;

import com.main.Log;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		String[] strArray = new String[]{"test1", "test2", "test3"};
		
		int length = strArray.length;
		for(int i = 0; i < length; i++){
			ll.pushFront(strArray[i]);
		}
		
		ll.print();
		Log.o("Size of linked list",ll.size());
		Log.o("Find test3 next data",ll.find("testk3").next.data);
		
		Log.o("Pop last data",ll.pop().data);
		ll.print();
		Log.o("Size of linked list",ll.size());

		Log.o("Pop test2",ll.pop("test2").data);
		ll.print();
		Log.o("Size of linked list",ll.size());

		Log.o("Pop test1",ll.pop("test1").data);
		ll.print();

		
		
		
	}

}
