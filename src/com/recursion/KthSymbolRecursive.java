/*On the first row, we write a 0. Now in every subsequent row, 
 we look at the previous row and replace each occurrence of 0 with 01,
  and each occurrence of 1 with 10.

Given row A and index B, return the Bth indexed symbol in row A. (The values of B are 1-indexed.) (1 indexed).
Row 1: 0
 Row 2: 01*/

package com.recursion;

public class KthSymbolRecursive {

	public static void main(String[] args) {
		int A=3;
		int B=4;
		System.out.println(solve(A,B));
	}
	public static int solve(int A,int B)
	{
		return Integer.parseInt(fetchString(A).charAt(B-1)+"");
		
	}
	public static String fetchString(int A)
	{
		StringBuilder sb = new StringBuilder();
		if(A==0)
			return "0";
		return sb.append(fetchString(A-1)+reverse(fetchString(A-1))).toString();
	}
	public static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
				sb.setCharAt(i, '1');
			else
				sb.setCharAt(i, '0');
		}
		return sb.toString();
	}
}
