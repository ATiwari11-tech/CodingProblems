package com.contest;

import java.util.ArrayList;

public class SubArrrayWithOr0 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);arr.add(0);arr.add(1);arr.add(0);arr.add(0);
		int n = arr.size();
		int c = 0;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(arr.get(i) == 0)
				c++;
			else
			{
				ans += (c*(c+1))/2;
				c=0;
			}
		}
		ans += (c*(c+1))/2;
		System.out.println("Sum="+ans);
	}

}
