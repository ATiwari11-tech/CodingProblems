package com.linkedlist;

public class InsertNodeInLL {
    public static void main(String args[]){
        Node head = createLL(5);
        //LL before inserting new node in position x
        System.out.println("Before inserting new node");
        displayLL(head);
        int pos=0;
        //Insert at 3rd position
        if(pos==0) {
            Node newNode = new Node(7);
            newNode.next = head;
            head = newNode;
        }
        else {
            Node node = findPos(head, pos);
            Node newNode = new Node(7);
            newNode.next = node.next;
            node.next = newNode;
        }
        //LL After inserting new node in position x
        System.out.println();
        System.out.println("After inserting new node");
        displayLL(head);
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
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }
    public static Node findPos(Node head,int pos){
        Node curr = head;
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        return curr;
    }
}
