package com.bitmanipulaton;

public class ToggleBitPosition {

	public static void main(String[] args) {
		int num=25;
		int k=2;
		System.out.println("Original Number="+num);
		System.out.println("Number after toggling="+toggleBit(num,k));
	}
	public static int toggleBit(int num,int k)
	{
		return num^(1<<k);
	}

}
