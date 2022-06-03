package com.arraysorting;

import java.util.ArrayList;

public class OnlyMergeOneArrayBySplittinTo2 {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(6);A.add(2);A.add(9);A.add(3);A.add(5);
//		A.add(3);A.add(8);A.add(10);A.add(6);A.add(15);A.add(12);A.add(2);A.add(18);A.add(7);A.add(1);
		System.out.println(A);
		int n = A.size();
		int l=0;
		int h=n-1;
		mergeSort(A,l,h);
		System.out.println(A);
	}
	public static void mergeSort(ArrayList<Integer> A, int l, int h)
	{
		if(l==h)
			return;
		int m=(l+h)/2;
		mergeSort(A,l,m);
		mergeSort(A,m+1,h);
		merge(A,l,m,h);
	}
	
	public static void merge(ArrayList<Integer> A,int l,int m, int h)
	{
		ArrayList<Integer> C = new ArrayList<Integer>();
		int p1=l;
		int p2=m+1;
		while(p1<=m && p2 <= h)
		{
			if(A.get(p1) < A.get(p2))
			{
				C.add(A.get(p1));
				p1++;
			}
			else
			{
				C.add(A.get(p2));
				p2++;
			}
		}
		while(p1<=m)
		{
			C.add(A.get(p1));
			p1++;
		}
		while(p2<=h)
		{
			C.add(A.get(p2));
			p2++;
		}
		//Now Replace original Array With C
		for(int i=0;i<C.size();i++)
		{
			System.out.print("C Size:="+C.size()+" ");
			System.out.println();
			System.out.print("l="+l+" ");
			A.set(l+i, C.get(i));
		}
	}
}
