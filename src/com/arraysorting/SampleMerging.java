package com.arraysorting;

import java.util.ArrayList;

public class SampleMerging {
	static ArrayList<Integer> l3 = new ArrayList<Integer>();
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l1.add(3);l1.add(6);l1.add(9);
		l2.add(1);l2.add(4);l2.add(18);
		System.out.println(merge(l1,l2));
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2)
	{
		int p1 = 0,p2 = 0;
		while(p1<l1.size() && p2<l2.size())
		{
			if(l1.get(p1) < l2.get(p2))
			{
				l3.add(l1.get(p1));
				p1++;
			}
			else
			{
				l3.add(l2.get(p2));
				p2++;
			}
		}
		while(p1<l1.size())
		{
			l3.add(l1.get(p1));
			p1++;
		}
		while(p2<l2.size())
		{
			l3.add(l2.get(p2));
			p2++;
		}
		return l3;
	}

}
