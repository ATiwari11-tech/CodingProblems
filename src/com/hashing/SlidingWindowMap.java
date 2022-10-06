package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SlidingWindowMap {

	public static void main(String[] args) {
		int a[]= {4,5,4,4,1,2,3,7};
		int n=a.length;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int k=3;
		for(int i=0;i<k;i++)
		{
			Integer val = map.get(a[i]);
			if(val != null)
			map.put(a[i],val+1);
			else
			map.put(a[i],1);
		}
		list.add(map.size());
		for(int i=k;i<n;i++)
		{
			Integer val = map.get(a[i]);
			if(val != null)
			map.put(a[i],val+1);
			else
			map.put(a[i],1);
			map.put(a[i-k],map.get(a[i-k])-1);
			if(map.get(a[i-k])== 0)
			map.remove(a[i-k]);
			list.add(map.size());
		}
		System.out.println(list);
	}

}
