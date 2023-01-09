//Given a stream of Integers i.e. values will come one at a time.
// At any point of time, give the top/largest kth element
//1. Create Min Heap of size K
//2. Insert k+1 th element
//3. Swap the top from the last element, since the top will be the smallest
//4. Remove the last element
//5. Heapify again to ensure it still remains Min Heap
//6. Repeat above process until all elements from A is processed
//TC -> O(Nlog(K))
//SC -> O(k)->B array of size k
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class LargestKthElement {
    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        A.add(100);A.add(120);A.add(80);A.add(200);A.add(300);;
        System.out.println("Original Stream of Integers:");
        System.out.println(A);
        int n = A.size();
        int k = 3 ;//kth largest element
        for(int i = 0;i<k;i++){//O(K)
            B.add(A.get(i));
        }
        //Create Min Heap Now
        createMinHeap(B);//O(N)
        for(int j=k;j<n;j++){
            insert(A.get(j),B);//O(log(K))
            int m = B.size();
            swap(B,0,m-1);
            B.remove(m-1);
            heapify(0,B);//O(log(K))
        }
        System.out.println(k+" th largest element is :"+B.get(0));
    }
    public static void createMinHeap(List<Integer> B){
        int n = B.size();
        for(int i = (n-2)/2;i >= 0;i--){
           heapify(i,B);
        }
    }

    public static void heapify(int i,List<Integer> B){
        int GI = i;
        int n = B.size();
        while(i <= (n-2)/2){
        int LC = 2*i+1;
        int RC = LC+1;
        if(B.get(i) > B.get(LC))
            GI = LC;
        if(RC < n && B.get(GI) > B.get(RC))
            GI = RC;
        if(i == GI)
            break;
        swap(B,i,GI);
        i = GI;
        }
    }
    public static void swap(List<Integer> B,int i, int j){
        int temp;
        int x = B.get(i);
        int y = B.get(j);
        temp = x;
        x = y;
        y= temp;
        B.set(i,x);
        B.set(j,y);
    }
    public static void insert(int x,List<Integer> B){
        B.add(x);
        int n = B.size();
        int i = n-1;
        while(i >= 1){
            int parent = (i-1)/2;
            if(B.get(i) < B.get(parent)){
                swap(B,i,parent);
            }
            i=parent;
        }
    }
}
