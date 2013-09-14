package com.tree.traversal;

public class IntNode extends Node {
	int value;

	public IntNode(Node left, Node right, int value) {
		super(left, right);
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue(){
		return this.value;	
	}

    public void printValue() {
        System.out.println(""+value);
    }

}