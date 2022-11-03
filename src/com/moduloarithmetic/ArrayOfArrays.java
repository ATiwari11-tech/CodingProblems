//Given an Array of size N where values lies in the range of 0 to N-1, we have to
// determine A[A[i]] without using any extra space
package com.moduloarithmetic;

import java.util.Arrays;

public class ArrayOfArrays {
    public static void main(String args[]){
        int arr[] = {4,0,2,1,3};
        System.out.println("Input Array:"+ Arrays.toString(arr));
        //Desired Output is {3,4,2,0,1}
        //Idea here is to encode two numbers in 1 just like time(hours and mins)
        int n = arr.length;
        int first=0,second=0;
        for(int i=0;i<n;i++){
            first = arr[i];
            second = arr[first];
            arr[i] = first + (second % n) * n;//19,20,12,1,8
        }
        for(int i=0;i<n;i++){
            arr[i] /= n;
        }
        System.out.println("Final Array :"+Arrays.toString(arr));
    }
}
