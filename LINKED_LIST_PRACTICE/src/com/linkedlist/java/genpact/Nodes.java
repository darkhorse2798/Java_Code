package com.linkedlist.java.genpact;

public class Nodes {
    int val;
    Nodes next;

    //1-->null
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
        
      
       n1=deleteFromMiddle(n1,0);
       printList(n1);
       
       System.out.println("Deleting second element to the middle of the LinkedList");

       n1=deleteFromMiddle(n1,1);
       printList(n1);
       
       System.out.println();

        
        
        System.out.println("Adding 3  to the middle of the LinkedList at second index");
        
        n1=addingToMiddle(n1,2,3);
        
        
        printList(n1);





        
    }

    private static Nodes addingToMiddle(Nodes head, int position, int val) {
    	Nodes newNode = new Nodes(val);
    	Nodes dummy = head;
        if (head == null && position ==0) {
        	head=newNode;
            return head; 
        }
      
        


        for (int i = 0; i < position - 1; i++) {
            if (dummy.next == null) { 
                System.out.println("Position out of bounds.");
                return head;
            }
            dummy = dummy.next;
        }

        Nodes temp = dummy.next;
        
        //1 2  4 5 6
   //         d
        dummy.next = newNode;
        newNode.next = temp;

        return head;
    }
    //2  

	private static Nodes deleteFromMiddle(Nodes head, int position) {
//index	// 0 1 2 3 4 5
		// 1 2 3 4 5 6
		// h
	//       p	
	
       if(head==null) {
    	   System.out.println("can't delete the node");
    	   return null;
       }
   	if(position==0) {
		return head.next;
	}
       Nodes dummy= head;
       
       for(int i=0; i<position-1;i++) {
    	   if(dummy.next==null) {
    		   System.out.println("position out of bound");
    		   return head;
    	   }
    	   dummy=dummy.next;
       }
       
       // 1 3 4 5 6
       // 1 2 3 4 5  6 //nodeTobeDelete=3
       //   d
       Nodes nodeToDelete = dummy.next;  //=3
       Nodes nextNode=nodeToDelete.next;  //nextNode=4
       dummy.next=nextNode;  //dummy.next=4;
       
       
       

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
        Nodes newNode = new Nodes(val);  //6
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
    
    //1 --> 2 ->3  //0-->1

    public static Nodes addFirst(Nodes head, int val) {
        Nodes dummy = new Nodes(val); 
        dummy.next = head;
        return dummy;
    }
}
