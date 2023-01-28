//Given an Input Sorted Intervals,we have to insert a new interval such that all intervals are merged in
// non overlapping fashion
package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeNewIntervalAsNonoverlapping {

	public static void main(String arg[]) {
		ArrayList<Integer[]> inputList = new ArrayList<Integer[]>();
		ArrayList<Integer[]> resultantList = new ArrayList<Integer[]>();
		inputList.add(new Integer[] { 1, 3 });
		inputList.add(new Integer[] { 4, 6 });
		inputList.add(new Integer[] { 8, 10 });
		inputList.add(new Integer[] { 15, 18 });
		inputList.add(new Integer[] { 16, 91 });
		Integer[] newInterval = new Integer[] { 5, 9 };
		System.out.println("Original Intervals:");
		showArrayElements(inputList);//Display Original Array List
		System.out.println();
		for (int i = 0; i < inputList.size(); i++) {
			int i1 = inputList.get(i)[0];
			int j1 = inputList.get(i)[1];
			int x = newInterval[0];
			int y = newInterval[1];
			// Check Overlapping/Non Ovelapping condition
			if (!(y < i1 || x > j1))// This is to check Overlapping condition Or Not
			{
				x = Math.min(i1, x);
				y = Math.max(j1, y);
				newInterval = new Integer[] { x, y };
			}
			if (j1 < x || i1 > y) {
				resultantList.add(inputList.get(i));
			} 
			else if(resultantList.get(resultantList.size()-1)[0] != newInterval[0])
				resultantList.add(newInterval);
			else
				resultantList.set(i-1,newInterval);
		}
		System.out.println("Merged Intervals:");
		showArrayElements(resultantList);//Display Merged Non Overlapping ArrayList
	}

	public static void showArrayElements(ArrayList<Integer[]> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(Arrays.toString(list.get(i)) + " ");
		}
	}
}
