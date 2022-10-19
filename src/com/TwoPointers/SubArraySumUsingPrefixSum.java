//Given an array of +ve numbers. Find a sub-array whose sum==k
package com.TwoPointers;
public class SubArraySumUsingPrefixSum {
    public static void main(String []args){
        int arr[]={1,3,15,10,20,23,3};
        int n = arr.length;
        int psum[] = new int[n];//1,4,19,29,49,72,75
        psum[0]=arr[0];
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1]+arr[i];
        }
        int k=48;
//        for(int i=0;i<n;i++){
//            if(psum[i] == k)
//                break;
//        }
//        //Use two pointers for finding the difference in prefix sum array to get it equal to k
//        int l=0,h=0;
//        int diff=-1;
//        while(h<n){
//            diff = psum[h]-psum[l];
//            if(diff < k)
//                h++;
//            else if(diff > k)
//                l++;
//            if(diff == k)
//                break;
//        }
//        System.out.println("Sub Array starts from: '"+(l+1)+"' and ends at: '"+h+"'");
//        //TC->O(n)
//        //SC->O(n)//psum array creation
        //To the alternative of above we can also use binary search by fixing arr[i] since prefix sum of positive integers
        // will always be sorted
        int foundAt=-1;
        for(int i=0;i<n;i++){
            int first = psum[i];
            int find = k+first;
            foundAt = binSearch(psum,i+1,n,find);
            if(foundAt != -1) {
                System.out.println("Sub Array exists from: '" + (i + 1) + " to: '" + foundAt+"'");
                break;
            }
        }
    }
    //TC->O(nlogn)
    //SC->O(1)
    public static int binSearch(int []psum,int l,int h, int k){
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(psum[mid] == k)
                return mid;
            else if(psum[mid] > k)
                h=mid-1;
            else if(psum[mid] < k)
                l=mid+1;
        }
        return -1;
    }
}
