package com.dynamicproblem;
//TC -> O(N)
//SC -> O(1) - as we are using only 2 variables
public class StairsIterative {
    static int N = 4;//Number of stairs in staircase
    static int[] arr = new int[N+1];
    static int z;
    static int x = 1, y= 2;//For 1st stair(x) and 2nd stair(y) ways of reaching that stair

    public static void main(String[] args) {
        for(int i=3;i<=N;i++){
            z = x+y;
            x = y;
            y = z;
        }
        System.out.println(z);
    }
}
