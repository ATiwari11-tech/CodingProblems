package com.moduloarithmetic;

public class PowerOfNumber {

	public static void main(String[] args) {
		int num=8;
		int n=3;
		int p=8;
		int ans=1;
		for(int i=0;i<n;i++)
		{
			ans = (ans%p)*(num%p);
		}
		System.out.println(ans);
	}

}
