//Given an Array of N elements. Sort it in Ascending Order using heap sort
//Idea is to create Min Heap and delete root n times
//Space complexity -> O(N)
//Time complexity -> O(N^2)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    public static void main(String args[]) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(1);
        A.add(7);
        A.add(6);
        A.add(3);
        int n = A.size();
        //Convert it to Min Heap
        while (n > 1) {
            if (n % 2 == 0)
                A.add(Integer.MAX_VALUE);
            for (int i = (n - 2) / 2; i >= 0; i--) {
                heapify(i, A);//Created Min Heap
            }
            if (A.get(A.size() - 1) == Integer.MAX_VALUE) {
                A.remove(A.get(A.size() - 1));//Delete the MAX_VALUE
                n = A.size();
            }
            swap(A, 0, n - 1);
            int val = A.get(A.size() - 1);
            B.add(val);
            A.remove(A.size() - 1);//Delete the lowest element
            n = A.size();
        }
        B.add(A.get(A.size() - 1));
        System.out.println("Elements in ascending order are:");
        System.out.println(B);
    }

    public static void heapify(int i, List<Integer> A) {
        int GI = i;
        int n = A.size();
        while (i <= (n - 2) / 2) {
            int LC = 2 * i + 1;
            int RC = LC + 1;
            if (A.get(LC) < A.get(i))
                GI = LC;
            if (A.get(RC) < A.get(GI))
                GI = RC;
            if (i == GI)
                break;
            swap(A, i, GI);
            i = GI;
        }
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
}
