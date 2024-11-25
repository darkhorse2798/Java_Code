package com.java.linkedlist;

public class SortLinkedList {
	public static void main(String args[]){
	    
	    ListNode l1= new ListNode(3);
	    ListNode l2= new ListNode(4);
	    ListNode l3= new ListNode(1);
	    ListNode l4= new ListNode(-1);

	    ListNode l5= new ListNode(0);
	    
	    l1.next=l2;
	    l2.next=l3;
	    l3.next=l4;
	    l4.next=l5;
	    printList(l1);

	    
	    
	    bubbleSort(l1);
	    printList(l1);
	    
	    
	    
	  }
	  public static void printList(ListNode head){
	    ListNode ptr = head;
	    while(ptr!=null){
	      System.out.print(ptr.val+"-->");
	      ptr=ptr.next;
	    }
	    System.out.println("null");
	  }
	  public static void bubbleSort(ListNode head){
	    if(head==null || head.next==null) return;
	    ListNode end=null;
	    while(end!=head){
	      ListNode current = head;
	      while(current.next!=end){
	        if(current.val> current.next.val){
	          int temp = current.val;
	          current.val=current.next.val;
	          current.next.val=temp;
	          
	        }
	        current=current.next;
	      }
	      end=current;
	    }
	   
	  }

}
