/*You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. 
Specifically, make entire ith row and jth column zero.*/
package com.arrayproblems;

import java.util.ArrayList;

public class RowToColumnZeroMatrix {

	public static void main(String[] args) {
		/*
		 * int a[][] = { {1,2,3,4}, {5,6,7,0}, {9,2,0,4} };
		 */
		int a[][] = { { 97, 18, 55, 1, 50, 17, 16, 0, 22, 14 }, { 58, 14, 75, 54, 11, 23, 54, 95, 33, 23 },
				{ 73, 11, 2, 80, 6, 43, 67, 82, 73, 4 }, { 61, 22, 23, 68, 23, 73, 85, 91, 25, 7 },
				{ 6, 83, 22, 81, 89, 85, 56, 43, 32, 89 }, { 0, 6, 1, 69, 86, 7, 64, 5, 90, 37 },
				{ 10, 3, 11, 33, 71, 86, 6, 56, 78, 31 }, { 16, 36, 66, 90, 17, 55, 27, 26, 99, 59 },
				{ 67, 18, 65, 68, 87, 3, 28, 52, 9, 70 }, { 41, 19, 73, 5, 52, 96, 91, 10, 52, 21 }, };
		int n = a.length;
		int m = a[0].length;
		ArrayList<Integer> rowList=new ArrayList<Integer>();
		ArrayList<Integer> colList=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==0)
				{
					rowList.add(i);
					colList.add(j);
				}
			}
		}
		for(int i=0;i<rowList.size();i++)
		{
			int rowIndex = rowList.get(i);
			for(int j=0;j<m;j++)
			{
				a[rowIndex][j]=0;
			}
		}
		for(int i=0;i<colList.size();i++)
		{
			int colIndex = colList.get(i);
			for(int j=0;j<n;j++)
			{
				a[j][colIndex]=0;
			}
		}
		display(a);
	}

	public static void display(int b[][]) {
		int n = b.length;
		int m = b[0].length;
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < m; y++) {
				System.out.print(b[x][y] + " ");
			}
			System.out.println();
		}
	}
}
