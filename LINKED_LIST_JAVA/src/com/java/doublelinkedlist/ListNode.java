package com.java.doublelinkedlist;

public class ListNode {
	
	int val;
	ListNode prev;
	ListNode next;
	public ListNode(int val) {
		this.val=val;
		this.next=null;
		this.prev=null;
	}
	
	public static void main(String[] args) {
		
		ListNode l1= new ListNode(0);
		ListNode l2 = new ListNode(4);
		
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		
		l1.next=l2;
		l2.prev=l1;
		
		l2.next=l3;
		l3.prev=l2;
		
		l3.next=l4;
		l4.prev=l3;
		
		l4.next=l5;
		l5.prev=l4;
		
		printList(l1);
		
		
		
		
	}

	private static void printList(ListNode l1) {
		ListNode temp=l1;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			
			temp=temp.next;
			
		}
		System.out.println("null");
		
	}

}