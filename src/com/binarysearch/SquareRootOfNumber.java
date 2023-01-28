package com.binarysearch;

public class SquareRootOfNumber {
    public static void main(String []args){
        int n=56;
        int l=1,h=n;
        int ans=0;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(mid*mid <= n){
                ans = mid;
                l=mid+1;
            }
            else if(mid*mid > n){
                h=mid-1;
            }
        }
        System.out.println("Square Root Of A Number :"+n+" is: "+ans);
    }
}
