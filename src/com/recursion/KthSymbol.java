package com.recursion;

public class KthSymbol {

	public static void main(String[] args) {
		int A=5;
		int B=5;
		System.out.println(solve(A,B));
	}
	public static int solve(int A,int B)
	{
		int count=0;
		StringBuilder sb = new StringBuilder("0");
		for(int i=1;i<=A;i++)
		{
			int k = sb.length();
			System.out.println("k="+k);
			char ch=' ';
			for(int j=0;j<k;j++)
			{
				count++;
				if(sb.charAt(j)=='0')
					ch = (char)(sb.charAt(j)+1);
				else
					ch = (char)(sb.charAt(j)-1);
				sb.append(ch);
			}
		}
		System.out.println(count);
		return Integer.parseInt(sb.charAt(B-1)+"");
	}

}
