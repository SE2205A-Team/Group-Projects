package com.projects.doublelinkedlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList<Object> Objects = new DoubleLinkedList<>(); // Array of DoubleLinkedList Objects
        int arbitraryNum = 5; // Arbitrary Number of Items, Doesn't have to be 5
		  
        Scanner keyboard = new Scanner(System.in);
		  
		 System.out.println("Please enter "+ arbitraryNum +" Objects");
		  
		 for(int i = 0; i< arbitraryNum; i++) { //Loops through objects in the array
			 System.out.println("Object: 0"+(i+1)); //Display of which object in the array it's on
		 
		 }
	}

}
