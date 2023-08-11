//Given N, generate all combinations of binary arrays
//If N=2, then {0,0},{0,1},{1,0},{1,1}
//2^N times it requires for making generate function call
//For every 2^N times to copy array in base condition it needs N time
//TC -> O(2^N*N)
//SC-> O(N)
package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateNBinaryArrays {
    static int n=2;
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        generate(list);
    }
    public static void generate(List<Integer> list){
        List<List<Integer>> ans = new ArrayList<>();
        //Base Case
        if(list.size() == n){;
            ans.add(list);
            System.out.print(ans+",");
            return;
        }
        //Main Logic
        //do
        list.add(0);
        //call
        generate(list);
        //undo
        list.remove(list.size()-1);
        //do
        list.add(1);
        //call
        generate(list);
        //undo
        list.remove(list.size()-1);
    }
}
