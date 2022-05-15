package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PivotElementArrangemnet {

	public static void main(String[] args) {
		//List<Integer> num = new ArrayList<Integer>();
		//int []num= {13,5,17,9,11};
		int num[]= {3,9,2,5,8,6,1,4};
		//num.add(13);num.add(5);num.add(17);num.add(9);num.add(11);
		int pivot=5;
		int l=0,h=num.length-1;
		while(l<h)
		{
			if(num[l] < pivot)
				l++;
			if(num[h] > pivot)
				h--;
			if(num[l] >= pivot && num[h] <= pivot)
				swap(num,l,h);
		}
		System.out.println(Arrays.toString(num));
	}
	public static void swap(int[] num,int l,int h)
	{
		int temp = num[l];
		num[l] = num[h];
		num[h] = temp;
	}

}
