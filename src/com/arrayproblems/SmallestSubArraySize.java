/*Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array

and atleast one occurrence of the minimum value of the array.*/
package com.arrayproblems;

public class SmallestSubArraySize {

	public static void main(String[] args) {
		int a[]= {814,761,697,483,981};
		System.out.println("Returned Value="+solve(a));
	}
	public static int solve(int a[])
	{
		int len = Integer.MAX_VALUE;
		int trackMax=-1;
		int trackMin=-1;
		int n = a.length;
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int num:a)
		{
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		for(int i=0;i<n;i++)
		{
			if(a[i] == max)
				trackMax=i;
			if(a[i] == min)
				trackMin=i;
			if(trackMax != -1 && trackMin != -1)
			{
				len = Math.min(len, Math.abs(trackMax-trackMin)+1);
			}
		}
		return len;
	}

}
