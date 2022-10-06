package com.binarysearch;

import java.util.ArrayList;

public class FindFrequencyOfaNumberUsingBinarySearch {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(10);
		A.add(11);
		A.add(12);
		A.add(12);
		A.add(13);
		int n = A.size();
		int l = 0;
		int h = n - 1;
		int num = 12;
		//Calculate Lower Bound and Upper Bound then subtract upper bound with lower bound will give me the frequency of occurrences
		int i = lowerBound(A,l,h,num);
		int j = upperBound(A,l,h,num);
		System.out.println("Frequency of number 4 is "+(j-i));
	}
	
	public static int lowerBound(ArrayList<Integer> A, int l, int h,int num)
	{
		int ans=0;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(A.get(mid) == num)
			{
				ans=mid;
				h=mid-1;
			}
			else if(A.get(mid) < num)
			{
				l=mid+1;
			}
			else
			{
				ans=mid;
				h=mid-1;
			}
		}
		return ans;
	}
	public static int upperBound(ArrayList<Integer> A, int l, int h,int num)
	{
		int ans=0;
		while(l<=h)
		{
			int mid = (l+h)/2;
			if(A.get(mid) == num)
			{
				l=mid+1;
			}
			else if(A.get(mid) < num)
			{
				l=mid+1;
			}
			else
			{
				ans=mid;
				l=mid+1;
			}
		}
		return ans;
	}
}
