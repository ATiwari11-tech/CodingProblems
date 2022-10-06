package com.interview;

import java.util.ArrayList;
import java.util.List;

public class EquilibriumIndex {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(-7);input.add(1);input.add(5);input.add(2);input.add(-4);input.add(3);input.add(0);
		int n = input.size();
		List<Integer> psum = new ArrayList<Integer>();
		psum.add(input.get(0));
		int lsum=0,rsum=0;
		int count=0;
		for(int i=1;i<n;i++)
		{
			psum.add(psum.get(i-1)+input.get(i));
		}
		for(int i=0;i<psum.size();i++)
		{
			lsum = i==0?0:psum.get(i-1);
			rsum = psum.get(n-1)-psum.get(i);
			if(lsum == rsum)
				count++;
		}
		System.out.println(count);
	}

}
