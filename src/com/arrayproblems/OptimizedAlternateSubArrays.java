package com.arrayproblems;

import java.util.ArrayList;

public class OptimizedAlternateSubArrays {

	public static void main(String[] args) {
		/*int a[] = {1,0,1,0,1};//1,2,3
		int B = 1;
		int k = 2 * B + 1;*/
		int a[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0 };
		int B = 2;
		int k = 2 * B + 1;//5
		int center=k/2;//2
		int count=0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int num:a)
			A.add(num);
		int n=A.size();
		int state=A.get(0);
		for(int i=0;i<n;i++)
		{
			int t=A.get(i);
			if(state != t)
			{
				count=0;
			}
			count++;
			if(count==k)
			{
				result.add(i-center);
				count--;
			}
			state=1-t;
		}
		
	System.out.println(result);
	}

}
