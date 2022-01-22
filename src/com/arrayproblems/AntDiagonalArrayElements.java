package com.arrayproblems;

public class AntDiagonalArrayElements {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n=a.length;
		int x=0;
		int y=0;
		int len = 2*n-1;
		int result[][]=new int[len][n];
		int i=0;
		int j=0;
		for(int k=0;k<n;k++)
		{
			i=0;
			j=k;
			while(i<n && j>=0)
			{
				result[x][y] = a[i][j];
				i++;
				j--;
				y++;
			}
			x++;
			y=0;
		}
		for(int k=1;k<n;k++)
		{
			i=k;
			j=n-1;
			while(i<n && j>=0)
			{
				result[x][y] = a[i][j];
				i++;
				j--;
				y++;
			}
			x++;
			y=0;
		}
		for(int l=0;l<len;l++)
		{
			for(int m=0;m<n;m++)
			{
				System.out.print(result[l][m]+" ");
			}
			System.out.println();
		}
	}

}
