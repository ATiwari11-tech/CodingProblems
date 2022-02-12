package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateFreqMap {

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(1);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(2);
		B.add(3);
		B.add(1);
		B.add(2);
		ArrayList<Integer> C = new ArrayList<Integer>();
		int n = A.size();
		int m = B.size();
		HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> m2 = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (m1.get(A.get(i)) == null)
				m1.put(A.get(i), 1);
			else
				m1.put(A.get(i), m1.get(A.get(i)) + 1);
		}
		for (int i = 0; i < m; i++) {
			if (m2.get(B.get(i)) == null)
				m2.put(B.get(i), 1);
			else
				m2.put(B.get(i), m2.get(B.get(i)) + 1);
		}

		for (int num : m1.keySet()) {
			Integer keyfreq1 = m1.get(num);
			Integer keyfreq2 = m2.get(num);
			int keyfreq = keyfreq2 == null ? 0 : keyfreq1 <= keyfreq2 ? keyfreq1 : keyfreq2;
			for (int j = 0; j < keyfreq; j++) {
				C.add(num);
			}
		}
		/*for (int num : m2.keySet()) {
			Integer keyfreq1 = m2.get(num);
			Integer keyfreq2 = m1.get(num);
			int keyfreq = keyfreq2 == null ? 0 : keyfreq1 <= keyfreq2 ? keyfreq1 : keyfreq2;
			for (int j = 0; j < keyfreq; j++) {
				C.add(num);
			}
		}*/
		System.out.println(C);
	}

}
