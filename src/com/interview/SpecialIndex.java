package com.interview;

import java.util.ArrayList;
import java.util.List;

public class SpecialIndex {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(2);input.add(1);input.add(6);input.add(4);
		List<Integer> psumeven = new ArrayList<Integer>();
		List<Integer> psumodd = new ArrayList<Integer>();
		int n = input.size();
		int leftsumeven=0;
		int leftsumodd=0;
		int count=0;
		int rightsumeven=0;
		int rightsumodd=0;
		psumeven.add(input.get(0));
		psumodd.add(0);
		for(int i=1;i<n;i++)//Prepare prefixsumeven array
		{
			if(i%2 == 0)
				psumeven.add(psumeven.get(i-1)+input.get(i));
			else
				psumeven.add(psumeven.get(i-1));
		}
		for(int i=1;i<n;i++)//Prepare prefixsumodd array
		{
			if(i%2 != 0)
				psumodd.add(psumodd.get(i-1)+input.get(i));
			else
				psumodd.add(psumodd.get(i-1));
		}
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				leftsumeven=0;
				leftsumodd=0;
			}
			else {
			leftsumeven = psumeven.get(i-1);
			leftsumodd = psumodd.get(i-1);
			}
			rightsumeven = psumeven.get(n-1)-psumeven.get(i);
			rightsumodd = psumodd.get(n-1)-psumodd.get(i);
			if((leftsumeven + rightsumodd) == (leftsumodd+rightsumeven))
				count++;
		}
		System.out.println(count);
	}
}
