package com.arrayproblems;

public class Subtractionoftwomatrices {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][]= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		int n=a.length;
		int m=a[0].length;
		int c[][]=new int[n][m];
		System.out.println("array1:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array2:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j] = a[i][j]-b[i][j];
		}
		System.out.println("Subtracted arrays are:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
