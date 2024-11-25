package com.java.doublelinkedlist;

public class DeletionOpearation {
	public static void main(String[] args) {
		ListNode l1= new ListNode(0);
		ListNode l2= new ListNode(-1);
		ListNode l3= new ListNode(-2);
		ListNode l4= new ListNode(-3);
		
		l1.next=l2;
		l2.prev=l1;
		
		l2.next=l3;
		l3.prev=l2;
		
		l3.next=l4;
		l4.prev=l3;
		
		printList(l1);
		
//		System.out.println("Deleting From first");
//		l1=deleteFromFirst(l1);
//		l1=deleteFromFirst(l1);
//		printList(l1);
//		System.out.println();
		
		System.out.println("Deleting From last");
		l1=deleteFromLast(l1);
		printList(l1);
		
		
//		System.out.println("Deleting from the given position of the list");
//		System.out.println();
//		l1=deleteFromMiddle(l1,3);
//		printList(l1);

		
//		System.out.println("Deleting from zeroth position of the list");
//		l1=deleteFromMiddle(l1,0);
//		printList(l1);
//		System.out.println("Deleting from zeroth position of the list");
//		l1=deleteFromMiddle(l1,0);
//		printList(l1);
//		System.out.println("Deleting from zeroth position of the list");
//		l1=deleteFromMiddle(l1,0);
//		printList(l1);

		
      
		
	}
	public static void printList(ListNode head) {
		ListNode ptr = head;
		
		
		
		while(ptr!=null) {
			System.out.print(ptr.val+"-->");
			ptr=ptr.next;
		}
		System.out.println("null");
	}
	public static ListNode deleteFromFirst(ListNode head) {
		if(head==null) return null;
		head= head.next;
		head.prev=null;
		
		return head;
		
		
	}
	public static ListNode deleteFromLast(ListNode head) {
		
		if(head==null) return null;
	    if (head.next == null) return null;

		ListNode ptr =head;
		while(ptr.next.next!=null) {
			ptr=ptr.next;
		}
		ListNode current =ptr.prev;
		ptr.next=null;
		ptr.prev=current;
		
		return head;
		
		
		
	}
	public static ListNode deleteFromMiddle(ListNode head,int position) {
		if(head==null) {
			System.out.println("Nothing to delete to printing null as output");
			return head;
		}
		if(position==0 && head!=null){
			head=head.next;
			return head;
		}else if(position==0 && head==null) {
			System.out.println("List is empty, so can't delete elements");
			return null;
		}
		ListNode ptr= head;
		for(int i=0; i<position-1;i++) {
			if(ptr.next.next==null) {
				System.out.println("Current position doesn't exists in List,so printing the normal list");
				return head;
			}
			ptr=ptr.next;
		}
		ListNode current =ptr;
		ptr.next=ptr.next.next;
		ptr.prev=current;
		return head;
		
		
		
	}

}
