package com.projects.linkedtree;

public class Main extends GeneralTree{
	public static void main(String[] args) {
	 
	    Node root = new Node("/user/rt/courses");
	    (root.child).add(new Node("cs016/"));
	    (root.child).add(new Node("cs252/"));
	    
	    (root.child.get(0).child).add(new Node("grades"));
	    (root.child.get(0).child).add(new Node("homeworks/"));
	    (root.child.get(0).child).add(new Node("programs/"));
	    (root.child.get(1).child).add(new Node("projects/"));
	    (root.child.get(1).child).add(new Node("grades"));
	    
	    (root.child.get(0).child.get(1).child).add(new Node("hw1"));
	    (root.child.get(0).child.get(1).child).add(new Node("hw2"));
	    (root.child.get(0).child.get(1).child).add(new Node("hw3"));
	    (root.child.get(0).child.get(2).child).add(new Node("pr1"));
	    (root.child.get(0).child.get(2).child).add(new Node("pr2"));
	    (root.child.get(0).child.get(2).child).add(new Node("pr3"));
	    
	    (root.child.get(1).child.get(0).child).add(new Node("papers/"));
	    (root.child.get(1).child.get(0).child).add(new Node("demos/"));
	    
	    (root.child.get(1).child.get(0).child.get(0).child).add(new Node("buylow"));
	    (root.child.get(1).child.get(0).child.get(0).child).add(new Node("sellhigh"));
	    (root.child.get(1).child.get(0).child.get(1).child).add(new Node("market"));
	    
	 
	    preOrder(root);
	}
}
