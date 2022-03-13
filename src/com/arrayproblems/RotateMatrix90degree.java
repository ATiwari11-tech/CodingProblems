package com.arrayproblems;

public class RotateMatrix90degree {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n=a.length;
		int m=a[0].length;
		System.out.println("Original Array");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//First do transpose of matrix
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<m;j++)
			{
				int t = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = t;
			}
		}
		System.out.println("Transposed Array");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//Reverse elements row wise to get 90 degree rotation
		int l=0;
		int h = m-1;
		for(int i=0;i<n;i++)
		{
			reverse(a[i],l,h);
		}
	//Print the reversed array or 90 degree rotated array
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	public static void reverse(int []a,int l,int h)
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
}
