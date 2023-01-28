//Given some elements create a max heap
//TC -> O(nlogn)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class CreateMaxHeap {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(70);list.add(10);list.add(72);list.add(75);
        System.out.println("Original List:");
        System.out.println(list);
        int n = list.size();
        for(int i=1;i<n;i++){
            while(i>0){
                int parent = (i-1)/2;
                if(list.get(i) > list.get(parent)) {
                    swap(list, i, parent);
                    i = parent;
                }
                else
                    break;
            }
        }
        System.out.println("Parsed List");
        System.out.println(list);
    }
    public static void swap(List<Integer> A, int i, int j){
        int temp;
        int x = A.get(i);
        int y = A.get(j);
        temp = x;
        x = y;
        y= temp;
        A.set(i,x);
        A.set(j,y);
    }
}
