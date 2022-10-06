package com.arraysorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringContainingNumbers {

	public static void main(String[] args) {
		String [] stringArray = {"1","11","121","112","13","101","115"};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(stringArray));
		Arrays.sort(stringArray,new MyNewComparator());
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(stringArray));
	}
}

class MyNewComparator implements Comparator<String>
{
	public int compare(String arg0, String arg1) {
		Integer i1 = Integer.parseInt(arg0);
		Integer i2 = Integer.parseInt(arg1);
		if(i1<i2)
			return -1;
		else if(i1 > i2)
			return +1;
		else
			return 0;
		
	}
	
}
