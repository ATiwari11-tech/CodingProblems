//Given a Min Heap, insert a new value and after inserting ensure that it's still a Min Heap
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class InsertInHeap {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(7);list.add(8);list.add(9);list.add(102);list.add(65);list.add(100);list.add(105);
        list.add(104);list.add(220);list.add(10);list.add(20);
        int elementToInsert = 2;
        list.add(elementToInsert);
        int n = list.size();
        //Expected Output after inserting new element
        //2,8,7,102,65,9,105,104,220,10,20,100
        System.out.println("Original Elements:");
        System.out.println(list);
        //Now move the value to it's original place keeping heap property intact
        for(int i=n-1;i>=1;){
            int parent = (i-1)/2;
            if(list.get(i) < list.get(parent))
                swap(list,i,parent);
            i = parent;
        }
        System.out.println("Parsed Elements");
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
