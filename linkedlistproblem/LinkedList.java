package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node head;
	Node tail;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		head = newNode;
		tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void append( int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
		head = newNode;
		tail = newNode;
		}
		else {
		    tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insertAtMiddle(int data, int position) {
		Node temp;
		int i;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
				newNode.data = data; 
		        newNode.next = null;
		        temp = head;

		        for(i=2; i<=position-1; i++)
		        {
		            temp = temp.next;

		            if(temp == null)
		                break;
		        }

		        if(temp != null) {
		            newNode.next = temp.next; 
		            temp.next = newNode;
		            System.out.println("Data Inserted Successfully\n");
		        }
		        else {
		            System.out.println("Can Not Insert Data At The Given Position\n");
		        }
			}
		}
	
	public void show() {
		Node temp = head;
		while (temp != null) {
		System.out.print(temp.data + " -->");
		temp = temp.next;
		}
	}
}
	


