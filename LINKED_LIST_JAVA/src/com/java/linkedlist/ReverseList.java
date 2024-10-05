package com.java.linkedlist;

public class ReverseList {
	
	public static void main(String[] args) {
		ListNode l1= new ListNode(1);
		ListNode l2= new ListNode(2);
		ListNode l3= new ListNode(3);
		ListNode l4= new ListNode(4);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		
		printList(l1);
		l1=reverseList(l1);
		System.out.println("After Reversing the list new list is");
		printList(l1);
		
		
	}
	public static void printList(ListNode head){
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.val+"-->"+" ");
			current=current.next;
		}
		System.out.println("null");
		
	}
	public static ListNode reverseList(ListNode head){
		ListNode prev=null;
		ListNode current=head;
		while(current!=null) {
			ListNode next =current.next;
			current.next=prev;  
			prev=current;  
		    current=next; 
		}
		
		return prev;
	}
	

}
