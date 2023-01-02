package com.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindKClosestIntegers {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,59};
        int x=25;
        int k = 3;
        List<Integer> resultList = new ArrayList<>();
        int n = arr.length;
        int l = 0;
        int ans=-1;
        int h = n-1;
        int mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(arr[mid] == x)
                break;
            else if(arr[mid] < x)
                l = mid+1;
            else
                h = mid-1;
        }
        int l0 = mid-1;
        int h0 = mid;
        while(k > 0 && l0 >= 0 && h0 < n){
            if(Math.abs(arr[l0]-x) <= Math.abs(arr[h0]-x)){
                resultList.add(arr[l0]);
                l0--;
                k--;
            }
            else if(Math.abs(arr[h0]-x) < Math.abs(arr[l0]-x)) {
                resultList.add(arr[h0]);
                h0++;
                k--;
            }
        }
        while(k > 0 && l0 >= 0){
            resultList.add(arr[l0]);
            l0--;
            k--;
        }
        while(k > 0 && h0 < n){
            resultList.add(arr[h0]);
            h0++;
            k--;
        }
        System.out.println("3 smallest sorted integers to 45 before sorting are:"+ resultList);
        Collections.sort(resultList);
        System.out.println("3 smallest sorted integers to 45 are:"+ resultList);
    }
}
