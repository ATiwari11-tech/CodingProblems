package com.contest;

import java.util.ArrayList;

public class LittlePony {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
//		A.add(2);A.add(4);A.add(3);A.add(1);A.add(5);
//		int B=3;
		A.add(1);A.add(4);A.add(2);
		int B=3;
		System.out.println(solve(A,B));
	}
	public static int solve(ArrayList<Integer> A, int B)
	{
		int count=0;
		if(!A.contains(B))
			return -1;
		for(int num:A)
		{
			if(num > B)
				count++;
		}
		return count;
	}

}
