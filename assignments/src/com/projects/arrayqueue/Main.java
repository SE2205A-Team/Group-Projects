package com.projects.arrayqueue;

public class Main {

	public static void main(String[] args) {
		ArrayQueue<String> queue = new ArrayQueue<String>(5);
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		queue.enqueue("D");
		queue.enqueue("E");
		
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue("F");
		queue.enqueue("G");
		int begSize = queue.getSize(); // Beginning size
		
		for(int i =0; i < begSize-1 ;i++) {
			System.out.print(queue.dequeue()+",");
		}
		System.out.print(queue.dequeue());
		

	}

}
