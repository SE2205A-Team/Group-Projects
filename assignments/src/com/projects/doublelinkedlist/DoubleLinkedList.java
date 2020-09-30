package com.projects.doublelinkedlist;

// Doubly Linked List class
public class DoubleLinkedList<E> {

	// nested node class
	private static class Node<E> {
		
		// element
		private E element;
		
		// reference to the previous node
		private Node<E> prev;
		
		// reference to the next node
		private Node<E> next;
		
		// parameters for the class
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		
		// nodes and functions
		public E getElement() {return element; }
		public Node<E> getPrev() { return prev; }
		public Node<E> getNext() {return next; }
		public void setPrev(Node<E> p) {prev = p; }
		public void setNext(Node<E> n) {next = n; }
	}
	
	// header and trailer nodes
	private Node<E> header;
	private Node<E> trailer;
	
	// list size
	private int size = 0;
	
	// constructor
	public DoubleLinkedList() {
		
		// placing the header at the beginning and the trailer at the end
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		
		// connecting the header and the trailer
		header.setNext(trailer);
	}
	
	// size method
	public int size() { return size; }
	
	// sets size to 0 if the list is empty
	public boolean isEmpty() { return size == 0; }
	
	public E first() {
		
		// if the list is empty, return null
		if(isEmpty()) return null;
		
		// return the element after the header node
		return header.getNext().getElement();
	}
	
	public E last() {
		
		// if the list is empty, return null
		if(isEmpty()) return null;
		
		// return the element before the trailer node
		return trailer.getPrev().getElement();
	}
	
	// method for adding an element at the beginning
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	// method for adding an element at the end
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	// method for removing the first node in the list
	public E removeFirst() {
		if(isEmpty()) return null;
		return remove(header.getNext());
	}
	
	// method for removing the last node in the list
	public E removeLast() {
		if(isEmpty()) return null;
		return remove(trailer.getPrev());
	}
	
	// method for adding a new node in between
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		
		// new node called newest, put in between its predecessor and successor
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		
		// increases the size of the list
		size++;
	}
	// method for removing a node
	private E remove(Node<E> node) {
		
		// removes the node and connects the successor and predecessor
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		
		// decreases the size of the list
		size--;
		
		// returns the node that was deleted
		return node.getElement();
	}
	
	// displays the list in order
	public void display() {
		
		// starts with the first node which contains an element
        Node<E> currentNode = header.getNext();
    	System.out.println("\nEntity list in regular order: ");
        for(int i = 0; i < size; i++) {
        	
        	// prints that element
            System.out.print(currentNode.getElement());
            if(i < (size - 1)) {
				System.out.print(", ");
			}
            
            // gets the next node in the list
            currentNode = currentNode.getNext();
        }
	}
	
	// displays the list in reverse order
	public void displayReverse() {
		
		// starts with the last node that contains an element
		Node<E> currentNode = trailer.getPrev();
		System.out.println("\n\nEntity list in reverse order: ");
		for(int i = 0; i < size; i++) {
			
			// prints that element
			System.out.print(currentNode.getElement());
			if(i < (size - 1)) {
				System.out.print(", ");
			}
			
			// gets the previous node in the list
			currentNode = currentNode.getPrev();
		}
	}
}
