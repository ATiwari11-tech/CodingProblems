//Find Nth Fibonacci number
//[0,1,1,2,3,5,8]
//fib(5) => 3
package com.dynamicproblem;

public class Fibbonaci {
    static int[] arr = {-1,-1,-1,-1,-1,-1};
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFib(5));
    }
    public static int findFib(int n){
        int ans;
        if(n <= 2)
            return n-1;
        if(arr[n] != -1)
            return arr[n];
        ans = findFib(n-1)+findFib(n-2);
        arr[n] = ans;
        return ans;
    }
}
