package com.arrayproblems;

public class Multiplicationoftwomatrices {

	public static void main(String[] args) {
		int a[][]= {
				{1,2},
				{3,4}
		};
		int b[][]= {
				{5,6},
				{7,8}
		};
		int m = a.length;
		int n=a[0].length;
		int p=b[0].length;
		int result[][]=new int[m][p];
		int sum=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<p;j++)
			{
				for(int k=0;k<n;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				result[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<p;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
