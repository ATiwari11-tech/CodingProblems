package com.String;

public class StringOperations {

	public static void main(String[] args) {
		String A ="AbcaZeoBe";
		String B = A+A;//AbcaZeoBAbcaZeoB
		int n = B.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++)
		{
			if(!(B.charAt(i) >= 'A' && B.charAt(i) <= 'Z'))
				sb.append(B.charAt(i));
		}
		n=sb.length();
		for(int i=0;i<n;i++)
		{
			if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u')
				sb.replace(i, i+1, "#");
	
		}
		System.out.println(sb.toString());
	}
	
}
