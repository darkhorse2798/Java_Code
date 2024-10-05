package com.java.linkedlist;

public class AddTwoList {
    public static void main(String[] args) {
        // Creating first list
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);

        // Creating second list
        ListNode p1 = new ListNode(9);
        ListNode p2 = new ListNode(9);
        ListNode p3 = new ListNode(9);
        ListNode p4 = new ListNode(9);

        // Linking first list
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        // Linking second list
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        l1 = addTwoList(l1, p1);

        System.out.println("After adding the two lists, the new list is:");
        printList(l1);
    }

    public static ListNode addTwoList(ListNode l1, ListNode p1) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || p1 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (p1 != null) ? p1.val : 0;
            int sum = x + y + carry;

            carry = sum / 10; 
            current.next = new ListNode(sum % 10); 
            current = current.next;  

            if (l1 != null) l1 = l1.next;
            if (p1 != null) p1 = p1.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void printList(ListNode l1) {
        ListNode current = l1;
        while (current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
            if(current.next==null) {
                System.out.print(current.val );

            	return;
            }
        }
//        System.out.println("null");
    }
}
