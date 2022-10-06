package com.recursion;

public class Solution {
	public static void main(String arg[]) {
		int A = 4;
		int B = 4;
		System.out.println(solve(A, B));
	}

	public static int solve(int A, int B) {

		if (A == 1 || B == 1) {
			return 0;
		}

		int pre = solve(A - 1, (B + 1) / 2);
		//System.out.println(pre);
		if (pre == 0) {
			if ((B & 1) == 1) {
				return 0;
			} else {
				return 1;
			}
		} else {
			if ((B & 1) == 1) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
