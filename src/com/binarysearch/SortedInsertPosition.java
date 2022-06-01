//Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
//If not, return the index where it would be if it were inserted in order.

//NOTE: You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.

package com.binarysearch;

import java.util.ArrayList;

public class SortedInsertPosition {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int B = 6;
		list.add(1);list.add(4);list.add(5);list.add(7);list.add(9);//1,4,5,7,9
		System.out.println(searchInsert(list,B));
	}
	public static int searchInsert(ArrayList<Integer> list, int B)
	{
		int l=0;
		int h=list.size()-1;
		int val=0;
		while(l<=h)
		{
			int mid = (l+h)/2;
			if(list.get(mid) == B)
				return mid;
			//1,4,5,7,9
			if(list.get(mid) < B)
			{
				l = mid+1;
				val = mid+1;
			}
			else {
				h = mid-1;
				val = mid;
			}
		}
		return val;
	}
}
