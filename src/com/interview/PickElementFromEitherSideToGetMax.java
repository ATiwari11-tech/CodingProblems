package com.interview;

import java.util.ArrayList;

public class PickElementFromEitherSideToGetMax {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(5);nums.add(-2);nums.add(3);nums.add(1);nums.add(2);
		int B=3;
		int n=nums.size();
		int sum=0;
		for(int i=0;i<B;i++)
		{
			sum+=nums.get(i);
		}
		int max=sum;
		int l=B-1;
		int h=n-1;
		while(l>=0)
		{
			sum = sum-nums.get(l)+nums.get(h);
			l--;
			h--;
			max = Math.max(max, sum);
		}
		System.out.println("Max Sum Is:"+max);
	}

}
