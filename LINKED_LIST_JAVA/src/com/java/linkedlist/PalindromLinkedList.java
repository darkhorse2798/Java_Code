package com.java.linkedlist;

public class PalindromLinkedList {
	public static void main(String[] args) {
		
		//This is palindromic List
		ListNode l1= new ListNode(1);
		ListNode l2= new ListNode(2);
		ListNode l3= new ListNode(2);
		ListNode l4= new ListNode(1);
		
		//This is not palindromic List
//		ListNode l1= new ListNode(1);
//		ListNode l2= new ListNode(2);
//		ListNode l3= new ListNode(2);
//		ListNode l4= new ListNode(3);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		
		System.out.println(isPalindrome(l1));
		
	}
	public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode firstHalf = head;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);

        while (secondHalf != null) {  
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
