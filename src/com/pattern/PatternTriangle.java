package com.pattern;

public class PatternTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int columnsEveryRow = i;
			int spacesEveryRow = n-i;
			for(int k=1;k<=spacesEveryRow;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=columnsEveryRow;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
