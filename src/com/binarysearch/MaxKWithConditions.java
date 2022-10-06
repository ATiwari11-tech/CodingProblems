package com.binarysearch;
//Given an Array of +ve nos. find the max k such that {max S.A sum of length k} < = B
public class MaxKWithConditions {
    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 3, 7, 2};
        int ans=-1;
        int b = 20;
        int l = 1;
        int h = arr.length;
        while (l <= h) {
            int mid = (l + h) / 2;
            if(checkSubArraySum(arr, mid,b)) {
                ans = mid;
                l=mid+1;
            }
            else
               h=mid-1;
        }
        System.out.println("Maximum Value of K for which subarray sum is <= "+b+" is "+ans);
    }
    public static boolean checkSubArraySum(int arr[],int k,int b){
        int sum=0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        for(int i=k;i<arr.length;i++){
            sum += (arr[i] - arr[i-k]);
        }
        return sum <= b ? true:false;
    }
}
