//Given a stream of integers. Find the median of elements so far i.e. Return Median array
//Hard Problem
//Maintain 2 heaps, for left side maintain max heap, and for right side maintain min heap
//1.Approach -> Divide logically into 2 parts i.e. N/2,N/2, and keep 1 element extra in either side, to find the middle val
//2.Division should be such that left part elements should always be less than right part elements
//3.If difference of no. of elements is 1 from left to right and if above property(step 2) remain intact, then
//max of first part elements will be median
//4.If difference of no. of elements is 1 from left to right and if above property doesn't remain intact(step2),then
//swap max of first part elements with min of second part element
//5. If difference of no. of elements is more than 1, then shift the newly encountered element from left to right and
// before that decide which element should go to right, i.e. move the larger element to right
//6. If there is no difference in no. of elements in left and right i.e they are same ,then median would be
// (max of first half + min of second half) /2
//TC -> O(NlogN)
//SC -> O(N)
package com.heaps;

import java.util.ArrayList;
import java.util.List;

public class MedianFromSreamOfIntegers {
    static List<Double> median = new ArrayList<>();
    public static void main(String args[]){
        List<Integer> A = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        A.add(5);A.add(2);A.add(1);A.add(6);A.add(9);A.add(10);A.add(15);A.add(17);A.add(8);
        //5,2,1,6,9,10,15,17,8
        //M-> 5,3.5,2,3.5,5,5.5,6,7.5,8
        int n = A.size();
        left.add(A.get(0));
        median.add(Double.valueOf(A.get(0)));
        for(int i=1;i<n;i++){
            int diff = left.size()- right.size();
            if(diff == 1){
                insertIntoMaxHeap(A.get(i),left);//1,2,5,6 i.e. Converting it to Max Heap
                diff = checkCondition(left,right);
                calculateMedian(diff,left,right);
            }
            else if(diff == 0){
                insertIntoMaxHeap(A.get(i),left);//1,2,5,6,8 i.e. Converting it to Min Heap
                diff = checkCondition(left,right);
                calculateMedian(diff,left,right);
            }
            else if(diff > 1){
                int value = left.get(0);//5
                deleteRoot(left);//5
                insertIntoMinHeap(value,right);//5
                insertIntoMaxHeap(A.get(i),left);//1,2
                diff = checkCondition(left,right);
                calculateMedian(diff,left,right);
            }
        }
        System.out.println("Medain Array Is :"+median);
    }
    public static void calculateMedian(int diff,List<Integer>left,List<Integer>right){
        if(diff == 1)
            median.add(Double.valueOf(left.get(0)));
        else if(diff == 2 && right.size() == 0)
        {
            double med = (Double.valueOf(left.get(0))+Double.valueOf(left.get(1)))/2;
            median.add(med);
        }
        else if(diff == 2){
            shift(left,right);
        }
        else if(diff == 0){
            double med = (Double.valueOf(left.get(0))+Double.valueOf(right.get(0)))/2;
            median.add(med);
        }
    }
    public static int checkCondition(List<Integer>left,List<Integer>right){
       int diff = left.size()-right.size();
       if(right.size() > 0 && left.get(0) > right.get(0)){
           int value1 = left.get(0);//17
           deleteRoot(left);//17
           int value2 = right.get(0);//9
           deleteRoot(right);//9
           insertIntoMinHeap(value1,right);//9,10,15,17 i.e. Converting it to Min Heap
           insertIntoMaxHeap(value2,left);//1,2,5,6,8 i.e. Converting it to Max Heap
       }
       return diff;
    }
    public static void shift(List<Integer> left,List<Integer> right){
        int val1 = left.get(0);
        deleteRoot(left);
        insertIntoMinHeap(val1,right);//9,10,15,17 i.e. Converting it to Min Heap
        int diff = left.size()-right.size();
        calculateMedian(diff,left,right);
    }

    public static void insertIntoMaxHeap(int val,List<Integer> A){
        A.add(val);
        int n = A.size();
        int i = (n-2)/2;
        while(i>=0){
            heapifyMaxHeap(i,A);
            i--;
        }
    }

    public static void insertIntoMinHeap(int val,List<Integer> A){
        A.add(val);
        int n = A.size();
        int i=(n-2)/2;
        while(i >= 0){
            heapifyMinHeap(i,A);
            i--;
        }
    }

    public static void deleteRoot(List<Integer> A){
        int n = A.size();
        swap(A,0,n-1);
        A.remove(n-1);
        int i=0;
        heapifyMaxHeap(0,A);
    }

    public static void heapifyMaxHeap(int i,List<Integer> A){
        int GI = i;
        int n = A.size();
        while(i <= (n-2)/2 && (n-2) >= 0){
            int LC = 2*i+1;
            int RC = LC+1;
            if(A.get(LC) > A.get(i))
                GI = LC;
            if(RC < n && A.get(RC) > A.get(GI))
                GI = RC;
            if(i == GI)
                break;
            swap(A,i,GI);
            i = GI;
        }
    }

    public static void heapifyMinHeap(int i,List<Integer> A){
        int GI = i;
        int n = A.size();
        while(i <= (n-2)/2 && (n-2) >= 0){
            int LC = 2*i+1;
            int RC = LC+1;
            if(A.get(LC) < A.get(i))
                GI = LC;
            if(RC < n && A.get(RC) < A.get(GI))
                GI = RC;
            if(i == GI)
                break;
            swap(A,i,GI);
            i = GI;
        }
    }

    public static void swap(List<Integer> A,int i, int j){
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
