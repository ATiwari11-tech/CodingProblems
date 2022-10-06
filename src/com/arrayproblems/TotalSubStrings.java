package com.arrayproblems;

public class TotalSubStrings {
	static int total = 0;

	public static void main(String[] args) {
		//String s="I";
		 //String s="ABEC";
		 String s="ABDEFHIO";
		//String s = "ABECA";
		total = solve(s, 'a');
		total = solve(s, 'e');
		total = solve(s, 'i');
		total = solve(s, 'o');
		total = solve(s, 'u');
		total = solve(s, 'A');
		total = solve(s, 'E');
		total = solve(s, 'I');
		total = solve(s, 'O');
		total = solve(s, 'U');
		System.out.println("Total=" + total);

	}

	public static int solve(String s, char ch) {
		if (s.length() == 1 && s.charAt(0) == ch) {
			return 1;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ch) {
					total += s.substring(i + 1).length() + 1;
				}
			}
		}
		return total;
	}
}
