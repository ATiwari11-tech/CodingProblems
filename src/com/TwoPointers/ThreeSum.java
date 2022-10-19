//Given a sorted array, find triplets(i,j,k), such that Ai+Aj+Ak==k
package com.TwoPointers;

public class ThreeSum {
    public static void main(String args[]){
        int arr[]={1,3,5,10,20,23,50};
        int k=38;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int first = arr[i];
            //Use two pointers to determine other two values
            int find = k-first;
            int l=i;
            int h=n-1;
            int sum=0;
            while(l<=h){
                sum = arr[l]+arr[h];
                if(sum > find)
                    h--;
                else if(sum < find)
                    l++;
                else if(sum == find)
                {
                    System.out.println("Triplets are:"+i+","+l+","+h);
                    break;
                }
            }
        }
        //TC->O(N2)
        //SC -> O(1)
    }
}
