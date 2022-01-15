/*Given an integer array A containing N distinct integers, you have to find all the leaders in the array A.

An element is leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.*/

package com.arrayproblems;

import java.util.Arrays;

public class LeaderElementInArray {

	public static void main(String[] args) {
		int a[]= {16,17,4,3,5,2};
		System.out.println(Arrays.toString(solve(a)));
	}
	public static int[] solve(int a[])
	{
		int n = a.length;
		int count=1;
		int max = a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(a[i] > max)
			{
				max = a[i];
				count++;
			}
		}
		int b[] = new int[count];
		max = a[n-1];
		b[0] = max;
		int j=1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i] > max)
			{
				max = a[i];
				b[j] = max;
				j++;
			}
		}
		return b;
	}

}
