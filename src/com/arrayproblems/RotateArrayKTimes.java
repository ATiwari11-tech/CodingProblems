//Given an array, rotate it by k times

package com.arrayproblems;

import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String args[]) {
        int arr[] = {-20, -14, -8, -4, 1, 2, 4, 7, 11, 14, 19, 23, 27};
        System.out.println("Original Array:"+Arrays.toString(arr));
        int n = arr.length;
        int k = 6;
        reverse(arr, 0, n - 1);
        System.out.println("Fully Reversed Array"+ Arrays.toString(arr));
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(k+": times rotated array: "+Arrays.toString(arr));
    }
    public static void reverse(int arr[], int l, int h) {
        while(l<h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
}
