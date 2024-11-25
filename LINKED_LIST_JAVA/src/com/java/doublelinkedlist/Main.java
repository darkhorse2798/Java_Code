package com.java.doublelinkedlist;

public class Main {
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
		
		System.out.println("....Fetching the List from random node....");
		
		printListFromRandomNode(l3);
		
		System.out.println("....Reversing the list....");
		
		reverseList(l1);
		
		
		
		
		
		
		
		
		
	}
	private static void printList(ListNode l1) {
		ListNode temp=l1;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			
			temp=temp.next;
			
		}
		System.out.println("null");
		
	}
	public static void printListFromRandomNode(ListNode node) {
		
		if (node == null) {
		    System.out.println("List is empty.");
		    return;
		}
		while(node.prev!=null) {
			node=node.prev;
		}
		ListNode temp =node;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public static void  reverseList(ListNode head) {
		if(head==null) return ;
		
		ListNode current = head;
		while(current.next!=null) {
			current=current.next;
		}
		
		while(current!=null) {
			System.out.print(current.val+"-->");
			current=current.prev;
			
		}
		System.out.println("null");
		
		
		
		
	}

	
}
