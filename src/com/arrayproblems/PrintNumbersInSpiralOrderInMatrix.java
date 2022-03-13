package com.arrayproblems;



public class PrintNumbersInSpiralOrderInMatrix {

	public static void main(String[] args) {
		int A = 3;
		int num = 1;
		int result[][] = new int[A][A];
		int i = 0, j = 0;
		while (A > 1) {
			for (int k = 0; k < A - 1; k++) {
				result[i][j] = num++;
				j++;
			}
			for (int k = 0; k < A - 1; k++) {
				result[i][j] = num++;
				i++;
			}
			for (int k = 0; k < A - 1; k++) {
				result[i][j] = num++;
				j--;
			}
			for (int k = 0; k < A - 1; k++) {
				result[i][j] = num++;
				i--;
			}
			A = A - 2;
			i++;
			j++;
		}
		if(A==1)
			result[i][j] = num++;
		for(int l=0;l<result.length;l++)
		{
			for(int m=0;m<result[0].length;m++)
			{
				System.out.print(result[l][m]+" ");
			}
			System.out.println();
		}
	}

}
