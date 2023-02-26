package com.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateKclosest {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,59};
        int x=25;
        int k = 3;
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int l = 0;
        int h = n-1;
        int mid = 0;
        while(l <= h) {
            mid = (l + h) / 2;
            if(arr[mid] == x)
                break;
            else if(arr[mid] < x)
                l=mid+1;
            else
                h = mid-1;
        }
        int l0 = mid-1;
        int h0=mid;
        while(k > 0 && l0 >=0 && h0 < n){
            if(Math.abs(arr[l0]-x) <= Math.abs(arr[h0]-x)){
                result.add(arr[l0]);
                k--;
                l0--;
            }
            else if(Math.abs(arr[h0]-x) < Math.abs(arr[l0]-x)){
                result.add(arr[h0]);
                k--;
                h0++;
            }
        }
        while(k > 0 && l0 >= 0){
            result.add(arr[l0]);
            k--;
        }
        while(k > 0 && h0 < n){
            result.add(arr[h0]);
            k--;
        }
        Collections.sort(result);
        System.out.println("Closest K numbers are:"+result);
    }
}
