package com.String;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String str = "Come  to me as soon as possible";
		System.out.println("Before reversing words in Sentence");
		System.out.println(str);
		int n=str.length();
		int s=0,e=n-1;
		str = rev(str,s,e);
		System.out.println("Full Reverse");
		System.out.println(str);
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i) == ' ')
			{
				e=i-1;
				str = rev(str,s,e);
				s=e+2;
			}
		}
		str = rev(str,s,n-1);
		System.out.println("After reversing words in Sentence");
		System.out.println(str);
	}
	public static String rev(String str,int s, int e)
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
