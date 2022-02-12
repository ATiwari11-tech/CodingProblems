package com.String;

import java.util.ArrayList;

public class ImplementisAlphaNum {

	public static void main(String[] args) {
		ArrayList<Character> A = new ArrayList<Character>();
		A.add('S');A.add('a');A.add('1');A.add('2');A.add('F');A.add('-');
		int n = A.size();
		boolean isAlpha=false;
		for(int i=0;i<n;i++)
		{
			if(A.get(i) >= 'A' && A.get(i) <='Z')
			{
				isAlpha = true;
			}
			else if(A.get(i) >= 'a' && A.get(i) <='z')
			{
				isAlpha = true;
			}
			else if(A.get(i) >= '0' && A.get(i) <='9')
			{
				isAlpha = true;
			}
			else
			{
				isAlpha = false;
				break;
			}
		}
		System.out.println(isAlpha);
	}

}
