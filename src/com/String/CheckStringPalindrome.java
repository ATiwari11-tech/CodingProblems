package com.String;

public class CheckStringPalindrome {
	
	public static void main(String[] args) {
		String str="abaabasdasa";
		int n=str.length();
		int s=0;
		int e=n-1;
		if(str.equals(rev(str,s,e)))
				System.out.println("Pallindrome");
		else
			System.out.println("Not a Palindrome");
	}
	public static String rev(String str,int s,int e)
	{
		StringBuilder sb = new StringBuilder(str);
		while(s<e)
		{
			sb.setCharAt(s, str.charAt(e));
			sb.setCharAt(e, str.charAt(s));
			s++;
			e--;
		}
		return sb.toString();
	}
}
