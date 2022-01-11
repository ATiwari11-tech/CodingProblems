/*Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array 
for the i'th value in B.*/

package com.arrayproblems;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleRotationWithMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenA = sc.nextInt();//Length of Array To Be Rotated
		int lenB = sc.nextInt();//Length of Array B representing how many times to left rotate
		int []arrayA = new int[lenA];
		int []arrayB = new int[lenB];
		for(int i=0;i<lenA;i++)
		{
			arrayA[i] = sc.nextInt();//Preparing array with elements to rotate
		}
		for(int i=0;i<lenB;i++)
		{
			arrayB[i] = sc.nextInt();//Preparing array with each number telling rotation#
		}
		int result[][] = getRotatedArrayAsMatrix(arrayA,arrayB);
		for(int [] res:result)
			System.out.println(Arrays.toString(res));
		sc.close();
	}
	
	public static int[][] getRotatedArrayAsMatrix(int a[],int b[])
	{
		int lenA = a.length;
		int lenB = b.length;
		int [][]result = new int[lenB][];
		for(int i=0;i<lenB;i++)
		{
			result[i] = new int[lenA];
			rotate(a,b[i]);//Left Rotate b[i] times
			for(int j=0;j<lenA;j++)
				result[i][j] = a[j];
			if(i != lenB-1)
				restore(a,b[i]);//Restore to original array before rotation
		}
		return result;
	}
	public static int[] rotate(int []a,int k)
	{
		int n = a.length;//Length of array containing elements to rotate
		k = k%n;//To Prevent overflow
		reverse(a,0,n-1);
		reverse(a,0,n-k-1);
		reverse(a,n-k,n-1);
		return a;
	}
	public static void restore(int []a,int k)
	{
		int n = a.length;//Length of array containing elements to rotate
		k = k%n;//To prevent overflow
		reverse(a,0,n-1);
		reverse(a,0,k-1);
		reverse(a,k,n-1);
	}
	public static void reverse(int a[],int l,int h)
	{
		while(l<h)
		{
			int temp = a[l];
			a[l] = a[h];
			a[h] = temp;
			l++;
			h--;
		}
	}
}
