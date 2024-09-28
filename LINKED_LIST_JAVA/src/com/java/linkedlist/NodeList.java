package com.java.linkedlist;

public class NodeList {
    NodeList next;
    int val;

    public NodeList(int val) {
        this.val = val;
        this.next = null;
    }

    public static void printList(NodeList head) {
        NodeList ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static NodeList reverse(NodeList head) {
        if (head == null) return null;

        NodeList prevNode = null;
        NodeList currentNode = head;

        while (currentNode != null) {
            NodeList nextNode = currentNode.next; 
            currentNode.next = prevNode;         
            prevNode = currentNode;               
            currentNode = nextNode;               
        }
        head=prevNode;
        return head; // prevNode will be the new head of the reversed list
    }

    public static void main(String[] args) {
        NodeList l1 = new NodeList(2);
        NodeList l2 = new NodeList(3);
        NodeList l3 = new NodeList(4);
        NodeList l4 = new NodeList(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        System.out.println("Original list:");
        printList(l1);

        l1 = reverse(l1);

        System.out.println("Reversed list:");
        printList(l1);
    }
}
