//Given Linked List, find the middle most element
//Linked List should be parsed only once
package com.linkedlist;

public class MiddleElementInLL {
    public static void main(String args[]){
        Node head = createLL(8);//1,2,3,4,5,6,7,8
        displayLL(head);
        System.out.println();
        Node sp=head,fp=head;//sp->slow pointer, fp-> fast pointer
        //slow pointer will do movement one step at a time
        //fast pointer will do movement two steps at a time
        while(fp.next != null && fp.next.next != null){
            sp = sp.next;
            fp=fp.next.next;
        }
        if(fp.next == null)//Odd Size LinkedList
            System.out.println("Middle Most Element = "+sp.data);
        else if(fp.next.next == null)//Even Sized LinkedList
            System.out.println("Middle Most Element = "+sp.next.data);
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
}
