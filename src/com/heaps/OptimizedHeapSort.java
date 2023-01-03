//Given an Array of N elements. Sort it in Ascending Order using heap sort
//Idea is to create Max Heap
//Swap first with last then reduce n to n--
//heapify again for every node till n>1
//Space complexity -> O(1)
//Time complexity -> O(Nlogn)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class OptimizedHeapSort {
    public static void main(String args[]) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(1);
        A.add(7);
        A.add(6);
        A.add(3);
        System.out.println("Before Creating Max Heap");
        System.out.println(A);
        int n = A.size();
        for(int i=(n-2)/2;i>=0;i--){
            createHeap(i,A);//O(N)
        }
        System.out.println("After Creating Max Heap");
        System.out.println(A);
        while(n > 1){//O(N)
            swap(A,0,n-1);
            n--;
            heapify(0,A,n);//O(log(N))
        }
        if(A.get(0) > A.get(1))
            swap(A,0,1);
        System.out.println("After Heap Sort");
        System.out.println(A);
    }
    public static void swap(List<Integer> A, int i, int j) {
        int temp;
        int x = A.get(i);
        int y = A.get(j);
        temp = x;
        x = y;
        y = temp;
        A.set(i, x);
        A.set(j, y);
    }
    public static void createHeap(int i, List<Integer> A) {
        int GI = i;
        int n = A.size();
        while (i <= (n - 2) / 2) {
            int LC = 2 * i + 1;
            int RC = LC + 1;
            if (A.get(LC) > A.get(i))
                GI = LC;
            if (RC < n && A.get(RC) > A.get(GI))
                GI = RC;
            if (i == GI)
                break;
            swap(A, i, GI);
            i = GI;
        }
    }

    public static void heapify(int i, List<Integer> A,int n){
        int GI = i;
        while(i <= (n-2)/2){
            int LC = 2*i+1;
            int RC = LC+1;
            if(A.get(i) < A.get(LC))
                GI = LC;
            if(RC < n && A.get(GI) < A.get(RC))
                GI = RC;
            if(i == GI)
                break;
            swap(A,i,GI);
            i = GI;
        }
    }

}
