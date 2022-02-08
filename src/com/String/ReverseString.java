package com.String;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str="here";
		System.out.println("Before Reversing");
		System.out.println(str);
		int n=str.length();
		int s=0;
		int e=n-1;
		StringBuilder sb = new StringBuilder(str);
		while(s<e)
		{
			sb.setCharAt(s, str.charAt(e));
			sb.setCharAt(e, str.charAt(s));
			s++;
			e--;
		}
		System.out.println("After Reversing");
		System.out.println(sb.toString());
	}

}
