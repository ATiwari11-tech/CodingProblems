package com.binarysearch;

import java.util.ArrayList;

//Last Occurrence can also be performed by calculating upper bound of a number
public class LastOccurenceOfNumberUsingBinarySearch {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(10);A.add(11);A.add(12);A.add(12);A.add(12);A.add(13);
		int k=12;//Calculate upper bound of number k=12 i.e. strictly greater than 12  (> 12)
		int n=A.size();
		int l=0,h=n-1;
		int ans=0;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(A.get(mid) == k)
			{
				l=mid+1;
			}
			else if(A.get(mid) > k)
			{
				ans=mid;
				l=mid+1;
			}
			else
			{
				ans=mid;
				l=mid+1;
			}
		}
		System.out.println("Last Occurence or Upper Bound of k=12 is "+ans);
	}

}
