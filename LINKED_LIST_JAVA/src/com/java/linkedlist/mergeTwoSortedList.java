package com.java.linkedlist;

public class mergeTwoSortedList {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		
		ListNode p1= new ListNode(6);
		ListNode p2= new ListNode(7);
		ListNode p3= new ListNode(8);
		ListNode p4= new ListNode(9);
		ListNode p5= new ListNode(10);
		
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=p5;
		
		
		ListNode merged=mergeSortedList(l1,p1);
		
		printlist(merged);
	}

	private static void printlist(ListNode p1) {
		ListNode current =p1;
		while(current!=null) {
			System.out.print(current.val+" -->"+" ");
			current=current.next;
		}
		System.out.print("null");
	}

	private static ListNode mergeSortedList(ListNode head1,ListNode head2) {
		ListNode dummyNode=new ListNode(Integer.MIN_VALUE);
		ListNode current = dummyNode;
		
		ListNode ptr1=head1;
		ListNode ptr2=head2;
		
		
		
		while(ptr1!=null && ptr2!=null){
			if(ptr1.val<=ptr2.val){
				current.next= new ListNode(ptr1.val) ;
				ptr1=ptr1.next;
			}
			else{
				dummyNode.next= new ListNode(ptr2.val) ;
				ptr2=ptr2.next;
			}
			current=current.next;
			
		}
		while(ptr1!=null) {
			current.next= new ListNode(ptr1.val) ;
			ptr1=ptr1.next;
			current=current.next;


		}
		while(ptr2!=null) {
			current.next= new ListNode(ptr2.val) ;
			ptr2=ptr2.next;
			current=current.next;

			
		}
		
		return dummyNode.next;
		
	}
	

}
