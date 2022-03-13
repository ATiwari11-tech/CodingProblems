package com.bitmanipulaton;

public class SetAParticularBit {

	public static void main(String[] args) {
		int num=25;//Original Number
		int k=2;//Set 2nd bit
		System.out.println("Original Num="+num);
		System.out.println("After Setting Bit"+setBit(num,k));
	}
	public static int setBit(int num,int k)
	{
		return num|(1<<k);
	}
}
