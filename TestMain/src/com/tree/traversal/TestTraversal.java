package com.tree.traversal;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: joebm08
 * Date: 9/12/13
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTraversal {

    public static void main(String[] args) {
       // creates nodes
       Node ll = new IntNode(null, null, 35);
       Node rl = new IntNode(null, null, 48);

       Node lr = new IntNode(null, null, 53);
       Node rr = new IntNode(null, null, 60);

        Node left = new IntNode(ll, rl, 45);
        Node right = new IntNode(lr, rr, 55);

       // insert values
       IntNode root = new IntNode(left, right, 50);

        System.out.println("PREORDER");
        preorder(root);
        System.out.println("END PREORDER==");

        System.out.println("INORDER");
        inorder(root);
        System.out.println("END INORDER==");

        System.out.println("POSTORDER");
        postorder(root);
        System.out.println("END POSTORDER==");

        System.out.println("PREORDER STACK");
        preorderStack(root);
        System.out.println("END PREORDER STACK==");

    }

    public static void preorder(Node root) {
        if(root == null) return;

        root.printValue();
        preorder(root.getLeft());
        preorder(root.getRight());
    }
    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.getLeft());
        root.printValue();
        inorder(root.getRight());
    }
    public static void postorder(Node root) {
        if(root == null) return;

        postorder(root.getLeft());
        postorder(root.getRight());
        root.printValue();

    }

    public static void preorderStack(IntNode root) {
        Stack st = new Stack();
        st.push(root);
        
        int sum = 0;

        while(!st.empty()) {
           IntNode nd = (IntNode) st.pop();
           nd.printValue();
           sum = sum + nd.getValue();

           IntNode left = (IntNode) nd.getLeft();
           IntNode right = (IntNode) nd.getRight();
           if(right != null) {
               st.push(right);
           }

           if(left != null) {
               st.push(left);
           }
        }

        System.out.println("SUM = "+sum);
    }
}
