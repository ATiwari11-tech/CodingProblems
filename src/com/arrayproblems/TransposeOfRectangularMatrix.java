package com.arrayproblems;

import java.util.Arrays;

public class TransposeOfRectangularMatrix {

	public static void main(String[] args) {
		
		int a[][]= {{21, 62, 16, 44, 55, 100, 16, 86, 29},
				  {62, 72, 85, 35, 14, 1, 89, 15, 73},
						  {42, 44, 30, 56, 25, 52, 61, 23, 54},
						  {5, 35, 12, 35, 55, 74, 50, 50, 80},
						  {2, 65, 65, 82, 26, 36, 66, 60, 1},
						  {18, 1, 16, 91, 42, 11, 72, 97, 35},
						  {23, 57, 9, 28, 13, 44, 40, 47, 98}};
		int n=a.length;
		int m = a[0].length;
		int b[][]=new int[m][n];
		System.out.println("Original Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j] = a[j][i];
			}
		}
		System.out.println("Tranpose:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}

}
