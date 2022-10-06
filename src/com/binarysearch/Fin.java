package com.binarysearch;
//Find last occurence of 1 in an array of 0s and 1s only
class FindLastOccurenceOf1 {
    public static void main(String [] args) {
        int a[] = {1,1,1,1,1,1,0,0,0};
        int mid = 0;
        int ans = -1;
        int l = 0;
        int h = a.length - 1;
        while(l<=h){
            mid = (l+h)/2;
            if(a[mid] == 0){
                h=mid-1;
            }
            else if(a[mid] == 1){
                ans = mid;
                l = mid+1;
            }
        }
        System.out.println("Last Occurrence of 1 is:"+ans);
    }
}
