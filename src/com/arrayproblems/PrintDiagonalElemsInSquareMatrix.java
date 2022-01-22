package com.arrayproblems;

public class PrintDiagonalElemsInSquareMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		int n=a.length;
		int m=a[0].length;
		int j=m-1;
	//Print First Diagonal
		System.out.println("First Diagonal elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i][i]);
		}
	//Print second diagonal elements
		System.out.println("Second Diagonal elements are:");
		for(int i=0;i<n;i++)
		{
			while(i<n && j>=0)
			{
				System.out.println(a[i][j]);
				i++;
				j--;
			}
		}
	}

}
