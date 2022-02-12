package com.String;

public class LargestPalindromeInString {

	public static void main(String[] args) {
		String A = "aaaa";
		int n = A.length();
		int max = 0;
		String str = "";
		for (int i = 0; i < n; i++) {
			String oddLenStr = maxLen(A, i, i);
			String evenLenStr = maxLen(A, i, i + 1);
			if (max < oddLenStr.length()) {
				str = oddLenStr;
				max = str.length();
			}
			if (max < evenLenStr.length()) {
				str = evenLenStr;
				max = str.length();
			}
		}
		System.out.println(str);
	}

	public static String maxLen(String str, int s, int e) {
		String retstr = "";
		int n = str.length();
		while (s >= 0 && e < n && str.charAt(s) == str.charAt(e)) {
			s--;
			e++;
		}
		for (int i = s+1; i <= e - 1; i++) {
			retstr += str.charAt(i);
		}
		return retstr;
	}
}
