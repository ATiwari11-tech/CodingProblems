package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNums {

	public static void main(String[] args) {
		int A[] = {12,34,53,12,45,34,56};
		ArrayList<Integer> result = new ArrayList<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>(); 
		for(int num:A)
		{
			if(resultSet.contains(num))
				result.add(num);
			else
				resultSet.add(num);
		}
		System.out.println("Duplicate Elements are:"+result);
	}

}
