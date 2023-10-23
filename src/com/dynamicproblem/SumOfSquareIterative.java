//Given N, tell the min count of numbers whose sum of square = N
//Example if N = 100 -> 10^2 : 1
//N = 101 -> 10^2 + 1^2 : 2
//N = 13 -> 2^2 + 3^2 : 2
//N = 6 -> 2^2 +1^2+1^2 : 3
//TC -> #Unique State * Time Require Per Unique State i.e. O(N*root(N))
//SC -> #Unique State i.e. O(N)
package com.dynamicproblem;

import java.util.Arrays;

public class SumOfSquareIterative {
    static int N=12;
    static int[]arr = new int[N+1];
    public static void main(String[] args) {
        for(int i=1;i<=N;i++){
            int ans = i;
            for(int k = 1; k<=Math.sqrt(i);k++){
                ans = Math.min(ans,1+arr[i-(k*k)]);
            }
            arr[i] = ans;
        }
        System.out.println("Answer is :"+arr[N]);
    }
}
