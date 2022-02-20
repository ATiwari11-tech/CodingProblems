package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestContinousSeqZeroSumArray {

	public static void main(String[] args) {
		ArrayList<Integer>A = new ArrayList<Integer>();
		//A.add(1);A.add(2);A.add(-2);A.add(4);A.add(-4);
		A.add(1);A.add(-2);A.add(3);A.add(3);
		HashMap<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> prefixSum = new ArrayList<Integer>();
        prefixSum.add(0,A.get(0));
        int n = A.size();
        for(int i=1;i<n;i++)
        {
            prefixSum.add(i,A.get(i)+prefixSum.get(i-1));
        }
        int diff=0;
        int max = -1;
        int l=0,h=0;
        resultMap.put(0, -1);
        for(int i=0;i<prefixSum.size();i++)
        {
            if(resultMap.containsKey(prefixSum.get(i)))
            {
                diff = Math.abs(resultMap.get(prefixSum.get(i)) - i);
                if(diff > max)
                {
                    max = diff;
                    l=resultMap.get(prefixSum.get(i))+1;
                    h = i;
                }
            }
            else
                resultMap.put(prefixSum.get(i),i);
        }
        if(h==0)
        	System.out.println(result);
        else {
        for(int i=l;i<=h;i++)
        {
            result.add(A.get(i));
        }
        System.out.println(result);
        }

	}

}
