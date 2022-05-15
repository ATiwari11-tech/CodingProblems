package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthHighestElementInUnsortedArray {

	public static void main(String[] args) {//This is kth highest element in array
		List<Integer> num = new ArrayList<Integer>();
		num.add(9);num.add(3);num.add(2);num.add(7);num.add(2);num.add(5);num.add(3);num.add(8);
		PriorityQueue pq = new PriorityQueue();
		int n = num.size();
		int k=4;
		for(int i=0;i<k;i++)
		{
			pq.add(num.get(i));
		}
		for(int i=k;i<n;i++)
		{
			if(num.get(i) > (int)pq.peek())
			{
				pq.poll();
				pq.add(num.get(i));
			}
		}
		System.out.println(pq.peek());
	}

}
