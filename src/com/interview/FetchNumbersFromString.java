package com.interview;

import java.util.ArrayList;
import java.util.List;

public class FetchNumbersFromString {
	static List<String> res = new ArrayList<String>();
	public static void main(String[] args) {
		String str="I am 1 good 22 guy 57";
		int n = str.length();
		int num=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <='9')
			{
				num = num*10+(str.charAt(i)-'0');
			}
			else
			{
				sum+=num;
				num=0;
			}
		}
		System.out.println(sum+num);
	}
}
