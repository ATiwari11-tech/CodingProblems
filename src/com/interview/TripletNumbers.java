package com.interview;

import java.util.ArrayList;
import java.util.List;

public class TripletNumbers {//Get number of valid triplets

	public static void main(String[] args) {//i<j<k, a[i]<a[j]<a[k]
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(4);nums.add(1);nums.add(2);nums.add(6);nums.add(9);nums.add(7);//4,1,2,6,9,7->//126,129,127,267,269,469,467
		int n=nums.size();
		int ans=0;
		for(int i=1;i<n;i++)
		{
			int lc=0;
			int rc=0;
			for(int j=i-1;j>=0;j--)
			{
				if(nums.get(j) < nums.get(i))
					lc++;
			}
			for(int j=i+1;j<n;j++)
			{
				if(nums.get(j) > nums.get(i))
					rc++;
			}
			ans = ans+lc*rc;
		}
		System.out.println(ans);
	}

}
