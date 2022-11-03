package com.linkedlist;

class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data=data;
        this.next = null;
        this.prev = null;
    }
}
public class DesignADoublyLL {
    public static void main(String args[]){
        DNode dhead = new DNode(1);
        dhead.prev = null;
        createDoublyLL(dhead);
        displayDoublyLL(dhead);
    }
    public static DNode createDoublyLL(DNode head){
        DNode curr = head;
        DNode newNode = null;
        for(int i=2;i<=8;i++){
           newNode = new DNode(i);
           curr.next = newNode;
           newNode.prev = curr;
           curr = newNode;
        }
        return head;
    }
    public static void displayDoublyLL(DNode head){
        DNode curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }
}
