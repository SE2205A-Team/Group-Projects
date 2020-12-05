package com.projects.linkedtree;
import java.util.ArrayList;
import java.util.List;

public class Node<E> {
	private E data = null;
	private List<Node> children = new ArrayList<>();
	private Node parent = null;
	public Node(E x) {
		data = x;
	}
	public void addChild(Node x) {
		x.setParent(this);
		this.children.add(x);
	}
	
	public void addChild(E data) {
		Node<E> newChild = new Node<>(data);
		this.addChild(newChild);
	}
	public void addChildren(List<Node> children) {
		for(Node i : children) {
			i.setParent(this);
		}
		this.children.addAll(children);
	}
	public List<Node> getChildren(){
		return children;
	}
	public E getData() {
		return data;
	}
	public void setData(E x) {
		data = x;
	}
	private void setParent(Node x) {
		parent = x;
	}
	public Node getParent() {
		return parent;
	}
}
