package com.String;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumofDistinctCharacters2 {

	public static void main(String[] args) {
		//String str = "abcabbccd";
		String str ="qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmq";
		int n = str.length();
		int distinct=0;
		int b = 119;
		//int b = 3;
		int count[] = new int[26];
		for (int i = 0; i < n; i++) {
			count[str.charAt(i) - 'a']++;
		}
		while (b > 0) {
			int val = getMinimumFreqVal(count);
			int index = getMinimumFeqValIndex(count, val);
			count[index] = 0;
			b = b - val;
		}
		for(int num:count)
		{
			if(num != 0)
				distinct++;
		}
		System.out.println(distinct);
	}

	public static int getMinimumFreqVal(int count[]) {
		int min = Integer.MAX_VALUE;
		for (int num : count) {
			if (num != 0) {
				min = Math.min(min, num);
			}
		}
		return min;
	}

	public static int getMinimumFeqValIndex(int count[], int val) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == val)
				return i;
		}
		return 0;
	}
}
