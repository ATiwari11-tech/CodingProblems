package com.arrayproblems;

import java.util.ArrayList;

public class SumOfTwo2DMatrix {

	public static void main(String[] args) {
		int a[][]= {{6},{2},{3},{10},{1},{3}};
		int b[][]= {{6},{7},{3},{8},{1},{2}};
		int n=a.length;
		int m=a[0].length;
		int c[][]=new int[n][m];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
		
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
