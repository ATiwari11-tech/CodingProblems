package com.String;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumofDistinctCharacters {

	public static void main(String[] args) {
		// String str="abcabbccd";
		String str = "qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmq";
		int n = str.length();
		int b = 119;
		int count[] = new int[26];
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < n; i++) {
			count[str.charAt(i) - 'a']++;
		}
		int max = 0;
		for (int i = 0; i < 26; i++) {
			max = Math.max(max, count[i]);
		}
		List<String> subResult = new ArrayList<String>();
		for (int i = 0; i < 26; i++) {
			if (count[i] == max) {
				subResult.add((char) ('a' + i) + "");
			}
		}
		for (int i = 0; i < n; i++) {
			if (!subResult.contains(str.charAt(i) + "") && b > 0) {
				sb.replace(i, i + 1, subResult.get(0));
				b--;
			}
		}
		int resultCount[] = new int[26];
		for (int i = 0; i < sb.length(); i++) {
			resultCount[sb.charAt(i) - 'a']++;
		}
		int cnt = 0;
		for (int i = 0; i < resultCount.length; i++) {
			if (resultCount[i] != 0)
				cnt++;
		}
		System.out.println(cnt);
	}

}
