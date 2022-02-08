/*//Given an integer array A, find if an integer p exists in the array such that the number 
of integers greater than p in the array equals to p.*/
package com.arraysorting;

import java.util.ArrayList;
import java.util.Collections;

public class CountNobleElements1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		//nums.add(3);nums.add(1);nums.add(2);nums.add(3);
		nums.add(3);nums.add(1);nums.add(2);nums.add(4);
		Collections.sort(nums);
		int n = nums.size();
		int count=0,num=0;
		if(nums.get(n-1) == 0)
			num++;
		for(int i=n-2;i>=0;i--)
		{
			if(nums.get(i)!= nums.get(i+1))
				count = n-i-1;
			if(count == nums.get(i))
				num++;
		}
		System.out.println(num);

	}

}
