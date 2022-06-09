package com.interview;

public class Atmost0StringProblem {//Replace atmost 1 0

	public static void main(String[] args) {
		String str="01110110110";
		int n =str.length();
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int l=0,r=0;
			if(str.charAt(i)=='0')
			{
				//go to left till 1 is there and break when find 0
				for(int j=i-1;j>=0;j--)
				{
					if(str.charAt(j) == '1')
						l++;
					else
						break;
						
				}
				//go to right till 1 is there and break when find 0
				for(int j=i+1;j<n;j++)
				{
					if(str.charAt(j) == '1')
						r++;
					else
						break;
				}
				ans = Math.max(ans, l+r+1);
			}
		}
		System.out.println("Max value is:"+ans);//Maximum consecutive 1's
	}

}
