package com.bitmanipulaton;

public class ClearBit {

	public static void main(String[] args) {
		int num=25;//Original Number
		int k=3;//Clear 3rd bit
		System.out.println(clearBit(num,k));
	}
	public static int clearBit(int num,int k)
	{
		return (num & (~(1<<k)));
	}

}
