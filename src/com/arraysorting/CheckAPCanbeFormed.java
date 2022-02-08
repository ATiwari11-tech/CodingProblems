/*Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.*/
package com.arraysorting;

import java.util.ArrayList;
import java.util.Collections;

public class CheckAPCanbeFormed {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(3);
		numList.add(4);
		numList.add(5);
		numList.add(6);
		numList.add(2);
		numList.add(1);
		Collections.sort(numList);

		int n = numList.size();
		int diff = Math.abs(numList.get(0) - numList.get(1));
		boolean isAP = true;
		for (int l = 1, h = 2; l < n && h < n; l++, h++) {
			int num = Math.abs(numList.get(l) - numList.get(h));
			if (num != diff) {
				isAP = false;
				break;
			}
		}
		if (isAP)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
