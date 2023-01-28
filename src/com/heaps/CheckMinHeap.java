//Given a complete binary tree, check if it is a min heap
//TC->O(logn)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class CheckMinHeap {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(10);list.add(18);list.add(20);list.add(80);list.add(90);list.add(32);
        int n = list.size();
        if(checkifMinHeap(list))
            System.out.println("Given CBT is a Min Heap");
        else
            System.out.println("Given CBT isn't a Min Heap");
    }
    public static boolean checkifMinHeap(List<Integer> A)
    {
        int i = 0;
        int n = A.size();
        if(n % 2 == 0)//If number of elements in CBT is even then last node would be missing therefore added Infinity
            A.add(Integer.MAX_VALUE);
        int LC = 2*i+1;
        int RC = LC + 1;
        while(i <= (n-2)/2){
            if(!(A.get(i) < A.get(LC) && A.get(i) < A.get(RC)))
                return false;
            i++;
            LC = 2*i+1;
            RC = LC + 1;
        }
        return true;
    }
}
