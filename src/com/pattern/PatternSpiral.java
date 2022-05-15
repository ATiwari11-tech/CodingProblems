package com.pattern;

public class PatternSpiral {

	public static void main(String[] args) {
		int n = 7;
		int m=4;
		int arr[][] = new int[n][n];
		int i = 0, j = 0;
		while (n > 1) {
			for (int k = 1; k < n; k++) {
				arr[i][j] = m;
				j++;
				//printArray(arr);
			}
			for (int k = 1; k < n; k++) {
				arr[i][j] = m;
				i++;
				//printArray(arr);
			}
			for (int k = 1; k < n; k++) {
				arr[i][j] = m;
				j--;
				//printArray(arr);
			}
			for (int k = 1; k < n; k++) {
				arr[i][j] = m;
				i--;
				//printArray(arr);
			}
			n-=2;
			m--;
			i++;
			j++;
		}
		if(n==1)
		{
			arr[i][j]=1;
		}
		printArray(arr);
	}
	public static void printArray(int arr[][])
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
