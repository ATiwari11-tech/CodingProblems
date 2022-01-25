/*Given an array of integers A, of size N.
Return the maximum size subarray of A having only non-negative elements. 
If there are more than one such subarrays, return the one having the earliest starting index in A.*/
package com.arrayproblems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimizedMaximumSumArrayWithNegativeElements {

	public static void main(String[] args) {
		Integer a[]= {5,6,51,52,55,56,84,-1,7,-2,9,10,12,13,-11,14,21,25,29,31,89,97,101,102};
		//Integer a[]= {1,2,3,4,5,6};
		List<Integer> listElements = new ArrayList<Integer>();
		listElements = Arrays.asList(a);
		int n=a.length;
		int l=0,r=0;
		ArrayList<Integer>result=new ArrayList<Integer>();
		boolean isNegativePresent=false;
		for(int i=0;i<n;i++)
		{
			l=0;
			r=0;
			if(listElements.get(i) < 0)
			{
				isNegativePresent = true;
				//Count Elements in left subarray
				for(int j=i-1;j>=0;j--)
				{
					if(listElements.get(j) >= 0)
						l++;
					else
						break;
				}
				//Count Elements in right subarray
				for(int j=i+1;j<n;j++)
				{
					if(listElements.get(j) >= 0)
						r++;
					else
						break;
				}
				if(l > r && l > result.size())
				{
					result.clear();
					for(int k=i-l;k<=i-1;k++)
					{
						result.add(listElements.get(k));
					}
				}
				else if(r > l && r > result.size())
				{
					result.clear();
					for(int k=i+1;k<=i+r;k++)
					{
						result.add(listElements.get(k));
					}
				}
			}
		}
		if(!isNegativePresent)
			System.out.println(listElements);
		else
			System.out.println(result);
	}

}
