package com.interview;

import java.util.Arrays;
import java.util.Stack;

public class OverlappingAndSortedInterval {

	public static void main(String[] args) {
		//int a1[][]= {{1,3},{2,4},{5,7},{6,8}};
		int a1[][]= {{6,8},{1,9},{2,4},{4,7},{13,15}};
		mergeOverlappingArrays(a1);
	}
	public static void mergeOverlappingArrays(int arr[][])
	{
		int n = arr.length;
		Pair pairs[] = new Pair[n];
		for(int i=0;i<n;i++)
		{
			pairs[i] = new Pair(arr[i][0],arr[i][1]);
		}
		Arrays.sort(pairs);
		Stack<Pair> st= new Stack<>();
		st.push(pairs[0]);
		for(int i=1;i<pairs.length;i++)
		{
			Pair top = st.peek();
			if(pairs[i].start > top.end)
				st.push(pairs[i]);
			else
				top.end=Math.max(top.end, pairs[i].end);
		}
		Stack<Pair> res = new Stack<>();
		while(st.size()>0)
		{
			res.push(st.pop());
		}
		while(res.size()>0)
		{
			Pair p = res.pop();
			System.out.println(p.start+" "+p.end);
		}
	}
}

class Pair implements Comparable<Pair>
{
	int start;
	int end;
	Pair(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	@Override
	public int compareTo(Pair o) {
		if(this.start != o.start)
			return this.start-o.start;
		else
			return this.end-o.end;
	}
}
