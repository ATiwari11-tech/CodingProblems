//Given N distinct elements. Find the number of ways of creating max heap
//Ways(N) = (N-1)CL*Ways(L)*Ways(R)
//N = No. Of Nodes
//L = No. of Nodes in Left Subtree
//R = No.of Nodes in Right Subtree
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class WaysOfCreatingMaxHeap {
    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(4);
        int n = A.size();
    }
}
