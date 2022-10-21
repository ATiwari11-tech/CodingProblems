//Given a linked list, reverse it
package com.linkedlist;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String args[]){
        Node head = createLL(5);//Create LinkedList of size 5
        System.out.println("Before Reversing LL");
        displayLL(head);//Display what's there in LinkedList
        head = reverseLL(head);
        System.out.println();
        System.out.println("After Reversing LL");
        displayLL(head);//Display what's there in LinkedList
    }
    public static Node createLL(int n){
        Node head = new Node(1);
        Node tail = head;
        for(int i=2;i<=n;i++){
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;
    }
    public static void displayLL(Node head){
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    public static Node reverseLL(Node head){
        if(head == null)
            return null;
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
