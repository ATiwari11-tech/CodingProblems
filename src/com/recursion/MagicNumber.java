package com.recursion;

public class MagicNumber {

	public static void main(String[] args) {
		int A=83557;
		//System.out.println(findMagic(A));
		findMagic(A);
	}
	public static int findMagic(int A)
	{
		System.out.println(A);
		if(A<10)
			return A;
		return findMagic(A%10+findMagic(A/10));
	}

}
