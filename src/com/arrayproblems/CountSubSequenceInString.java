/*You have given a string A having Uppercase English letters.

You have to find that how many times subsequence "AG" is there in the given string.*/
package com.arrayproblems;

public class CountSubSequenceInString {

	public static void main(String[] args) {
		String str="ABCGAG";
		System.out.println(solve(str));
	}
	public static int solve(String str)
	{
		int countA=0;
		int sumSeq=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'A')
				countA++;
			if(str.charAt(i)== 'G')
				sumSeq = sumSeq+countA;
		}
		return sumSeq%100000007;//To Prevent Overflow modulo is used
	}
}
