//Given an array of +ve numbers. Find a sub-array whose sum==k
package com.TwoPointers;

public class SubArraySum {
    public static void main(String []args){
        int arr[]={1,3,15,10,20,23,3};
        int n = arr.length;
        int k=46;
        int sum=arr[0];
        int i=0,j=0;
        while(i<n && j<n){
            if(sum < k){
                j++;
                sum += arr[j];
            }
            else if(sum > k) {
                sum-=arr[i];
                i++;
            }
            if(sum == k)
                break;
        }
        System.out.println("Sub Array starts from:'"+i+"' and ends in :'"+j+"'");
    }
}
