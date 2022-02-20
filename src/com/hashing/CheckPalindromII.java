/*Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.*/
package com.hashing;

import java.util.HashSet;

public class CheckPalindromII {

	public static void main(String[] args) {
		String str="abbaee";
		//String str="uucgncntt";
		HashSet<Character> resSet = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(resSet.contains(str.charAt(i)))
				resSet.remove(str.charAt(i));
			else
				resSet.add(str.charAt(i));
		}
		if(resSet.size() == (str.length() & 1))
			System.out.println(1);
		else
			System.out.println(0);
	}

}
