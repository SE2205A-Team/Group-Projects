package com.projects.doublelinkedlist;

// importing libraries
import java.util.Scanner;

// main class
public class Main {

	// main method
	public static void main(String[] args) {
		
		// creating the scanner object
        Scanner keyboard = new Scanner(System.in);
        
		// creating a new doubly linked list object
		DoubleLinkedList<String> list = new DoubleLinkedList<>();
		
		// initializing the list size and entry variables
        int arbitraryNum;
        String entry;
		 
        // asking the user for how many entities they want
		System.out.print("Please enter the number of entities wanted: ");
		
		// storing the amount entered
		arbitraryNum = keyboard.nextInt();
		System.out.println("");
		
		// getting the entities from the user
		for(int i = 0; i < arbitraryNum; i++) {
			System.out.print("Enter entry " + (i + 1) + ": ");
			entry = keyboard.next();
							
			// adding the entities to the list
			list.addLast(entry);
		}
		
		// displaying the list in regular order
		list.display();
		
		// displaying the list in reverse order
		list.displayReverse();
		
		System.out.println("\n\nRemoving all entities and printing in regular order...");
		
		// print and delete method
		for(int i = 0; i < arbitraryNum; i ++) {
			
			// prints the first entity in the list
			System.out.print(list.first());
			if(i < (arbitraryNum - 1)) {
				System.out.print(", ");
			}
			
			// removes the first entity from the list
			list.removeFirst();
		}
		
		System.out.println("\n\nPlease repopulate the list...\n");
		
		// getting the entities from the user
		for(int i = 0; i < arbitraryNum; i++) {
			System.out.print("Enter entry " + (i + 1) + ": ");
			entry = keyboard.next();
					
			// adding the entities to the list
			list.addLast(entry);
		}
		
		System.out.println("\nRemoving all entities and printing in reverse order...");
		
		// reverse delete and print method
		for(int i = 0; i < arbitraryNum; i++) {
			
			// prints the last entity in the list
			System.out.print(list.last());
			if(i < (arbitraryNum - 1)) {
				System.out.print(", ");
			}
			
			// removes the last entity from the list
			list.removeLast();
		}
		
		// closing the scanner object
		keyboard.close();
	}
}
