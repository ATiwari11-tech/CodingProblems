//Given N Stairs you want to find the number of ways of reaching Nth stair
//At a time you can climb one stair or two stairs but not more than 2
//For N = 1 , number of ways are 1
//Fod N = 2 , number of ways -> (1,1) or (2) so ways = 2
//For N = 3 , number of ways -> (1,1,1) or (1,2) or (2,1) so ways = 3
//For N = 4 , number of ways -> (1,1,1,1) or (1,2,1) or (1,1,2) or (2,1,1) or (2,2) so ways = 5
//For N = 5 , number of ways -> (1,1,1,1,1) or (1,2,1,1) or (1,2,2) or (2,1,1,1) or (2,2,1) or
//(2,1,2) or (1,1,2,1) or (1,1,1,2) so ways = 8
//Recurrence Relation looks like -> ways(N) = ways(N-1) + ways(N-2)
//Reason for above recurrence -> if we climb to Nth stair we can take 1 jump from either (N-1)th stair
//or we can take 2 jump from (N-2)th stair
//TC -> O(N)
//SC -> O(N)
package com.dynamicproblem;

import java.util.Arrays;

public class Stairs {
    static int N = 5;//Number of stairs in staircase
    static int[] arr = new int[N+1];

    public static void main(String[] args) {
        Arrays.fill(arr, -1);
        System.out.println(findWaysofClimbingStairs(N));
    }
    public static int findWaysofClimbingStairs(int N){
        if(N <= 1)
            return 1;
        if(arr[N] != -1)
            return arr[N];
        int ans = findWaysofClimbingStairs(N-1) + findWaysofClimbingStairs(N-2);
        arr[N] = ans;
        return ans;
    }
}
