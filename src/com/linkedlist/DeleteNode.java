package com.linkedlist;

public class DeleteNode {
    public static void main(String args[]){
        Node head = createLL(5);
        System.out.println("Before Deleting Node");
        displayLL(head);
        //Delete Node position number 3
        int pos=0;//3,2
        if(pos == 0)
            head = head.next;
        else {
            Node node = findNodeAtPos(head, pos);
            Node nextNode = node.next;
            node.next = nextNode.next;
        }
        System.out.println();
        System.out.println("After Deleting Node");
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

    public static Node findNodeAtPos(Node head, int pos){
        Node curr = head;
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        return curr;
    }
    public static void displayLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }
}
