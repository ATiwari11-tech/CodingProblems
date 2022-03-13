package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySumIs0 {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		//[ 88, 2, 46, 66, 89, -79, 36, 72, 30, 60, 89, 23, 60, 26, -43, -14, 20, 92, -48, 45, 84, -22, 65, -57, 7 ]
		input.add(88);input.add(2);input.add(46);input.add(66);input.add(89);input.add(-79);input.add(36);input.add(72);
		input.add(30);input.add(60);input.add(89);input.add(23);input.add(60);input.add(26);input.add(-43);input.add(-14);
		input.add(20);input.add(92);input.add(-48);input.add(45);input.add(84);input.add(-22);input.add(65);
		input.add(-57);input.add(7);
		ArrayList<Integer> prefixSum = new ArrayList<Integer>();
		HashMap<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
		prefixSum.add(0,input.get(0));
		for(int i=1;i<input.size();i++)
		{
			prefixSum.add(i,input.get(i)+prefixSum.get(i-1));
		}
		for(int i=0;i<prefixSum.size();i++)
		{
			if(resultMap.get(prefixSum.get(i)) == null)
				resultMap.put(prefixSum.get(i), 1);
			else
				resultMap.put(prefixSum.get(i), resultMap.get(prefixSum.get(i))+1);
		}
		for(int num:prefixSum)
		{
			if(num==0)
				System.out.println("Zero appears"+1);
		}
		for(int i=0;i<prefixSum.size();i++)
		{
			if(resultMap.get(prefixSum.get(i)) > 1)
				System.out.println(1);
		}
	}

}
