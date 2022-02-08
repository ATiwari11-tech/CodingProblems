package com.moduloarithmetic;

public class CheckNumberDivisibleBy8 {

	public static void main(String[] args) {
		//String num ="1698242982348";
		String num ="169";
		int p=8;
		int n=num.length();
		long ans=0;
		//long r=1;
		for(int i=0;i<n;i++)
		{
			ans = (ans%p)+(num.charAt(i)-'0')*power(10,n-i-1,p);
		}
		if(ans%8==0)
			System.out.println(1);
		else
			System.out.println(0);
	}
	public static long power(int num,int n,int p)
	{
		long ans=1;
		for(int i=0;i<n;i++)
		{
			ans = (ans%p)*(num%p);
		}
		return ans;
	}

}
