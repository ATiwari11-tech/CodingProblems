package com.arrayproblems;

import java.util.ArrayList;

public class MostOptimizedAlternateSubArrays {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0 };
		int B = 2;
		int k = 2 * B + 1;
		
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		
		for (int i = 0; i < a.length; i++)
			A.add(a[i]);
		
		int n = A.size();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int totalSubArray = n-k+1;
		for(int i=0;i<totalSubArray;i++)
		{
			int curr=-1;
			int flag=1;
			for(int j=i;j<i+k;j++)
			{
				if(curr==A.get(j))
				{
					flag=0;
					break;
				}
				curr=A.get(j);
			}
			if(flag==1)
			{
				resultList.add(B+i);
			}
		}
		System.out.println(resultList);
	}

}
