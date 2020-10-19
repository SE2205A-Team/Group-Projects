package com.projects.arrayqueue;

public interface Queue<E> {
	int getSize();
	boolean isEmpty();
	E first();
	void enqueue(E e);
	E dequeue();

}
