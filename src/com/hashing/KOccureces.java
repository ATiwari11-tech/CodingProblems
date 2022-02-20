/*Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].

He wants to select some trees to replace his broken branches.

But he wants uniformity in his selection of trees.

So he picks only those trees whose heights have frequency K.

He then sums up the heights that occur K times. (He adds the height only once to the sum and not K times).

But the sum he ended up getting was huge so he prints it modulo 10^9+7.

In case no such cluster exists, Groot becomes sad and prints -1.

Constraints:

1.   1<=N<=100000
2.   1<=K<=N
3.   0<=H[i]<=10^9
Input: Integers N and K and array of size A

Output: Sum of all numbers in the array that occur exactly K times.

Example:

Input:

N=5 ,K=2 ,A=[1 2 2 3 3]
Output:

5
Explanation:

There are 3 distinct numbers in the array which are 1,2,3.
Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.
*/
package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class KOccureces {

	public static void main(String[] args) {
		ArrayList<Integer> C = new ArrayList<Integer>();
		C.add(1);
		C.add(2);
		C.add(2);
		C.add(3);
		C.add(3);
		int B = 2;
		int A = 5;
		HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		int sum = 0;
		for (Integer num : C) {
			if (resultMap.containsKey(num))
				resultMap.put(num, resultMap.get(num) + 1);
			else
				resultMap.put(num, 1);
		}
		for (int freq : resultMap.keySet()) {
			if (resultMap.get(freq) == B) {
				sum += freq;
			}
		}
		int k = (sum) % ((int) (Math.pow(10, 9)) + 7);
		System.out.println(k);
	}

}
