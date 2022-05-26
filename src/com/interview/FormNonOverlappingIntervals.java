//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
//and return an array of the non-overlapping intervals that cover all the intervals in the input.
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class FormNonOverlappingIntervals {

	public static void main(String[] args) {
		ArrayList<Integer[]> inputList = new ArrayList<Integer[]>();
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
//		inputList.add(new Integer[] { 1, 3 });
//		inputList.add(new Integer[] { 2, 6 });
//		inputList.add(new Integer[] { 8, 10 });
//		inputList.add(new Integer[] { 15, 18 });
	 //inputList.add(new Integer[] { 1, 4 });
	 //inputList.add(new Integer[] { 4, 5 });
	inputList.add(new Integer[] { 1, 4 });
		inputList.add(new Integer[] { 0, 2 });
		inputList.add(new Integer[] { 3, 5 });
		//inputList.add(new Integer[] { 3, 5 });
		System.out.println("Original Intervals:");
		showList(inputList);
		System.out.println();
		for (int i = 0; i < inputList.size()-1 && inputList.size() > 1; i++) {
			int i1 = inputList.get(i)[0];
			int j1 = inputList.get(i)[1];
			int x = inputList.get(i + 1)[0];
			int y = inputList.get(i + 1)[1];
			if (!(y < i1 || x > j1)) {// Overlapping condition
				x = Math.min(i1, x);
				y = Math.max(j1, y);
				inputList.set(i, new Integer[] { x, y });
				inputList.remove(i+1);
				i=-1;
			} 
//			else {
//				inputList.set(i+1,new Integer[] { inputList.get(i+1)[0], inputList.get(i+1)[1] });
//			}
		}
		System.out.println("Merged Intervals:");
		showList(inputList);
		System.out.println();
	}

	public static void showList(ArrayList<Integer[]> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(Arrays.toString(list.get(i)) + " ");
		}
	}

}
