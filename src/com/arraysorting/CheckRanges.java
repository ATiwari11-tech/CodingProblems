package com.arraysorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CheckRanges {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(3);nums.add(30);nums.add(34);nums.add(5);nums.add(9);
		//nums.add(2);nums.add(3);nums.add(9);nums.add(0);
		Collections.sort(nums,new MyComparator());
		String s="";
		for(int num:nums)
		{
			s+=num;
		}
		System.out.println(s);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = String.valueOf(o1);
		String s2 = String.valueOf(o2);
		return -(s1+s2).compareTo(s2+s1);
	}
}
