package com.interview;



public class RotateMatrixBy90 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n=a.length;
		int m=a[0].length;
		int b[][] = new int[n][m];
		System.out.println("Oiriginal Matrix");
		printMatrix(a);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int k=j;
				int l=n-1-i;
				b[k][l] = a[i][j];
			}
		}
		System.out.println("New Matrix");
		printMatrix(b);

	}
	public static void printMatrix(int [][]res)
	{
		int n = res.length;
		int m = res[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
