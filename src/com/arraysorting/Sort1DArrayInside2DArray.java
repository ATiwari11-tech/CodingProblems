package com.arraysorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort1DArrayInside2DArray {

	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] {1,4});
		list.add(new int[] {0,0});
		System.out.println("Before Sorting");
		showList(list);
		System.out.println();
		Collections.sort(list,new MyComparator());
		System.out.println("After Sorting");
		showList(list);
	}
	
	static class MyComparator implements Comparator<int[]>
	{

		@Override
		public int compare(int[] o1, int[] o2) {
			int i1 = o1[0];
			int j1 = o1[1];
			int i2 = o2[0];
			int j2 = o2[1];
			if(i1 != i2)
			{
				return i1-i2;
			}
			else if(j1 != j2)
				return j1-j2;
			else
				return 0;
		}
		
	}
	
	public static void showList(ArrayList<int[]> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(Arrays.toString(list.get(i)) + " ");
		}
	}

}
