/*Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.*/


package com.arrayproblems;

public class HollowDiamondStarPattern {

	public static void main(String[] args) {
		int n=5;
		int num=2*n;
		//Print Upper Half
		for(int i=1;i<=num;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<n;i++)
		{
			num=num-2;
			//for(int j=num;j>=1 && num >=2;j--)
			for(int j=1;j<=num;j++)
			{
				System.out.print("*");
				if(j==(num/2))
				{
					for(int k=1;k<=i*2;k++)
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		num=num-2;
		//Print lower half
		for(int i=n-1;i>=1;i--)
		{
			num=num+2;
			for(int j=1;j<=num;j++)
			{
				System.out.print("*");
				if(j==(num/2))
				{
					for(int k=1;k<=i*2;k++)
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		num=2*n;
		for(int i=1;i<=num;i++)
		{
			System.out.print("*");
		}
	}

}
