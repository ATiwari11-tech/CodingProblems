package com.subseqandsubset;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str="ksdjgha";
		int n = str.length();
		char minchar1 = 'z';
		char minchar2 = 'z';
		int index=0;
		for(int i=0;i<n;i++)
		{
			char ch = str.charAt(i);
			if(ch < minchar1)
			{
				minchar1 = ch;
				index = i;
			}
		}
		for(int i=index+1;i<n;i++)
		{
			char ch = str.charAt(i);
			if(ch < minchar2)
			{
				minchar2 = ch;
			}
		}
		System.out.println(minchar1+""+minchar2);
	}

}
