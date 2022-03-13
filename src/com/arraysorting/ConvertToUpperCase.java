package com.arraysorting;

public class ConvertToUpperCase {

	public static void main(String[] args) {
	String str= "cAt";
	for(int i=0;i<str.length();i+=2)
	{
		str=str.charAt(i)+"".toUpperCase();	
	}
		System.out.println(str);
	}

}
