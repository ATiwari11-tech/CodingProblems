/*//Given an integer array A, find if an integer p exists in the array such that the number 
of integers greater than p in the array equals to p.*/
package com.arraysorting;

import java.util.ArrayList;
import java.util.Collections;

public class FindNobleElements {

	public static void main(String[] args) {
		/*ArrayList<Integer> nums= new ArrayList<Integer>();
		nums.add(3);nums.add(1);nums.add(2);nums.add(3);
		Collections.sort(nums);
		int n = nums.size();
		int count=0;
		boolean isNoblePresent=false;
		if(nums.get(n-1) == 0)
			isNoblePresent = true;
		for(int i=n-2;i>=0;i--)
		{
			if(nums.get(i)!= nums.get(i+1))
				count=n-i-1;
			if(count == nums.get(i))
			{
				isNoblePresent = true;
				break;
			}
		}
		if(isNoblePresent)
			System.out.println(1);
		else
		System.out.println(-1);
*/
		ArrayList<Integer> A= new ArrayList<Integer>();
		//A.add(3);A.add(1);A.add(4);A.add(4);
		A.add(5);A.add(6);A.add(2);
		 Collections.sort(A);
	        int n = A.size();
	        int count=0;
	        boolean isPresent=false;
	        if(A.get(n-1) == 0)
	        System.out.println(1);
	        for(int i=n-2;i>=0;i--)
	        {
	            if(A.get(i) != A.get(i+1))
	                count = n-i-1;
	            if(count == A.get(i))
	            {
	                isPresent = true;
	                break;
	            }
	        }
	        if(isPresent)
	            System.out.println(1);
	        System.out.println(-1);
	    }
	

}
