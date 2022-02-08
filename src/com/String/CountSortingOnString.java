package com.String;

public class CountSortingOnString {

	public static void main(String[] args) {
		char ch[]= {'d','a','c','c','b','b','e','f'};
		int count[] = new int[26];
		for(int i=0;i<ch.length;i++)
		{
			count[ch[i]-'a']++;
		}
		String result="";
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<count[i];j++)
			{
				result+=(char)('a'+i);
			}
		}
		System.out.println(result);
	}

}
