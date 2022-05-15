package com.interview;

public class SortStringOfLowerCaseLetters {

	public static void main(String[] args) {
		String str="dabaedb";
		StringBuilder sb = new StringBuilder();
		int n=str.length();
		int count[] = new int[26];
		for(int i=0;i<n;i++)
		{
			count[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<count[i];j++)
			{
				sb.append((char)('a'+i));
			}
		}
		System.out.println(sb);
	}
}
