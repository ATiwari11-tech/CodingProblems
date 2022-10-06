package com.binarysearch;
//Given N cows and M stalls(x-axis) at distinct locations, place all the cows s.t the min. distance b/w
//any 2 cows is maximized and N<=M
public class PossibleForAggCows {
    public static void main(String []args){
        int arr[]={2,6,11,14,19,25,30,39,43};//stall position array to tie cows
        int n=arr.length;
        int c=4;//number of cows
        int ans=-1;
        int l=2,h=41;
        while(l<=h){
            int mid=(l+h)/2;
            if(isPossible(arr,c,mid)){
                ans = mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        System.out.println("Maximized minimal distance between 2 cows is:"+ans);
    }
    public static boolean isPossible(int arr[],int c,int midVal){
        int count=1;
        int lastPosNum = arr[0];
        int lastPos=0;

        for(int i=1;i<arr.length;i++) {
            int num = lastPosNum + midVal;
            int l = lastPos;
            int h = arr.length - 1;
            int mid=0;
            int ans=-1;
            while (l <= h) {
                mid = (l + h) / 2;
                if (arr[mid] == num) {
                    ans = mid;
                    break;
                }
                else if (arr[mid] < num)
                    l = mid + 1;
                else if (arr[mid] > num) {
                    ans = mid;
                    h = mid - 1;
                }
            }
            if(ans == -1)
                break;
            else
                count++;
            lastPosNum = arr[ans];
        }
        if(count >= c)
            return true;
        else
            return false;
    }
}
