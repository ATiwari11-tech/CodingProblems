/*Calculate special index i.e. after removing any index if sum of all even indices are equal to 
sum of all odd indices then it's called special index
*/
package com.arrayproblems;

public class SpecialIndexProblem {

	public static void main(String[] args) {
		// int []a = {3,2,-1,6,2,8,3,-4,10};
		int[] a = { 4, 3, 2, 7, 6, -2 };
		System.out.println("Total special indexes are=" + checkSpecialIndex(a));
	}

	public static int checkSpecialIndex(int a[]) {
		int count = 0;
		int evenSumleft = 0, oddSumleft = 0, evenSumright = 0, oddSumright = 0;
		int psumeven[] = new int[a.length];
		int psumodd[] = new int[a.length];
		psumeven[0] = a[0];
		psumodd[0] = 0;
		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 0)
				psumeven[i] = psumeven[i - 1] + a[i];
			else
				psumeven[i] = psumeven[i - 1];
		}
		for (int i = 1; i < a.length; i++) {
			if (i % 2 != 0)
				psumodd[i] = psumodd[i - 1] + a[i];
			else
				psumodd[i] = psumodd[i - 1];
		}
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				evenSumleft = 0;
				oddSumleft = 0;
				evenSumright = psumeven[a.length - 1] - psumeven[i];
				oddSumright = psumodd[a.length - 1] - psumodd[i];
			} else {
				evenSumleft = psumeven[i - 1];
				oddSumleft = psumodd[i - 1];
				evenSumright = psumeven[a.length - 1] - psumeven[i];
				oddSumright = psumodd[a.length - 1] - psumodd[i];
			}

			if (evenSumleft + oddSumright == oddSumleft + evenSumright)
				count++;
		}
		return count;
	}
}
