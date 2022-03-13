package com.bitmanipulaton;

public class CheckParticularBitSetOrNot {

	public static void main(String[] args) {
		int num=25;
		int k=0;
		System.out.println(checkBitSet(num,k));

	}
	public static boolean checkBitSet(int num,int k)
	{
		return (num&(1<<k))!=0;
	}
}
