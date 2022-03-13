package com.contest;

import java.util.ArrayList;

public class AlternatingSubarray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		//A.add(0);A.add(1);A.add(0);A.add(1);A.add(0);A.add(1);//010101
		A.add(1);A.add(0);A.add(1);A.add(0);A.add(1);//10101
		//A.add(1);A.add(0);A.add(1);A.add(0);A.add(1);//10101 10101
		//A.add(0);A.add(0);A.add(0);A.add(1);A.add(1);A.add(0);A.add(1);//0001101
		int B=1;
		int count=0;
		int len = 2*B+1;
		int center = len/2;
		int n = A.size();
		int state = A.get(0);
		for(int i=0;i<n;i++)
		{
			int t = A.get(i);
			if(state != t)
			{
				count=0;
			}
			count++;
			if(count==len)
			{
				result.add(i-center);
				count--;
			}
			state = 1-t;
		}
		System.out.println(result);
	}

}
