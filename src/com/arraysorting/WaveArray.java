package com.arraysorting;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		int arr[] = {3,2,8,10,6,0,9,14,20};
		System.out.println("Initial Array="+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			if(i%2==0 && arr[i] < arr[i+1])
				swap(arr,i,i+1);
			else if(i%2 !=0 && arr[i] > arr[i+1])
				swap(arr,i,i+1);
		}
		System.out.println("Wave Array="+Arrays.toString(arr));
	}
	public static void swap(int arr[],int i, int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
