//Given an Array or CBT, Convert it to Max heap
//This technique will be used only when all array elements are given beforehand
//TC -> O(n)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class ConvertToMaxHeap {
    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        A.add(15);A.add(8);A.add(70);A.add(80);A.add(10);A.add(5);
        int n = A.size();
        if(n%2 == 0)
           A.add(Integer.MIN_VALUE);
        System.out.println("Before Converting");
        System.out.println(A);
        for(int i = (n-2)/2;i>=0;i--){
            heapify(i,A);
        }
        System.out.println("After Converting");
        System.out.println(A);
    }
    public static void heapify(int i,List<Integer> A){
        int GI = i;
        int n = A.size();
        while(i <=(n-2)/2) {
            int LC = 2 * i + 1;
            int RC = LC + 1;
            if (A.get(LC) > A.get(i))
                GI = LC;
            if (A.get(GI) < A.get(RC))
                GI = RC;
            if (GI == i)
                break;
            swap(A, i, GI);
            i = GI;
        }
    }
    public static void swap(List<Integer> A,int i, int j){
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
