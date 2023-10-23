//Given N house in straight line.You are a thief
//Each house has some gold in it also it has alarm system
//If you rob house number i then house number i-1 and i+1 will get notified and you can't rob them
//Maximize the amount of gold you can rob
package com.dynamicproblem;

import java.util.Arrays;

public class NHouse {
    static int[] input = {10,20,5,19};
    static int[] arr = new int[input.length+1];
    public static void main(String[] args) {
        Arrays.fill(arr,-1);
        System.out.println(findMaxLoot(input.length-1));
    }
    public static int findMaxLoot(int N){
        if(N == 0)
            return input[0];
        if(N == 1)
            return Math.max(input[0],input[1]);
        if(arr[N] != -1)
            return arr[N];
        int ans = Math.max(findMaxLoot(N-1),input[N] + findMaxLoot(N-2));
        arr[N] = ans;
        return ans;
    }
}
