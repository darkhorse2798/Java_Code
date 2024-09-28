package com.java.linkedlist;

public class ListNodes {
	int value;
	ListNodes next;
  public ListNodes(int value) {
	  this.value=value;
	  this.next=null;
	  
  }
  public static void printList(ListNodes head){
	  ListNodes ptr = head;
	  while (ptr != null) {
          System.out.print(ptr.val + " -> ");
          ptr = ptr.next;
      }
      System.out.println("null");
	  
  }
  public static void main(String[] args) {
	  ListNodes l1= new ListNodes(2);
	  ListNodes l2= new ListNodes(3);
	  ListNodes l3= new ListNodes(4);
	  ListNodes l4= new ListNodes(5);
	  ListNodes l5= new ListNodes(6);
	  
	  l1.next=l2;
	  l2.next=l3;
	  l3.next=l4;
	  l4.next=l5;
	  l5.next=null;
	  
	  reverseList(l1);
	  System.out.print("null");
	
}
private static void reverseList(ListNodes head) {
	if(head==null) return;
	
	reverseList(head.next);
	System.out.print(head.value+" ->");
	
	
}
  
  
}
