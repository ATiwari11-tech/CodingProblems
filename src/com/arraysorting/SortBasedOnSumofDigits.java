/*Given an Array of Integer Elements. Sort them in increasing order of sum of digits. If sum of digits
is same for two numbers then the element with larger value should come first*/
package com.arraysorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortBasedOnSumofDigits {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(93);
		numList.add(2);
		numList.add(37);
		numList.add(639);
		numList.add(8);
		numList.add(100);
		numList.add(345);
		numList.add(49);	
		System.out.println("Before custom sorting");
		System.out.println(numList);
		System.out.println("After custom sorting");
		Collections.sort(numList,new MyComparator());
		System.out.println(numList);
	}
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num > 0)
		{
			sum += (num%10);
			num=num/10;
		}
		return sum;
	}
	
	static class MyComparator implements Comparator<Object>
	{
		public int compare(Object o1, Object o2)
		{
			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;
			Integer sumDigit1 = sumOfDigits(i1);
			Integer sumDigit2 = sumOfDigits(i2);
			if(sumDigit1 != sumDigit2)
				return sumDigit1-sumDigit2;
			else
				return i2-i1;
			/*if(sumDigit1 < sumDigit2)
				return -1;
			if(sumDigit1 > sumDigit2)
				return 1;
			if(i1>i2)
				return -1;
			if(i1<i2)
				return 1;
			return 0;*/
		}
	}
}
