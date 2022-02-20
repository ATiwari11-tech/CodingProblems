/*The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer A representing the total number of bits in the code, print the sequence of gray code.

A gray code sequence must begin with 0.
for A = 2 the gray code sequence is:
    00 - 0
    01 - 1
    11 - 3
    10 - 2
So, return [0,1,3,2].
*/

package com.recursion;

import java.util.ArrayList;

public class GrayCode {

	public static void main(String[] args) {
		int n=3;
		ArrayList<String> returnedList = getGrayCode(n);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(String str:returnedList)
		{
			result.add(Integer.parseInt(str,2));
		}
		System.out.println(result);
	}
	public static ArrayList<String> getGrayCode(int n)
	{
		if(n==1)
		{
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("0");bres.add("1");
			return bres;
		}
		ArrayList<String> res = getGrayCode(n-1);
		ArrayList<String> mres = new ArrayList<String>();
		for(int i=0;i<res.size();i++)
		{
			String str="0"+res.get(i);
			mres.add(str);
		}
		for(int i=res.size()-1;i>=0;i--)
		{
			String str="1"+res.get(i);
			mres.add(str);
		}
		return mres;
	}

}
