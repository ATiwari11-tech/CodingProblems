package com.moduloarithmetic;

public class ConcatenateTwoDigit3Integers {

	public static void main(String[] args) {
		int a=75;
		int b=45;
		int c=58;
		int first = findMinimum(a,b,c);
		int last = findMaximum(a,b,c);
		System.out.println(first);
		System.out.println(last);
		int mid=0;
		if((first == a && last == b) || (first == b && last == a))
			mid=c;
		else if((first == b && last == c) || (first == c && last == b))
			mid=a;
		else
			mid=b;
		String s = ""+first+mid+last;
		System.out.println(Integer.parseInt(s));
	}
	public static int findMinimum(int ...num)
	{
		int min=Integer.MAX_VALUE;
		for(int x:num)
		{
			min = Math.min(min, x);
		}
		return min;
	}
	public static int findMaximum(int ...num)
	{
		int max=Integer.MIN_VALUE;
		for(int x:num)
		{
			max = Math.max(max, x);
		}
		return max;
	}
}
