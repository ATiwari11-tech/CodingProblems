//Given N, tell the min count of numbers whose sum of square = N
//Example if N = 100 -> 10^2 : 1
//N = 101 -> 10^2 + 1^2 : 2
//N = 13 -> 2^2 + 3^2 : 2
//N = 6 -> 2^2 +1^2+1^2 : 3
//TC -> #Unique State * Time Require Per Unique State i.e. O(N*root(N))
//SC -> #Unique State i.e. O(N)
package com.dynamicproblem;

import java.util.Arrays;

public class SumOfSquare {
    static int N=105;
    static int[] arr = new int[N+1];
    public static void main(String[] args) {
        Arrays.fill(arr,-1);
        System.out.println(findMinForSumOfSquares(N));
    }
    public static int findMinForSumOfSquares(int N){
        int ans = N;
        int num = (int) Math.sqrt(N);
        if(num * num == N)
            return 1;
        if(N == 0)
            return 0;
        if(arr[N] != -1)
            return arr[N];
        for(int k=1;k<=(int)Math.sqrt(N);k++){
            ans = Math.min(ans, 1+findMinForSumOfSquares(N-(k*k)));
        }
        arr[N] = ans;
        return ans;
    }
}
