package com.pattern;

public class PatternDiamond {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=2*n-1;i++)
		{
			int colsEveryRow = i <= n ? i : 2*n-i;
			int spacesEveryRow = n-colsEveryRow;
			for(int k=1;k<=spacesEveryRow;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=colsEveryRow;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
