package com.java.linkedlist;

public class LengthOfLinkedList {
	
	public static void main(String[] args) {
		ListNodee l1 = new ListNodee(1);
		ListNodee l2 = new ListNodee(2);
		ListNodee l3 = new ListNodee(3);
		ListNodee l4 = new ListNodee(4);
		ListNodee l5 = new ListNodee(5);
		ListNodee l6 = new ListNodee(5);
		ListNodee l7 = new ListNodee(5);
		ListNodee l8 = new ListNodee(5);
		ListNodee l9 = new ListNodee(5);
		ListNodee l10 = new ListNodee(5);
		ListNodee l11= new ListNodee(5);
		ListNodee l12= new ListNodee(5);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;
		l8.next=l9;
		l9.next=l10;
		l10.next=l11;
		l11.next=l12;
		printList(l1);
		
		
		
	}
	public static void printList(ListNodee head) {
		ListNodee current = head;
		int count=0;
		while(current!=null) {
//			System.out.print(current.val+" ->");
			current=current.next;
			count++;
			
		}
		System.out.print(count);
		
	}

}
