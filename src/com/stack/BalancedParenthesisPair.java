package com.stack;

public class BalancedParenthesisPair {

	public static void main(String[] args) {
		String A="{([])}";
		boolean isPresent = false;
		isPresent=isRightParenthesisPresent(A,'{','}');
		isPresent = isRightParenthesisPresent(A,'[',']');
		isPresent = isRightParenthesisPresent(A,'(',')');
		System.out.println(isPresent);
	}
	public static boolean isRightParenthesisPresent(String A, char ch1, char ch2)
	{
		int l=0,h=A.length()-1;
		int countl=0,countr=0;
		while(l<h)
		{
			char ch11 = A.charAt(l);
			char ch12 = A.charAt(h);
			if(ch11 == ch1)
				countl++;
			l++;
			if(ch12 == ch2)
				countr++;
			h--;
		}
		return countl==countr;
	}
}
