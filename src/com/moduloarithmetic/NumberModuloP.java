package com.moduloarithmetic;

public class NumberModuloP {

	public static void main(String[] args) {
		String num="3681231238992131263923681923123";
		int p=1000000000;
		int r=1;
		int n = num.length();
		int ans=0;
		for(int i=n-1;i>=0;i--)
		{
			ans=ans+((num.charAt(i)-'0'))*(r%p);
			r=(r*10)%p;
		}
		System.out.println(ans%p);
	}
}
