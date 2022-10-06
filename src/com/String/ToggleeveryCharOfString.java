package com.String;

public class ToggleeveryCharOfString {

	public static void main(String[] args) {
		String str="aBcDeF";
		//Brute Force
		/*for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = str.replace(str.charAt(i),(char) (str.charAt(i)-('a'-'A')));
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				str = str.replace(str.charAt(i),(char) (str.charAt(i)+('a'-'A')));
			}
		}
		System.out.println(str);*/
		//Optimal Way
		
		for(int i=0;i<str.length();i++)
		{
			str = str.replace(str.charAt(i), (char)(str.charAt(i)^(1<<5)));
		}
		System.out.println(str);
	}

}
