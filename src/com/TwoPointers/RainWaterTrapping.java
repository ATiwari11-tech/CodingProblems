//Choose two buildings such that water between them is maximized
package com.TwoPointers;

public class RainWaterTrapping {
    public static void main(String args[]){
        int arr[] = {3,8,7,4,6,5,2};//Height of individual buildings
        int n = arr.length;
        //Amount of water filled = distance between 2 buildings * min(height of 2 buildings)=> length*height
        int l=0;
        int h=n-1;
        int ans=0;
        while(l<h){
            int diff = h-l;
            int min = Math.min(arr[l],arr[h]);
            int minIndex = findIndex(arr,min);
            int amt = diff*min;
            ans = Math.max(ans,amt);
            if(minIndex == h)
                h--;
            else
                l++;
        }
        System.out.println("Maximum water trapped is:"+ans);
    }
    public static int findIndex(int arr[],int min){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == min)
                return i;
        }
        return -1;
    }
}
