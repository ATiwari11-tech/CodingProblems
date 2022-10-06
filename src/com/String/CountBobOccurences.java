package com.String;

public class CountBobOccurences {

	public static void main(String[] args) {
		String str = "bobbob";
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'b' && i < n - 2) {
				if (str.substring(i, i + 3).equals("bob")) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
