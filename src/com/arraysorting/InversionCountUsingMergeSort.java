//Given an Array A, find the number of pairs (i,j) such that i<j and Ai > Aj i.e. Inversion Count

package com.arraysorting;

import java.util.ArrayList;

public class InversionCountUsingMergeSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(6);A.add(2);A.add(9);A.add(3);A.add(5);
//		A.add(3);A.add(8);A.add(10);A.add(6);A.add(15);A.add(12);A.add(2);A.add(8);A.add(7);A.add(1);
		int n = A.size();
		int l=0,h=n-1;
		System.out.println("Count="+invCount(A,l,h));
	}
	
	public static int invCount(ArrayList<Integer> A, int s, int e)
	{
		if(s==e)
			return 0;
		int mid = (s+e)/2;
		int x = invCount(A,s,mid);
		int y = invCount(A,mid+1,e);
		int z = merge(A,s,mid,e);
		return x+y+z;
	}
	
	public static int merge(ArrayList<Integer> A, int s,int mid, int e)
	{
		int count=0;
		ArrayList<Integer> C = new ArrayList<Integer>();
		int p1 = s;
		int p2 = mid+1;
		
		while(p1<=mid && p2<=e)
		{
			if(A.get(p1) <= A.get(p2))
			{
				C.add(A.get(p1));
				p1++;
			}
			else
			{
				C.add(A.get(p2));
				p2++;
				count+=(mid-s+1)-(p1-s);
			}
		}
		while(p1<=mid)
		{
			C.add(A.get(p1));
			p1++;
		}
		while(p2<=e)
		{
			C.add(A.get(p2));
			p2++;
		}
		for(int i=0;i<C.size();i++)
			A.set(s+i, C.get(i));
		return count;
	}
}
