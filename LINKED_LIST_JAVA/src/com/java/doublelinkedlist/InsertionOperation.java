package com.java.doublelinkedlist;

public class InsertionOperation {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(1);
		ListNode l3= new ListNode(2);
		ListNode l4 = new ListNode(3);
		
		l1.next=l2;
		l2.prev=l1;
		
		l2.next=l3;
		l3.prev=l2;
		
		l3.next=l4;
		l4.prev=l3;
		
		System.out.println("Printing the original List");
		printList(l1);
		System.out.println();

		System.out.println("Inserting at begining");
		
		l1=insertAtBegining(l1,-1);
		l1=insertAtBegining(l1,-2);
				
		printList(l1);
		System.out.println();

		
		System.out.println("Inserting at last");
		
		l1=insertAtLat(l1,4);
		l1=insertAtLat(l1,5);
		
		printList(l1);
		
		System.out.println();
		
		System.out.println("Inserting List At Middle");
		l1=insertAtMiddle(l1,11,0);
		printList(l1);

		System.out.println("Inserting List At Middle");
		l1=insertAtMiddle(l1,12,1);
		
		printList(l1);
		
		System.out.println("Inserting List At Middle when the given position doesn't exist in list,output should be null");
		l1=insertAtMiddle(l1,50,12);
		printList(l1);

		
		System.out.println();


		
		
	}
	public static ListNode insertAtBegining(ListNode head,int val) {
		
		if(head==null) return head;
		ListNode newNode = new ListNode(val);
		
		newNode.next=head;
		
		head.prev=newNode;

		head=newNode;
		
		return head;
		
		
	}
	
public static ListNode insertAtLat(ListNode head,int val) {
	if(head==null) return head;
	ListNode ptr = head;
	while(ptr.next!=null) {
		ptr=ptr.next;
	}
	ListNode newNode = new ListNode(val);
	
	ptr.next=newNode;
	newNode.prev=ptr;
	
	return head;
	
		 
}
public static ListNode insertAtMiddle(ListNode head,int val,int position) {
	ListNode newNode = new ListNode(val);
	if(position==0) {
		newNode.next=head;
		
		head.prev=newNode;
		
		head=newNode;
		return head;
		
	}
	if(head==null && position==0) {
		newNode.next=head;
		head=newNode;
		return head;
		
	}

  ListNode ptr = head;
  for(int i=1 ; i<position-1;i++) {
	  if(ptr.next!=null) {
		  return null;
	  }
	  ptr=ptr.next;
	  
  }
  
   newNode.next=ptr.next;
   ptr.next=newNode;
   newNode.prev=ptr;
   return head;
   
  
	
}

	public static void printList(ListNode head) {
		ListNode ptr = head;
		
		while(ptr!=null) {
			System.out.print(ptr.val+"-->");
			ptr=ptr.next;
		}
		System.out.println("null");
	}

}
