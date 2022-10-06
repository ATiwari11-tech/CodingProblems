package com.bitmanipulaton;

public class Reverse32bit2 {

	public static void main(String[] args) {
		long a=3;
		long num=a;
		StringBuilder sb = new StringBuilder();
		while(num!=0)
		{
			sb.append(num%2);
			num=num/2;
		}
		int n=32-sb.length();
		for(int i=1;i<=n;i++)
		{
			sb.append(0);
		}
		System.out.println("Org:"+sb);
		int i=sb.length()-1;
		long sum=0;
		for(int j=0;j<32;j++)
		{
			sum +=(sb.charAt(i)-'0')*Math.pow(2, j);
			i--;
		}
		System.out.println("Sum="+sum);
	}

}
