package com.moduloarithmetic;

public class OptmizedCheckNumberDivisibleBy8 {

	public static void main(String[] args) {
		String num="4";
		int n=num.length();
		int i=n-1;
		int count=n;
		if(n>3)
			count=3;
		int ans=0;
		int r=1;
		while(count>0)
		{
			ans=ans+((num.charAt(i)-'0')*r);
			r=r*10;
			i--;
			count--;
		}
		if(ans%8==0)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
