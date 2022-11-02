package com.linkedlist;

public class IdentifyLoopInLL {
    public static void main(String args[]){
        boolean isLoopPresent = false;
        //Assume a Linked List is already present with loop
        //Two Approaches to solve this problem
        //Approach 1 -> HashSet
        //Approach 2 -> Slow And Fast Pointer
        Node head = createLoopLinkedList(8);//Linked list of size  8 from 1 to 8
        Node front = head;//To detect loop node, we need to use front node and move slow pointer and front pointer
        displayLoopedLL(head);//Printing the loop only once
        //Now check in linked list, loop present or not
        System.out.println();
        Node sp = head, fp = head;
        while(fp.next != null || fp.next.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp.data == fp.data) {
                isLoopPresent = true;
                break;
            }
        }
        System.out.println("There exists a loop in linkedlist : "+isLoopPresent);
        //Now identify the loop node at runtime in linkedlist
        if(isLoopPresent) {
            Node prev = null;//Need to store previous node to break the link from loop node
            while (front.data != sp.data) {
                front = front.next;
                prev = sp;
                sp = sp.next;
            }
            System.out.println("The Loop Node starts at : " + front.data);
            //Now Delete the loop link
            prev.next = null;
            //After breaking the link, now print the linked list
            System.out.println();
            System.out.println("After deleting the loop, linked list is :");
            displayLL(head);
        }
    }
    public static Node createLoopLinkedList(int n){
        Node head = new Node(1);
        Node tail = head;
        Node prev = null;
        Node saveNode = null;
        while(tail != null){
            for(int i=2;i<=n;i++){
                prev = new Node(i);
                if(prev.data == 4)//Save loop node as 4 i.e. 8th node next will be 4
                    saveNode = prev;
                tail.next = prev;
                tail = tail.next;
            }
            tail = tail.next;
        }
        prev.next = saveNode;
        return head;
    }
    public static void displayLoopedLL(Node head){
        Node curr = head;
        while(curr.data != 8){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print(curr.data+"->");
        System.out.print(curr.next.data);
    }
    public static void displayLL(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
    }
}
