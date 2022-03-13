package com.contest;

import java.util.ArrayList;

public class NoOfSubArrayWhereSubArrayOr0Bitis1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		arr.add(4);arr.add(7);arr.add(9);//0100,0111,1001
		int n = arr.size();
		for(int i=0;i<n;i++)
		{
			b.add(checkBit(arr.get(i),0));
		}
		System.out.println("Arrays after getting 0th bit of every integer element:"+b);
		//Calculate subarray where subarray or has 0th bit 1 as we have got b array containing value  1 and 0 only(0,1,1)->(4,7,9)
		//if checkbit above returns 1 means 0th bit is 1 else 0
		//Now we'll get the result by subtracting total number of subarrays with subarrays where subarray or is 0 
		//Total number of subarrays
		int total = (n*(n+1))/2;
		int subres =subor0(b);//Use code written in java file SubArrayWithOr0.java
		int result = total-subres;
		System.out.println("Result is ="+result);
		}
	public static int checkBit(int num,int b)//for 0th bit b is 0 similarly for 1st bit b will be 1
	{
		if(((num) & (1 << b)) !=0)
			return 1;
		else
			return 0;
	}
	public static int subor0(ArrayList<Integer> res)
	{
		int n = res.size();
		int c = 0;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(res.get(i) == 0)
				c++;
			else
			{
				ans += (c*(c+1))/2;
				c=0;
			}
		}
		ans += (c*(c+1))/2;
		return ans;
	}

}
