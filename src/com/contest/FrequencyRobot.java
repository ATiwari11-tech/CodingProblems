package com.contest;

import java.util.ArrayList;

public class FrequencyRobot {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		A.add(1);
		A.add(0);
		A.add(2);
		A.add(3);
		A.add(2);
		int n = A.size();
		for (int i = 0; i < n; i++)
			result.add(1);
		System.out.println(result);
		A.add(2);// 1,0,2,3,2
		int k = 0;
		for (int i = 0; i < n; i++) {
			k = i;
			if (A.get(i) != 0) {
				for (int j = 0; j < A.get(i); j++) {
					k--;
					if (k >= 0)
						result.set(k, result.get(k) + 1);
				}
				k = i;
				for (int j = 0; j < A.get(i); j++) {
					k++;
					if (k < n) 
						result.set(k, result.get(k) + 1);
				}
			}
		}
		System.out.println(result);
	}

}
