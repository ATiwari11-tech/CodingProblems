//Given N tasks, K workers and time taken to complete each task. Find the minimum time in which we
// can complete all the task
//A single worker can only do continuous set of tasks
//All workers start at the same time
//A task can only be assigned to one worker
package com.binarysearch;

import java.util.Arrays;

public class OptimizedNWorkerTasksBS {
    public static void main(String args[]){
        int arr[] = {3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};//3,8,9,16,24,26,31,34,44,45,49,56,61,65,71
        int parr[] = new int[arr.length];
        parr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            parr[i] = arr[i]+parr[i-1];
        }
        int n = arr.length;
        int ans = -1;
        int k=3;//Number of workers
        int max=-1;
        int sum=0;
        for(int num:arr){
            max = Math.max(max,num);
            sum += num;
        }
        int l = max;
        int h = sum;
        while(l<=h){
            int mid = (l+h)/2;
            if(isPossible(parr,mid,k)){
                ans = mid;
                h = mid-1;
            }
            else
                l = mid+1;
        }
        System.out.println("Minimum time at which entire tasks can be completed is:"+ans);
    }
    public static boolean isPossible(int arr[],int mid,int k) {
        int count = 0;
        int ans = -1;
        int find = mid;
        int l=0;
        int h = arr.length-1;
        int mid1= 0 ;
        for(int i=1;i<k;i++) {
            while (l <= h) {
                mid1 = (l + h) / 2;
                if (arr[mid1] == find) {
                    ans = mid1;
                    break;
                }
                else if(arr[mid1] < find) {
                    ans = mid1;
                    l = mid1 + 1;
                }
                else if (arr[mid1] > find)
                    h = mid1 - 1;
            }
            find = mid + arr[ans];
            l = ans;
            h = arr.length-1;
        }
        return find < arr[arr.length-1] ? false : true;
    }

}
