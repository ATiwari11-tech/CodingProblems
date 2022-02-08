package com.bitmanipulaton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayWith1ElementOnly {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,4};
		List<Integer>result = new ArrayList<Integer>();
		int n=a.length;
		int count=0;
		HashMap<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			if(resultMap.get(a[i])==null)
			{
				count=1;
				resultMap.put(a[i], count);
			}
				
			else
				resultMap.put(a[i], ++count);
		}
		result = resultMap.keySet().stream().filter(mapkey->resultMap.get(mapkey).equals(1)).collect(Collectors.toList());
		System.out.println("Result="+result);
	}

}
