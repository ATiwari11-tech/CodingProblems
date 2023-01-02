//Given a complete binary tree in which left subtree and right subtree exhibits properties of max heap
//We need to now heapify root element i.e. insert root element at it's correct position such that entire tree
//exhibits properties of max heap
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class Heapify {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);list.add(4);list.add(40);list.add(2);list.add(1);list.add(20);list.add(10);list.add(1);list.add(0);
        list.add(-1);list.add(-2);list.add(6);list.add(7);
        int n = list.size();
        System.out.println("Input Tree:");
        System.out.println(list);
        //Input tree
        //8,4,40,2,1,20,10,1,0,-1,-2,6,7
        //Desired output as per input should be
        //40,4,20,2,1,8,10,1,0,-1,-2,6,7
        int i = 0;//Root element which has to be kept at it's right place
        int LC = 2*i+1;
        int RC = LC + 1;
        int GI = i;
        while(i <= (n-2)/2) {
            if (list.get(i) < list.get(LC))
                GI = LC;
            if (list.get(GI) < list.get(RC))
                GI = RC;
            if (GI == i)
                break;
            swap(list, i, GI);
            i = GI;
            LC = 2*i+1;
            RC = LC + 1;
        }
        System.out.println("Output Tree:");
        System.out.println(list);
    }
    public static void swap(List<Integer> A, int i, int j){
        int temp;
        int x = A.get(i);
        int y = A.get(j);
        temp = x;
        x = y;
        y = temp;
        A.set(i,x);
        A.set(j,y);
    }
}
