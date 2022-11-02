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
    }
    public static Node createDoublyLL(DNode head){
        DNode curr = head;
        DNode prev = null;
        DNode newNode = null;
        for(int i=2;i<=8;i++){
           newNode = new DNode(i);
           newNode.prev = curr;
           curr = newNode;
        }
        return null;
    }
}
