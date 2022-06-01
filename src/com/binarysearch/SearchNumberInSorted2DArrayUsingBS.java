package com.binarysearch;

import java.util.ArrayList;

public class SearchNumberInSorted2DArrayUsingBS {

	public static void main(String[] args) {
		ArrayList<int[]> A = new ArrayList<int[]>();
		A.add(new int[] { 1, 2, 3, 4 });
		A.add(new int[] { 5, 6, 7, 8 });
		A.add(new int[] { 9, 10, 11, 12 });
		A.add(new int[] { 13, 14, 15, 16 });
		int pos = -1;
		// Search number 14 in 2d matrix using binary search
		// Logic-> Calculate lower bound in last column of matrix to get the row number since it's sorted
		int m = A.get(0).length;// # of columns
		int num = 14;
		int ans = 0;
		int j = m - 1;
		int l = 0, h = m - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (A.get(mid)[j] == num) {
				ans = mid;
				h = mid - 1;
			} else if (A.get(mid)[j] < num) {
				l = mid + 1;
			} else {
				ans = mid;
				h = mid - 1;
			}
		}
		int[] A1 = A.get(ans);// Got the desired row where number num is present
		l = 0;
		h = A1.length - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (A1[mid] == num) {
				pos = mid;
				break;
			} else if (A1[mid] > num)
				h = mid - 1;
			else
				l = mid + 1;
		}
		if(pos != -1)
			System.out.println("Number:"+num+" is present in index ["+ans+","+pos+"]");
		else
			System.out.println("Number:"+num+" is not present in 2d Matrix");
	}

}
