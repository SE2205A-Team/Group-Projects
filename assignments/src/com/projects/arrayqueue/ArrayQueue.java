package com.projects.arrayqueue;

public class ArrayQueue<E> implements Queue{

	private E[] data;
	private int front=0;
	private int size=0;
	
	public ArrayQueue() {
		this(16); // Sets default capacity to 16 (Random number)
	}
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}

	public E first() { //returns first element in queue
		if(isEmpty()) {
			return null;
		}
		return data[front];
	}
	public void enqueue(Object e)throws IllegalStateException {
		if(size == data.length) {
			throw new IllegalStateException("Queue is full");
		}
		int x = (front+size)%data.length;
		data[x] = (E) e;
		size++;
		
	}
	

	
	@Override
	public Object dequeue() {
		if(isEmpty()) {
			return null;
		}
		E x = data[front];
		data[front] = null;
		front = (front+1)%data.length;
		size--;
		return x;
		
	}
	

}
