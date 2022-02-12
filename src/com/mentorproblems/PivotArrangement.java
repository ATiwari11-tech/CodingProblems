//For a given pivot element arrange array in such a way that all elements smaller than pivot should be in left and 
//greater than pivot should be after pivot element
package com.mentorproblems;

import java.util.Arrays;

public class PivotArrangement {

	public static void main(String[] args) {
		int a[]= {3,9,2,5,8,6,1,4};
		int n = a.length;
		int pivot=5;
		int l=0,h=n-1;//Two pointers assuming one end has all smaller elements than pivot & second end has all bigger elements than pivot
		while(l<h)
		{
			if(a[l] < pivot)//if left end has lower element than pivot, keep incrementing
				l++;
			if(a[h] > pivot)//if right end has higher element than pivot, keep decrementing
				h--;
			if(a[l] >= pivot && a[h] <= pivot)//if both above condition not satisfied then swap with each other
				swap(a,l,h);
		}
		System.out.println(Arrays.toString(a));
	}
	public static void swap(int a[],int l,int h)
	{
		int temp = a[l];
		a[l] = a[h];
		a[h] = temp;
	}

}
