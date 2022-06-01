//Find lower bound of a number K. Lower bound is defined as first occurence of that number such that it is >= k
package com.binarysearch;

import java.util.ArrayList;

public class LowerBoundUsingBinarySearch {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(10);A.add(11);A.add(12);A.add(12);A.add(12);A.add(13);
		//Find lower bound of k=12 i.e. first occurrence of number >= 12
		int n = A.size();
		int l=0,h=n-1;
		int k=12;
		int ans=0;
		while(l<=h)
		{
			int mid = (l+h)/2;
			if(A.get(mid) == k)
			{
				ans=mid;
				h=mid-1;
			}
			else if(A.get(mid) < k)
			{
				l=mid+1;
			}
			else
			{
				ans=mid;
				h=mid-1;
			}
		}
		System.out.println("Lower Bound of number k=12 is "+ans);
		
	}

}
