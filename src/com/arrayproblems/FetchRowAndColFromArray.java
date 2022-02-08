package com.arrayproblems;

public class FetchRowAndColFromArray {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6}
		};
		
		int n=a.length;
		int m=a[0].length;
		System.out.println("##################Row 1D Array#################");
		for(int i=0;i<n;i++)
		{
			checkRow(a[i]);
		}
		System.out.println("##################Column 1D Array#################");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j][i]+" ");
				
			}
			System.out.println();
		}
		
	}
	public static void checkRow(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
		System.out.println();
	}
	
}
