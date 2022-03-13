package com.contest;

import java.util.ArrayList;

public class MaximumEvenMinimumOdd {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);A.add(2);A.add(9);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int num : A)
		{
			if((num & 1) == 0)
			{
				max = Math.max(max, num);
			}
			else {
				min = Math.min(min, num);
			}
		}
		System.out.println(max-min);
	}

}
