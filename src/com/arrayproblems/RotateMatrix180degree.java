package com.arrayproblems;

public class RotateMatrix180degree {

	public static void main(String[] args) {
		int A[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n=A.length;
		int l=0;
		int h=n-1;
		transpose(A);
		for(int i=0;i<n;i++)
		{
			reverse(A[i],l,h);
		}
		//Till Above 90 degree rotation
		transpose(A);
		for(int i=0;i<n;i++)
		{
			reverse(A[i],l,h);
		}
		//Now Above transpose And reverse will do 180 degree rotation
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void reverse(int a[],int l,int h)
	{
		while(l<h)
		{
			int t = a[l];
			a[l] = a[h];
			a[h] = t;
			l++;
			h--;
		}
	}
	public static void transpose(int A[][])
	{
		int n=A.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int t=A[i][j];
				A[i][j] = A[j][i];
				A[j][i]=t;
			}
		}
	}

}
