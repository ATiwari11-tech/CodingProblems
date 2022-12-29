//Given N tasks, K workers and time taken to complete each task. Find the minimum time in which we
// can complete all the task
//A single worker can only do continuous set of tasks
//All workers start at the same time
//A task can only be assigned to one worker
package com.binarysearch;

public class NWorkerTasksBS {
    public static void main(String args[]){
        int arr[] = {3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};//3,8,9,16,24,26,31,34,44,45,49,56,61,65,71
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
            if(isPossible(arr,mid,k)){
                ans = mid;
                h = mid-1;
            }
            else
                l = mid+1;
        }
        System.out.println("Minimum time at which entire tasks can be completed is:"+ans);
    }
    public static boolean isPossible(int arr[],int mid,int k){
        int sum=0;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > mid){
                count++;
                sum = arr[i];
            }
        }
       return count <=k ? true: false;
    }
}
