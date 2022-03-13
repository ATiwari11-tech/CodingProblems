//Write a function that takes an integer and returns the number of 1 bits it has.
package com.bitmanipulaton;

public class NumberOfSetBits {

	public static void main(String[] args) {
		long a=25;
		int count=0;
		while(a!=0)
		{
			a=a&(a-1);
			count++;
		}
		System.out.println("Count="+count);
	}

}
