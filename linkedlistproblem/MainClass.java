package com.Bridgelabz.linkedlistproblem;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println(" Welcome to LinkedList Program");
		
	    LinkedList linkedlist = new LinkedList();
	    linkedlist.add(56);
	    linkedlist.add(70);
	   
	    linkedlist.show();
	    System.out.println();
	    
	    linkedlist.insertAtMiddle(30, 2);
	    linkedlist.show();
	    System.out.println();
	    
	    linkedlist.pop();
	    linkedlist.show();
	    System.out.println();
	    
	    
	}
}
