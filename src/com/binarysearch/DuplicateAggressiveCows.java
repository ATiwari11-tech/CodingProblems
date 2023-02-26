package com.binarysearch;

public class DuplicateAggressiveCows {
    public static void main(String args[]){
        int arr[]={2,6,11,14,19,25,30,39,43};
        int c=4;
        int len = arr.length;
        int l = 1;
        int h = arr[len-1] - arr[0];
        int mid = 0;
        int ans = -1;
        while(l<=h){
            mid = (l+h)/2;
            if(isPossible(arr,mid,c)){
                ans = mid;
                l = mid+1;
            }
            else
                h = mid - 1;
        }
        System.out.println("Minimum Distance two Cows is : "+ans);
    }
//    public static boolean isPossible(int arr[],int m,int c){//Through iterative approach
//        int n = 1;
//        int lastPos = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i] - lastPos >= m){
//                n++;
//                lastPos = arr[i];
//            }
//        }
//        return n >= c ? true: false;
//    }

    public static boolean isPossible(int arr[],int m,int c){//Through binary search approach
        int l = 0;
        int h = arr.length-1;
        int mid = 0;
        int ans = -1;
        int find = arr[l] + m;
        for(int i=1;i<c-1;i++){
            while(l<=h){
                mid = (l+h) / 2;
                if(arr[mid] == find) {
                    ans = mid;
                    break;
                }
                else if(arr[mid] < find)
                    l = mid+1;
                else{
                    ans = mid;
                    h = mid-1;
                }
            }
            find = arr[ans] + m;
            l = ans;
            h = arr.length - 1;
        }
        return find > arr[arr.length-1] ? false: true;
    }
}
