package com.java.linkedlist.practice;


public class ListNode {
  public int val;
  public ListNode next;
  public ListNode(int val) {
	  this.val=val;
	  this.next=null;
  }
  public static void printList(ListNode head) {
	  ListNode ptr= head;
	  while(ptr!=null) {
		  System.out.print(ptr.val+"->");
		  ptr=ptr.next;
	  }
	  System.out.println("null");
  }
  
  
  public static ListNode addFirst(ListNode head,int valToInsert){
	  ListNode newNode = new ListNode(valToInsert);
	  
	  newNode.next=head;
	  head=newNode;
	 return head;
	  
	  
  }
  public static ListNode addLast(ListNode head,int valToInsert){
	  ListNode newNode = new ListNode(valToInsert);
	  ListNode ptr=head;
	  while(ptr.next!=null) {
		  ptr=ptr.next;
	  }
	 ptr.next=newNode;
	 newNode.next=null;
	  return head;
	  
	  
  }
  public static ListNode addAtMiddle(ListNode head, int valToInsert, int position) {
	    ListNode newNode = new ListNode(valToInsert);

	    // If inserting at the head (position 0)
	    if (position == 0) {
	        newNode.next = head;
	        return newNode;
	    }

	    ListNode ptr = head;
	    for (int i = 0; i < position - 1 && ptr != null; i++) {
	        ptr = ptr.next;
	    }

	    // Check if ptr is null, meaning position is out of bounds
	    if (ptr == null) {
	        throw new IllegalArgumentException("Position out of bounds");
	    }

	    newNode.next = ptr.next;
	    ptr.next = newNode;
	    return head;
	}


  public static void main(String[] args) {
	  
	  ListNode l1= new ListNode(1);
	  ListNode l2= new ListNode(2);
	  ListNode l3= new ListNode(3);
	  ListNode l4= new ListNode(6);
	  
	  l1.next=l2;
	  l2.next=l3;
	  l3.next=l4;
	  
    System.out.println("Adding at first");

	  
	l1=addFirst(l1,0);
	l1=addFirst(l1,-1);
	l1=addFirst(l1,-2);
	printList(l1);
	
	System.out.println("Adding at the last");

	
	l1=addLast(l1,7);
	printList(l1);
	l1=addLast(l1,8);
	printList(l1);
	
	System.out.println("Adding at the middle");
	
	l1=addAtMiddle(l1,5,6);
	printList(l1);
	l1=addAtMiddle(l1,4,6);
	printList(l1);


}
}

