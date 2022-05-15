package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestKthElementInUnsortedArray {

	public static void main(String[] args) {//This is kth smallest element in array
		List<Integer> num = new ArrayList<Integer>();
		num.add(9);num.add(3);num.add(2);num.add(7);num.add(2);num.add(5);num.add(3);num.add(8);
		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
		int n = num.size();
		int k=3;
		for(int i=0;i<n;i++)
		{
			pq.add(num.get(i));
		}
		for(int i=k;i<n;i++)
		{
			if(num.get(i) < (int)pq.peek())
			{
				pq.poll();
				pq.add(num.get(i));
			}
		}
		System.out.println(pq.peek());
	}

}
