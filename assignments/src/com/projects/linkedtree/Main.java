package com.projects.linkedtree;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends GeneralTree {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String userInput = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input a directory: ");
		userInput = scanner.next();
	 
	    Node root = new Node(userInput);
	    
	    String newUserInput = "";
		File directoryPath = new File(userInput);
		      
		String contents[] = directoryPath.list();
		   
		for(int i=0; i<contents.length; i++) {
		    	  
			Pattern p = Pattern.compile("[.]");
			Matcher m = p.matcher(contents[i]);
		    	 
		    if(m.find()) {
		    	(root.child).add(new Node(contents[i]));
		    } else {
		    	(root.child).add(new Node(contents[i]));
		    	newUserInput = userInput + "\\" + contents[i];
		    	File directoryPath2 = new File(newUserInput);
			      
				String contents2[] = directoryPath2.list();
				   
				for(int i2=0; i2<contents2.length; i2++) {
				    	  
					Pattern p2 = Pattern.compile("[.]");
					Matcher m2 = p2.matcher(contents2[i]);
				    	 
				    if(m2.find()) {
				    	(root.child.get(i).child).add(new Node(contents2[i2]));
				    } else {
				    	(root.child.get(i).child).add(new Node(contents2[i2]));
				    	newUserInput = userInput + "\\" + contents2[i2];
				    }
				}
		    }
		}
	    
		System.out.println("\npreOrder:");
	    preOrder(root);
	    System.out.println("\npostOrder: ");
	    postOrder(root);
	}
}
