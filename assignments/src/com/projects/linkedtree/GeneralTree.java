package com.projects.linkedtree;

import java.util.ArrayList;
import java.util.Stack;
	 
public class GeneralTree {

	static class Node {
	    String key;
	    ArrayList<Node> child;
	 
	    public Node(String key) {
	        this.key = key;
	        child = new ArrayList<>();
	    }
	}
	 
	// Pre-order traversal
	static void preOrder(Node root) {
	     
	    // Stack used for storing nodes
	    Stack<Node> nodes = new Stack<>();
	 
	    // Push current node onto stack
	    nodes.push(root);
	
	    while (!nodes.isEmpty()) {
	        Node curr = nodes.pop();
	 
	        if (curr != null) {
	            System.out.println(curr.key + " ");

	            for(int i = curr.child.size() - 1; i >= 0; i--) {
	                nodes.add(curr.child.get(i));
	            } 
	        }
	    }
	}
	
	static void postOrder(Node root) {
	 
   //continue.....
			
	}
}
