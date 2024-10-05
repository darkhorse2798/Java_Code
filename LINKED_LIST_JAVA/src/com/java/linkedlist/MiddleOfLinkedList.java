package com.java.linkedlist;

public class MiddleOfLinkedList {
  public static void main(String[] args) {
	  ListNode l1= new ListNode(1);
		ListNode l2= new ListNode(2);
		ListNode l3= new ListNode(3);
		ListNode l4= new ListNode(4);
		ListNode l5= new ListNode(5);
		ListNode l6= new ListNode(6);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		
		System.out.println("Middle of the element after traversing");
		
		System.out.println(middleOfList(l1));
		
		System.out.println("Middle of the element after traversing efficient Approach is");

		System.out.println(middleOfListEfficient(l1));
		
    	
		
}
  public static void printList(ListNode head){
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.val+"-->"+" ");
			current=current.next;
		}
		System.out.println("null");
		
	}
  public static int middleOfList(ListNode l1){
	  ListNode ptr = l1;
		ListNode middle=l1;
		int count=0;
		while(ptr!=null) {
			count++;
			ptr=ptr.next;
			
		}
		int res= count %2 ==1 ? count/2 : (count/2)-1+1  ;
		for(int i=0;i<res;i++) {
			middle=middle.next;
		}
		return middle.val;
  }
  public static int middleOfListEfficient(ListNode l1){
	  ListNode slow = l1;
	  ListNode fast=l1;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		
	}
	 return slow.val;
  }
}
