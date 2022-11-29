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
		boolean isResultListEmpty = true;
//		 inputList.add(new Integer[] { 1, 3 });
//		 inputList.add(new Integer[] { 2, 6 });
//		 inputList.add(new Integer[] { 8, 10 });
//		 inputList.add(new Integer[] { 15, 18 });

//		inputList.add(new Integer[] { 1, 3 });
//		inputList.add(new Integer[] { 2, 6 });
//		inputList.add(new Integer[] { 8, 10 });
//		inputList.add(new Integer[] { 8, 18 });

		inputList.add(new Integer[] { 1, 3 });
		inputList.add(new Integer[] { 2, 6 });
		inputList.add(new Integer[] { 8, 10 });
		inputList.add(new Integer[] { 9, 10 });

//		 inputList.add(new Integer[] { 1, 4 });
//		 inputList.add(new Integer[] { 4, 5 });

//		inputList.add(new Integer[] { 1, 4 });
//		inputList.add(new Integer[] { 0, 2 });
//		inputList.add(new Integer[] { 3, 5 });


//		inputList.add(new Integer[] {1,4});
//		inputList.add(new Integer[] {5,6});
//		inputList.add(new Integer[] {4,5});

//		inputList.add(new Integer[]{0, 1});
//		inputList.add(new Integer[]{1, 4});
//		inputList.add(new Integer[]{8, 9});
//		inputList.add(new Integer[]{6, 9});
		System.out.println("Before Sorting");
		showList(inputList);
		Collections.sort(inputList, new MyComparator());
		System.out.println("After Sorting");
		showList(inputList);
		int i1 = inputList.get(0)[0];
		int j1 = inputList.get(0)[1];
		for(int i=1;i<inputList.size();i++) {
			int x = inputList.get(i)[0];
			int y = inputList.get(i)[1];
			if (!(y < i1 || x > j1))//Non overlapping condition
			{
				x = Math.min(x, i1);
				y = Math.max(y, j1);
			}
			if(isResultListEmpty) {
				result.add(new Integer[]{x, y});
				isResultListEmpty = false;
			}
			else if(result.get(result.size()-1)[0] != x && result.get(result.size()-1)[1] != y)
				result.add(new Integer[]{x,y});
			else if(result.get(result.size()-1)[0] == x){
				result.set(result.size()-1,new Integer[]{x,Math.max(y,result.get(result.size()-1)[1])});
			}

			i1=x;j1=y;
		}
		System.out.println("Merged Interval:");
		showList(result);
	}
	public static class MyComparator implements Comparator<Integer[]>
	{
		@Override
		public int compare(Integer[] o1, Integer[] o2) {
			Integer f1 = o1[0];
			Integer f2 = o1[1];
			Integer f11 = o2[0];
			Integer f12 = o2[1];
			if(f1 != f11)
				return f1-f11;
			else if(f2 != f12)
				return f2-f12;
			else
				return 0;
		}
	}
	public static void showList(ArrayList<Integer[]> list){
		for(int i=0;i<list.size();i++)
			System.out.println(Arrays.toString(list.get(i))+ " ");
	}

}