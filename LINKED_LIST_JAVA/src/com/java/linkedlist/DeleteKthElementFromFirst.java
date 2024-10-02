package com.java.linkedlist;

public class DeleteKthElementFromFirst {
    
	public static void main(String[] args) {
		 ListNodee l1= new ListNodee(1);
		  ListNodee l2= new ListNodee(2);
		  ListNodee l3= new ListNodee(3);
		  ListNodee l4= new ListNodee(4);
		  ListNodee l5= new ListNodee(5);
		  
		  l1.next=l2;
		  l2.next=l3;
		  l3.next=l4;
		  l4.next=l5;
		  
		  deleteKthElementFromList(l1,4);
		  
		  printList(l1);
		
	}
   
	
	private static void printList(ListNodee head) {
		ListNodee ptr= head;
		while(ptr!=null) {
			System.out.print(ptr.val+" -->"+" ");
			ptr=ptr.next;
		}
		System.out.print("null");
	}


	private static ListNodee deleteKthElementFromList(ListNodee head, int position) {
	    if (head == null || position <= 0) {
	        return head;  
	    }

	    ListNodee dummy = new ListNodee(Integer.MIN_VALUE);
	    dummy.next = head;
	    ListNodee current = dummy;

	    for (int i = 0; i < position - 1; i++) {
	        if (current.next == null) {
	            return head;  
	        }
	        current = current.next;
	    }

	    if (current.next != null) {
	        current.next = current.next.next;
	    }

	    return dummy.next;
	}


}
