package com.interview;

import java.util.Arrays;

//Given an array of Numbers, arrange them in such a way that, negative numbers should come first followed by
//positive numbers
public class NegativeAndPositiveNumbers {
    public static void main(String []args){
        int arr[] ={9,5,-4,8,-7,-6,22,12};
        //int[] arr = { -5, 10, -3, 12, -9, 5, 90, 0, 1 };
        int n=arr.length;
        System.out.println("Before Arranging:"+ Arrays.toString(arr));
        int l=0;
        int h=n-1;
        while(l < h){
            if(arr[l] >= 0 && arr[h] < 0) {
                    swap(arr, l, h);
                    l++;
                    h--;
                }
            else if(arr[l] < 0)
                l++;
            else if(arr[h] >= 0)
                h--;
            }

        System.out.println("After Arranging:"+ Arrays.toString(arr));
    }
    public static void swap(int arr[], int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
