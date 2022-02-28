package com.stack;

public class BalancedParenthesis {
	static int top=0;
	public static void main(String[] args) {
		String A="))((()(())";
		if(A.startsWith(")"))
				System.out.println("0 already");

		else {
		for(int i=0;i<A.length();i++)
		{
			if(A.charAt(i)=='(')
				top++;
			if(A.charAt(i)==')')
				top--;
		}
		if(top==0)
			System.out.println(1);
		else
			System.out.println(1);
		}
	}
}