//****Popular Question ********

//Given N Ropes and their lengths. Tie all the ropes into a single rope
//Cost -> Ai+Aj
//newLength -> Ai+Aj
//Goal is to minimize the cost of tieing all the roeps

//Idea is to pick smallest 2 and then add them up at any point of time

//1. Convert to Min Heap
//2. x = getMinFromHeap(A);
//3. deleteRoot();
//4. y = getMinFromHeap(A);
//5. deleteRoot();
//6. cost += x+y;
//7. A.ins(x+y);

//TC-> O(N)+O(NlogN) = O(NlogN)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class NRopes {
    public static void main(String args[]){
        int arr[]={5,17,100,11};
        int cost = 0;
        List<Integer> A = new ArrayList<>();
        A.add(5);A.add(17);A.add(100);A.add(11);
        int n = A.size();
        System.out.println("Before Converting To Min Heap");
        System.out.println(A);
        createMinHeap(A);//O(N)
        System.out.println("After Converting To Min Heap");
        System.out.println(A);
        for(int i=0;i<n-1;i++) {
            //Fetch 1st Minimum
            int x = A.get(0);//O(1)
            //Delete Minimum
            deleteRoot(0, A);//O(LogN)
            //Fetch 2nd Minimum
            int y = A.get(0);//O(1)
            deleteRoot(0, A);//O(LogN)
            cost += x + y;
            int value = x + y;
            insert(A, value);//O(LogN)
        }
        System.out.println("Minimized Cost Is:"+cost);
    }
    public static void createMinHeap(List<Integer> A){
        int n = A.size();
        int i = (n-2)/2;
        while(i>=0){
           heapify(i,A);
            i--;
        }
    }
    public static void heapify(int i,List<Integer> A){
        int n = A.size();
        int GI = i;
        while(i<=(n-2)/2 && (n-2) >= 0 ){
            int LC = 2*i+1;
            int RC = LC + 1;
            if(A.get(LC) < A.get(i))
                GI = LC;
            if(RC < n && A.get(RC) < A.get(GI))
                GI = RC;
            if(GI == i)
                break;
            swap(A,i,GI);
            i = GI;
        }
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

    public static void deleteRoot(int i,List<Integer> A){
        int n = A.size();
        swap(A,0,n-1);
        A.remove(n-1);
        heapify(0,A);
    }

    public static void insert(List<Integer> A,int value){
        A.add(value);
        int n = A.size();
        int i = n-1;
        while(i > 0){
            int parent = (i-1)/2;
            if(A.get(parent) > A.get(i)){
                swap(A,i,parent);
            }
            i = parent;
        }
    }
}
