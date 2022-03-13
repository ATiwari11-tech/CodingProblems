package com.arrayproblems;

public class Sumof2DIn1DArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
		int n=a.length;
		int m=a[0].length;
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i]+=a[j][i];
			}
		}
		for(int num:b)
			System.out.println(num);
	}

}
