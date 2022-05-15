package com.interview;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenIndices {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> psumeven = new ArrayList<Integer>();
		input.add(-7);input.add(1);input.add(5);input.add(2);input.add(-4);input.add(3);input.add(0);
		int n = input.size();
		psumeven.add(input.get(0));
		for(int i=1;i<n;i++)
		{
			if((i & 1) == 0)
			{
				psumeven.add(psumeven.get(i-1)+input.get(i));
			}
			else
				psumeven.add(psumeven.get(i-1));
		}
		System.out.println(psumeven);
	}

}
