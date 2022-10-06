package com.contest;

import java.util.ArrayList;



public class LargestOR {

	public static void main(String[] args) {
		ArrayList<Integer> ilist = new ArrayList<>();
		
		int count=0;
		//ilist.add(1);ilist.add(2);ilist.add(3);ilist.add(2);
		ilist.add(1);ilist.add(2);ilist.add(3);ilist.add(4);ilist.add(5);ilist.add(6);
		int n = ilist.size();
		//Fetch value of 1st group
		int num = ilist.get(0) | ilist.get(1);
		int sum=0;
		for(int i=2;i<n;i++)
		{
			sum+=ilist.get(i);
		}
		int num1 = num | sum;
		//Fetch value of 2nd group
		sum=0;
	
		for(int i=1;i<n-1;i++)
		{
			sum+=ilist.get(i);
		}
		num = ilist.get(0) | sum;
		int num2 = num | ilist.get(n-1);
		//Fetch value of 3rd group
		sum=0;
		for(int i=0;i<n-2;i++)
		{
			sum+=ilist.get(i);
		}
		num = sum | ilist.get(n-2);
		int num3 = num | ilist.get(n-1);
		/*System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);*/
		int inum = Math.max(num1, num2);
		inum = Math.max(inum,num3);
		System.out.println(inum);
		//Count frequency
		if(num1 == inum)
			count++;
		if(num2==inum)
			count++;
		if(num3==inum)
			count++;
		System.out.println("Freq="+count);
	}

}
