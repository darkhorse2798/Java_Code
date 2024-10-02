package com.java.linkedlist;

public class ListNode {

public ListNode next;
public int val;
  public ListNode(int val){
	  this.val=val;
	  this.next=null;
	  
	
  }
  public static ListNode insertFirst(ListNode head,int valToInsert) {
  	
  	ListNode newNode = new ListNode(valToInsert);
  	
  	newNode.next=head;
  	head=newNode;
  	return head;
  	
  }
  public static ListNode insertAtMiddle(ListNode head,int valToInsert,int position) {
	  ListNode newNode = new ListNode(valToInsert);
	  if (head == null) {
	        return newNode;
	    }
	  ListNode ptr=head;
	  for(int i=0;i<position;i++) {
		  ptr=ptr.next;
	  }
	  newNode.next=ptr.next;
	  ptr.next=newNode;
	  return head;
  }
  public static ListNode insertLast(ListNode head,int valToInsert) {
	  
	  ListNode newNode = new ListNode(valToInsert);
	  if (head == null) {
	        return newNode;
	    }
	  
	  ListNode temp =head;
	  while(temp.next!=null){
		  temp=temp.next;
		  }
	  
	  temp.next=newNode;
	  
	  return head;
	  
  }
  public static ListNode deleteNodeFromFirst(ListNode head) {
	  head=head.next;
	  return head;
  }
  public static ListNode deleteFromLast(ListNode head) {
	  ListNode temp=head;
	  while(temp.next.next!=null) {
		  temp=temp.next;
	  }
	  temp.next=null;
	  return head;
  }
  public static ListNode deleteFromMiddle(ListNode head,int position) {
	  ListNode temp=head;
	  if(head==null) return head;
	  for(int i=0;i<position-1;i++) {
		  temp=temp.next;
	  }
	  ListNode nodeTodelete=temp.next;
	  ListNode nextNode=nodeTodelete.next;
	  temp.next=nextNode;
	  return head;
  }
  public static void printList(ListNode head) {
      ListNode ptr = head;
      while (ptr != null) {
          System.out.print(ptr.val + " -> ");
          ptr = ptr.next;
      }
      System.out.println("null");
  }

  public static void main(String[] args) {
	  
	  ListNode l1=new ListNode(2);
	  ListNode l2=new ListNode(3);
	  ListNode l3=new ListNode(5);
	  
	  l1.next=l2;
	  l2.next=l3;
	  l3.next=null;
	  
	  System.out.println("Before adding the node at first");
	  printList(l1);
		System.out.println();
	  System.out.println("After adding node at first");
	  l1=insertFirst(l1,1);
	  l1=insertFirst(l1,0);
	  printList(l1);
	  System.out.println();
	  System.out.println("Adding node at last");
	  l1=insertLast(l1, 6);
	  printList(l1);
  
	  System.out.println();
	  System.out.println("Adding elements to the middle of LinkedList");
	  l1=insertAtMiddle(l1, 4, 2);
	  printList(l1);
	  System.out.println();
	  System.out.println("After Deleting element from first");
	  l1=deleteNodeFromFirst(l1);
	  printList(l1);
	  
	  System.out.println();
	  System.out.println("Deleting the element from last");
	  l1=deleteFromLast(l1);
	  printList(l1);
	  System.out.println();
	  System.out.println("Deleting the element from middle");
	  l1=deleteFromMiddle(l1,2);
	  printList(l1);

	  
	
	  
	
}
}
