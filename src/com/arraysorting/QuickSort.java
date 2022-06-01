package com.arraysorting;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(20);A.add(23);A.add(27);A.add(18);A.add(14);A.add(10);A.add(11);A.add(8);A.add(7);A.add(15);
		int n = A.size();
		int s=0;
		int e=n-1;
		System.out.println("Array Elements Before Sorting:"+ A);
		qSort(A,s,e);
		System.out.println("Array Elements After Sorting:"+ A);
	}
	
	public static void qSort(ArrayList<Integer> A,int s,int e)
	{
		if(s>=e)
			return;
		int p = rearrange(A,s,e);
		qSort(A,s,p-1);
		qSort(A,p+1,e);
	}
	
	public static int rearrange(ArrayList<Integer> A, int s, int e)
	{
		int p1 = s+1;
		int p2=e;
		while(p1<=p2)
		{
			if(A.get(p1) <= A.get(s))
				p1++;
			else if(A.get(p2) > A.get(s))
				p2--;
			else
			{
				swap(A,p1,p2);
				p1++;
				p2--;
			}
		}
		swap(A,s,p2);
		return p2;
	}
	
	public static void swap(ArrayList<Integer> A, int p1, int p2)
	{
		int temp = A.get(p1);
		A.set(p1, A.get(p2));
		A.set(p2, temp);
	}

}
