package com.interview;

public class CharacterPair {

	public static void main(String[] args) {
		//String str="alhgag";
		
		//Brute Force Approach
//		String str="adgagagfg";
//		int count=0;
//		int n=str.length();
//		for(int i=0;i<n;i++)
//		{
//			if(str.charAt(i) == 'a')
//			{
//				for(int j=i+1;j<n;j++)
//				{
//					if(str.charAt(j)=='g')
//						count++;
//				}
//			}
//		}
//		System.out.println(count);
		
		//Optimal approach
		int count =0;
		int sum=0;
		String str="adgagagfg";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='a')
				count++;
			if(str.charAt(i)=='g')
				sum += count;
		}
		System.out.println(sum);
	}

}
