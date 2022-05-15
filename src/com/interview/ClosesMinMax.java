package com.interview;

import java.util.ArrayList;
import java.util.List;

public class ClosesMinMax {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(6);
		input.add(2);
		input.add(3);
		input.add(1);
		input.add(7);
		input.add(6);
		input.add(1);
		int n = input.size();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int leftMax=-1;
		int leftMin=-1;
//		int idx1 = 0;
//		int idx2 = 0;
//		int len = 0;
//		int minlen = Integer.MAX_VALUE;
		for (int num : input) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		//One Approach
//		for (int i = 0; i < n; i++) {
//			if (input.get(i) == min) {
//				idx1 = i;
//			}
//			if (input.get(i) == max) {
//				idx2 = i;
//			}
//			if (idx1 != 0 && idx2 != 0) {
//				len = Math.abs(idx1 - idx2) + 1;
//				System.out.println(len);
//				minlen = Math.min(minlen, len);
//				
//			}
//		}
		//Another approach
		int minlen=0;
		int resultMin=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(input.get(i)== max)
				leftMax=i;
			if(input.get(i)== min)
				leftMin=i;
			if(leftMax != -1 && leftMin != -1)
				minlen = Math.abs(leftMax-leftMin)+1;
			minlen = Math.min(minlen, resultMin);
		}
		System.out.println(minlen);
	}

}
