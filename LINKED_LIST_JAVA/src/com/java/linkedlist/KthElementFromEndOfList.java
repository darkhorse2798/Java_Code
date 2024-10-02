package com.java.linkedlist;

public class KthElementFromEndOfList {
	
	public static void main(String[] args) {
		ListNodee l1 = new ListNodee(1);
		ListNodee l2 = new ListNodee(2);
		ListNodee l3 = new ListNodee(3);
		ListNodee l4 = new ListNodee(4);
		ListNodee l5 = new ListNodee(6);
		ListNodee l6 = new ListNodee(7);
		ListNodee l7 = new ListNodee(8);
		ListNodee l8 = new ListNodee(9);
		ListNodee l9 = new ListNodee(10);
		ListNodee l10 = new ListNodee(11);
		ListNodee l11= new ListNodee(12);
		ListNodee l12= new ListNodee(13);
		
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
		System.out.println(kthElementFromList(l1,5));
		printList(l1);
		
		
	}
	
	private static void printList(ListNodee head) {
		ListNodee ptr=head;
		while(ptr!=null) {
			System.out.print(ptr.val+" -->"+" ");
			ptr=ptr.next;
		}
		System.out.print("null");
		
	}

	public static ListNodee kthElementFromList(ListNodee head,int position){
//		ListNodee dummyNode = new ListNodee(Integer.MIN_VALUE);
		
		ListNodee firstPointer =head;
		ListNodee secondPointer =head;
		
		for(int i=0; i<position;i++) {
			secondPointer=secondPointer.next;
		}
		while(secondPointer.next!=null) {
			firstPointer=firstPointer.next;
			secondPointer=secondPointer.next;

			
		}
		
		firstPointer.next=firstPointer.next.next;
		
		return head;
		
	}

}
