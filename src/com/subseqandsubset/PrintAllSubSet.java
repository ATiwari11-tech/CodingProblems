package com.subseqandsubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PrintAllSubSet {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		//A.add(1);A.add(2);A.add(3);
		A.add(16);A.add(17);A.add(7);A.add(3);A.add(6);A.add(18);A.add(5);A.add(13);A.add(14);
		//Arrays.sort(subsets(A), (a, b) -> a[0] - b[0]);

		System.out.println(subsets(A));
	}
	public static ArrayList<ArrayList<Integer>>subsets(ArrayList<Integer>A)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int n = A.size();
		int limit = (int)Math.pow(2, n);
		for(int i=0;i<limit;i++)
		{
			ArrayList<Integer> subresult = new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				if(checkBit(i,j))
				{
					subresult.add(A.get(j));
				}	
			}
			result.add(subresult);
		}
		//Collections.sort(subresult);
		Collections.sort(result, new Comparator() {    
	        

			@Override
			public int compare(Object o1, Object o2) {
				int result=0;
				ArrayList<Integer> l1 = (ArrayList<Integer>)(o1);
				ArrayList<Integer> l2 = (ArrayList<Integer>)(o2);// TODO Auto-generated method stub
				if(l1.size() != 0 && l2.size() != 0)
				{
					int customsize = l1.size() > l2.size() ? l2.size():l1.size();
					for(int i=0;i<customsize;i++)
					{
						result = l1.get(i).compareTo(l2.get(i));
					}
				}
				return result;
			}               
	});
		return result;
	}
	public static boolean checkBit(int i,int j)
	{
		if(((i)&(1<<j)) != 0)
			return true;
		return false;
	}
}
