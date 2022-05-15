package com.interview;

public class ReverseTheSentence {

	public static void main(String[] args) {
		String str="Here Am I";//I Am Here
		int n = str.length();
		int s=0;
		int e=n;
		str=reverse(str,0,n-1);//Reverse Entire String first
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i) == ' ')
			{
				e=i-1;
				str= reverse(str,s,e);
				s=e+2;
			}
		}
		str=reverse(str,s,n-1);//reverse last word
		System.out.println("Resultant sentence is "+str);
	}
	public static String reverse(String str,int s, int e)
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
