package com.java.linkedlist;

public class Node {
	
	Node next;
	int data;
	public Node(int data){
		this.data=data;
		
	}
	
	public static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " -> ");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	public static Node mergeSortedList(Node n1, Node l1) {
		Node dummyNode = new Node(Integer.MIN_VALUE);
		Node current = dummyNode;
		while(n1!=null && l1!=null) {
			if(n1.data<=l1.data) {
				current.next= new Node(n1.data);
				n1=n1.next;
			
				
			}else {
				current.next= new Node(l1.data);
				l1=l1.next;
			}
			current=current.next;
		}
		if(n1!=null) current.next=n1;
		if(l1!=null) current.next=l1;
		
		return dummyNode.next;
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(5);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		
		
		Node l1= new Node(2);
		Node l2= new Node(4);
		Node l3= new Node(6);
		
		l1.next=l2;
		l2.next=l3;
		l3=null;
		
     printList(n1);		
     printList(l1);
     
     System.out.println();
     System.out.println("Merging the sorted list");
		Node mergedList=mergeSortedList(n1,l1);
		
		printList(mergedList);
		
		
		
		
		
	}

}
