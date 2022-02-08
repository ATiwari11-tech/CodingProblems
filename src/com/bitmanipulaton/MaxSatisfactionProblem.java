/*Given an array of integers A of size N denoting the fruits quality. A[i] denotes the fruit quality of the ith fruit.

Shivam needs to pick 4 fruits but he needs to pick them in such a way that his satisfaction value will be maximum.

If a, b, c and d are fruit quality of the 4 fruits picked then the satisfaction value(a, b, c, d) = (a & b & c & d) where & is bitwise AND operator.

Find the maximum satisfaction value Shivam can obtain*/
package com.bitmanipulaton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSatisfactionProblem {
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		 //1, 18, 15, 16, 7, 127, 3, 83, 31, 23, 31
		//10,20,15,4,14
		//int count=0;
		ArrayList<Integer> nums = new ArrayList<Integer>();	
		ArrayList<Integer> resulList = new ArrayList<Integer>();
		/*nums.add(10);//10-01010
		nums.add(20);//20-10100
		nums.add(15);//15-01111
		nums.add(4);//4-  00100
		nums.add(14);//14-01110
*/		
		nums.add(1);nums.add(18);nums.add(15);nums.add(16);nums.add(7);nums.add(127);nums.add(3);nums.add(83);nums.add(31);nums.add(23);nums.add(31);
		
		for(int i=31;i>=0;i--)
		{
			resulList.clear();
			for(int num:nums)
			{
				if(checkBit(num,i)!=0)
				{
					//count++;
					resulList.add(num);
				}
			}
			System.out.println(resulList);
			if(resulList.size()<4)
				resulList.clear();
			if(resulList.size()>=4)
			{
				nums.clear();
				for(int k=0;k<resulList.size();k++)
				{
					nums.add(resulList.get(k));
				}
			}
		}
		int ans=nums.get(0);
		for(int i=0;i<nums.size();i++)
		{
			ans&=nums.get(i);
		}
		System.out.println(ans);
	}
	public static int checkBit(int num,int k)
	{
		return num&(1<<k);
	}

}
