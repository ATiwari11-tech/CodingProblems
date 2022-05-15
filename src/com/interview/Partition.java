package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Partition {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);arr.add(4);arr.add(-8);arr.add(7);
		System.out.println("Original Array:"+arr);
		int count=0;
		int n=arr.size();
		int psum[] = new int[n];
		int ssum[] = new int[n];
		psum[0] = arr.get(0);
		for(int i=1;i<n;i++)
		{
			psum[i] = psum[i-1]+arr.get(i);
		}
		System.out.println("Prefix Sum="+Arrays.toString(psum));
		ssum[n-1]=arr.get(n-1);
		for(int i=n-2;i>=0;i--)
		{
			ssum[i] = ssum[i+1]+arr.get(i);
		}
		System.out.println("Suffix Sum="+Arrays.toString(ssum));
		for(int i=0;i<n-1;i++)
		{
			if(psum[i] > ssum[i+1])
				count++;
		}
		System.out.println(count);
	}

}
