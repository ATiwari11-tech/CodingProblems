//Given a Max heap, delete the root node
//TC -> O(1+logn)->O(n)//Swapping takes order of 1 and then deleting takes order of 1 and heapify then takes O(n) and
//efficient logic will take log(n) time(it's solved in heapify.java), have solved this question for O(n)
//Idea is to bring the root element to the last then delete the last element and then heapify entire tree/CBT
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class DeleteRootNode {
    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        A.add(10);A.add(8);A.add(9);A.add(5);A.add(2);A.add(5);A.add(2);A.add(1);A.add(0);
        int n = A.size();
        swap(A,0,n-1);
        A.remove(A.get(n-1));
        n = A.size();
        if(n%2 == 0)
            A.add(Integer.MIN_VALUE);
        System.out.println("Before Heapify");
        System.out.println(A);
        for(int i=(n-2)/2;i>=0;i--){
            heapify(i,A);
        }
        System.out.println("After Heapify");
        System.out.println(A);
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
    public static void heapify(int i,List<Integer>A){
        int n = A.size();
        int GI = i;
        while(i<=(n-2)/2){
            int LC = 2*i + 1;
            int RC = LC + 1;
            if(A.get(LC) > A.get(i))
                GI = LC;
            if(A.get(GI) < A.get(RC))
                GI = RC;
            if(GI == i)
                break;
            swap(A,i,GI);
            i = GI;
        }
    }
}
