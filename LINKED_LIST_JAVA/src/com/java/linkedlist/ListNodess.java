package com.java.linkedlist;

public class ListNodess {
	int val;
	ListNodess next;
	
	public ListNodess(int val) {
		 this.val=val;
		 this.next=next;
	}
	
	public static void main(String[] args) {
		ListNodess l1 = new ListNodess(1);
		ListNodess l2 = new ListNodess(2);
		ListNodess l3 = new ListNodess(3);
		ListNodess l4 = new ListNodess(4);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		
		printList(l1);
		
		l1=addListFromFirst(l1,0);
		
		printList(l1);
		
		l1=addLast(l1, 7);
		l1=addLast(l1, 8);
		l1=addLast(l1, 9);
		l1=addLast(l1, 10);
		
		printList(l1);
		
	   l1=addFromMiddle(l1,9,3);
	
		printList(l1);
		
		
		
}
	
	public static ListNodess addFromMiddle(ListNodess head,int val,int position) {
		ListNodess newNode = new ListNodess(val);
		
		ListNodess current = head;
		//1->2->3->4->5->null
		for(int i=0; i<position-1;i++) {
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
		return head;
		
		
	}
	public static ListNodess addListFromFirst(ListNodess head,int value){
		
		ListNodess current =new ListNodess(value);
	      
		current.next=head;
		head=current;
		
	return head;
		}
public static ListNodess addLast(ListNodess head,int value){
		
		ListNodess nodeToBeAdded =new ListNodess(value);
		ListNodess ptr =head;
	while(ptr.next!=null) {
		ptr=ptr.next;
	}
	ptr.next=nodeToBeAdded;
	      
	return head;
		}
	public static void printList(ListNodess head){
		ListNodess current = head;
		while(current!=null) {
			System.out.print(current.val + " -> ");
			current=current.next;	
		}
		System.out.println("null");
	}

}
