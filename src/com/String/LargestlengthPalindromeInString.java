package com.String;

public class LargestlengthPalindromeInString {

	public static void main(String[] args) {
		String s="abaeabf";
		int max = 0;
		for(int i=0;i<s.length();i++)
		{
			max = Math.max(max, maxLength(s,i,i));
			max = Math.max(max, maxLength(s,i,i+1));
		}
		System.out.println(max);
	}
	public static int maxLength(String s1,int s, int e)
	{
		while(s>=0 && e<s1.length() && (s1.charAt(s) == s1.charAt(e)))
		{
			s--;
			e++;
		}
		return e-s-1;
	}

}
