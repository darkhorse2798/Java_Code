package com.java.linkedlist;



public class Nodes {
    int val;
    Nodes next;

    public Nodes(int val) {
        this.val = val;
        this.next = null;
    }

    public static void main(String[] args) {

        Nodes n1 = new Nodes(1);
        Nodes n2 = new Nodes(2);
        Nodes n3 = new Nodes(4);
        Nodes n4 = new Nodes(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printList(n1);
        
        System.out.println();


        System.out.println("Adding item in first position");
        n1 = addFirst(n1, 0);
        printList(n1);
        System.out.println();


        System.out.println("Adding item in first position");
        n1 = addFirst(n1, -1);
        printList(n1);
        
        System.out.println();


        System.out.println("Deleting item from first position");
        n1 = deleteFromFirst(n1);
        printList(n1);
        
        System.out.println();


        System.out.println("Deleting item from first position");
        n1 = deleteFromFirst(n1);
        printList(n1);

        System.out.println();

        System.out.println("Adding item at last position");
        n1 = adddingAtaLast(n1, 6);
        printList(n1);
        
        System.out.println();

//
//        System.out.println("Adding item at last position to empty list");
//        Nodes emptyList = null;
//        emptyList = adddingAtaLast(emptyList, 10);
//        printList(emptyList);
        
        
        System.out.println("Deleting item at last position ");
        
        n1=deleteItemFromLast(n1);
        printList(n1);
        
        System.out.println();
        
        System.out.println("Deleting second element to the middle of the LinkedList");
        
      
       n1=deleteFromMiddle(n1,2);
       printList(n1);
       
        
        
        System.out.println("Adding third element to the middle of the LinkedList");
        
        n1=addingToMiddle(n1,2,3);
        
        
        printList(n1);





        
    }

    private static Nodes addingToMiddle(Nodes head, int position, int val) {
        if (head == null) {
            return head; 
        }

        Nodes dummy = head;
        Nodes newNode = new Nodes(val);

        for (int i = 0; i < position - 1; i++) {
            if (dummy.next == null) { 
                System.out.println("Position out of bounds.");
                return head;
            }
            dummy = dummy.next;
        }

        Nodes temp = dummy.next;

        dummy.next = newNode;
        newNode.next = temp;

        return head;
    }

	private static Nodes deleteFromMiddle(Nodes head, int position) {
		
		if(position==0) {
			return head.next;
		}
       if(head==null) {
    	   System.out.println("can't delete the node");
       }
       Nodes dummy= head;
       for(int i=0; i<position-1;i++) {
    	   if(dummy.next==null) {
    		   System.out.println("position out of bound");
    		   return head;
    	   }
    	   dummy=dummy.next;
       }
       Nodes nodeToDelete = dummy.next;
       Nodes nextNode=nodeToDelete.next;
       dummy.next=nextNode;
       
       
       

        return head;
    }

	private static Nodes deleteItemFromLast(Nodes head) {
    	if(head==null) {
    		return head;
    	}
    	Nodes ptr= head;
    	while(ptr.next.next!=null) {
    		ptr=ptr.next;
    	}
    	ptr.next=null;
		
		return head;
	}

	private static Nodes adddingAtaLast(Nodes head, int val) {
        Nodes newNode = new Nodes(val);
        if (head == null) {
            return newNode; 
        }
        Nodes ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        return head;
    }

    private static Nodes deleteFromFirst(Nodes head) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return null;
        }
        return head.next;
    }

    public static void printList(Nodes head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Nodes ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static Nodes addFirst(Nodes head, int val) {
        Nodes dummy = new Nodes(val);
        dummy.next = head;
        return dummy;
    }
}
