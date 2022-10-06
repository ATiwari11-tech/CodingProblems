package com.binarysearch;

import java.util.ArrayList;

public class PeakElement {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
//		A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
//		A.add(2);A.add(3);
//		A.add(3);A.add(2);
//		A.add(1);A.add(10);A.add(10);
		A.add(100);A.add(10);A.add(10);
		int l = 0;
		int h = A.size()-1;
		System.out.println(solve(A,l,h));
	}
	public static int solve(ArrayList<Integer> A, int l, int h)
	{
		while(l<=h)
		{
			if(l==h)
				return A.get(l);
			else
			{
				int mid = (l+h)/2;
				if(mid !=0 && mid != A.size()-1)
					if(A.get(mid) >= A.get(mid-1) && A.get(mid) >= A.get(mid+1))
						return A.get(mid);
				if(A.get(mid) < A.get(mid+1))
					l=mid+1;
				else
					h=mid-1;
			}
			
		}
		return A.get(l);
	}
}
