//Given an array,which is formed by rotating a sorted array k times
//find element x in this array
package com.binarysearch;

public class FindElementInRotatedSortedArray {
    public static void main(String args[]){
        //Original Array-> -20,-14,-8,-4,1,2,4,7,11,14,19,23,27
        int arr[]={7,11,14,19,23,27,-20,-14,-8,-4,1,2,4};
        int n = arr.length;
        int target = -20;
        //Find K
        //Search space would be from 1 to N-1
        int l=1;
        int h=n-1;
        int k = findPivot(arr,l,h);
        int targetIndex = -1;
        System.out.println("This Array Is Rotated :"+(k+1)+" times");
        //Now do binary search in either both half of the array or in one half by comparing target element with the last element
        if(target > arr[n-1])
            targetIndex = doBS(arr,0,k-1,target);
        else
            targetIndex = doBS(arr,k,n-1,target);
        System.out.println("Target Element Index:"+targetIndex);
    }
    public static int doBS(int arr[],int l,int h,int target){
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static int findPivot(int arr[],int l, int h){
        int n = arr.length;
        int ans = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] > arr[n-1]){
                ans = mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }
}
