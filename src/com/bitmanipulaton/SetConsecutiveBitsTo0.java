package com.bitmanipulaton;

public class SetConsecutiveBitsTo0 {

	public static void main(String[] args) {
		int n=26;
		int x=3;//Reset last 2 bits to 0
		System.out.println(n&(~((1<<(x))-1)));
	}

}
