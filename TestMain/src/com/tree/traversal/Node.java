package com.tree.traversal;

public abstract class Node {
	private Node left;
	private Node right;

	public Node(Node left, Node right) {
		this.left = left;
		this.right = right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getLeft() {
		return left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getRight() {
		return right;
	}

    public abstract void printValue();

}