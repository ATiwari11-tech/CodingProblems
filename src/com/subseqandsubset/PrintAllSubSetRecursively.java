package com.subseqandsubset;

import java.util.ArrayList;

public class PrintAllSubSetRecursively {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);A.add(2);
		subsets(A);
		
	}
	public static ArrayList<ArrayList<Integer>>subsets(ArrayList<Integer>A)
	{
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(1);subList.add(2);
		res.add(subList);
		System.out.println(res);
		return null;
	}

}
