package com.java.linkedlist;

public class KthElementFromLast {
	
	public static void main(String[] args) {
		 ListNodee l1= new ListNodee(1);
		  ListNodee l2= new ListNodee(2);
		  ListNodee l3= new ListNodee(3);
		  ListNodee l4= new ListNodee(4);
		  ListNodee l5= new ListNodee(5);
		  ListNodee l6= new ListNodee(6);
		  
		  l1.next=l2;
		  l2.next=l3;
		  l3.next=l4;
		  l4.next=l5;
		  l5.next=l6;
		  
//		  printList(l1);
		  
		  System.out.println(kthelementFromLast(l1,3));
		  
		
	}

	private static int kthelementFromLast(ListNodee head, int position) {
	    if (head == null || position <= 0) {
	        throw new IllegalArgumentException("Invalid position or empty list.");
	    }

	    ListNodee firstPointer = head;
	    ListNodee secondPointer = head;

	    for (int i = 0; i < position; i++) {
	        if (secondPointer == null) {
	            throw new IllegalArgumentException("Position is greater than the length of the list.");
	        }
	        secondPointer = secondPointer.next;
	    }

	    while (secondPointer != null) {
	        firstPointer = firstPointer.next;
	        secondPointer = secondPointer.next;
	    }

	    return firstPointer.val;
	}

//	private static void printList(ListNodee head) {
//		ListNodee ptr = head;
//		while(ptr!=null) {
//			System.out.print(ptr.val+"-->"+" ");
//			ptr=ptr.next;
//		}
//		System.out.print("null");
//	}

}
