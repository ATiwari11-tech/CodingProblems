//Given an array of positive integers find sum of sub array ORs
//Constraints = 1<=Ai<=10^9
//SO total bits requires is 2^30 - 30 bits
//Solution approach->Check number of sub arrays where each bit position has value 1 in it
package com.contest;

import java.util.ArrayList;

public class SubArrayOrSum {

	public static void main(String[] args) {
		ArrayList<Integer> ilist = new ArrayList<>();
		ilist.add(4);ilist.add(7);ilist.add(9);
		int n = ilist.size();
		int ans=0;
		for(int i=0;i<30;i++)//As 10^9 has max 30 bits
		{
			ArrayList<Integer> sublist = new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				sublist.add(checkBit(ilist.get(j),i));
			}
			ans += subor1(sublist) * (1<<i);
		}
		System.out.println(ans);
	}
	public static int checkBit(int num,int b)
	{
		if(((num) & (1<<b)) != 0)
			return 1;
		else
			return 0;
		
	}
	public static int subor1(ArrayList<Integer> res)//This gives # subarrays where subarrayr or is 1
	{
		int n = res.size();
		int total = (n*(n+1))/2;//total # subarrays based on the array size
		int subres = subor0(res);
		return total-subres; //toal 0 subor0 = subor1
	}
	public static int subor0(ArrayList<Integer> res)//This gives # subarrays where subarrayr or is 0
	{
		int n = res.size();
		int ans=0;
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(res.get(i) == 0)
				c++;
			else
			{
				ans+=(c*(c+1))/2;
				c=0;
			}
		}
		ans+=(c*(c+1))/2;
		return ans;
	}

}
