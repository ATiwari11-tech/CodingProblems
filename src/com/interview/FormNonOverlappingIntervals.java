//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
//and return an array of the non-overlapping intervals that cover all the intervals in the input.
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FormNonOverlappingIntervals {

	public static void main(String[] args) {
		ArrayList<Integer[]> inputList = new ArrayList<Integer[]>();
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
//		 inputList.add(new Integer[] { 1, 3 });
//		 inputList.add(new Integer[] { 2, 6 });
//		 inputList.add(new Integer[] { 8, 10 });
//		 inputList.add(new Integer[] { 15, 18 });  
	
//		 inputList.add(new Integer[] { 1, 4 });
//		 inputList.add(new Integer[] { 4, 5 });
		
//		inputList.add(new Integer[] { 1, 4 });
//		inputList.add(new Integer[] { 0, 2 });
//		inputList.add(new Integer[] { 3, 5 });
		

//		inputList.add(new Integer[] {1,4});
//		inputList.add(new Integer[] {5,6});
//		inputList.add(new Integer[] {4,5});
		
		inputList.add(new Integer[] {0,0});

		inputList.add(new Integer[] {1,4});
		System.out.println("Original Intervals In Sorted Order:");
		//Sort the input list in ascending order
		Collections.sort(inputList,new MyComparator());
		showList(inputList);
		System.out.println();
		int i1 = inputList.get(0)[0];
		int j1 = inputList.get(0)[1];
		for(int i=1;i<inputList.size();i++)
		{
			int x = inputList.get(i)[0];
			int y = inputList.get(i)[1];
			if(!(y < i1 || x > j1))//Overlapping condition
			{
				x = Math.min(x, i1);
				y = Math.max(y, j1);
			}
			else if(result.isEmpty())
				result.add(new Integer[] {i1,j1});
			else
				result.add(new Integer[] {x,y});
			if(result.isEmpty())
				result.add(new Integer[] {x,y});
			else if(result.get(result.size()-1)[0] < x)
				result.add(new Integer[] {x,y});
			else
				result.set(result.size()-1,new Integer[] {x,y});
			i1 = x;j1=y;
		}
		System.out.println("Merged Intervals:");
		showList(result);
		System.out.println();
	}

	public static void showList(ArrayList<Integer[]> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(Arrays.toString(list.get(i)) + " ");
		}
	}
	
	public static class MyComparator implements Comparator<Integer[]>
	{
		@Override
		public int compare(Integer[] o1, Integer[] o2) {
			int i1 = o1[0];
			int j1 = o1[1];
			int i2 = o2[0];
			int j2 = o2[1];
			if(i1 != i2)
				return i1-i2;
			else if(j1 != j2)
				return j1-j2;
			else
				return 0;
		}
	}
}
