//Given an array of N distinct elements. Generate all subsets of it
//Let's say given A={1,2,3} and dynamic array we will maintain is curr
package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubsets {
    static int n=3;
    static List<Integer> A = new ArrayList<>();
    public static void main(String args[]){
        A.add(1);A.add(2);A.add(3);
        List<Integer> list = new ArrayList<>();
        generate(list,0);
    }
    public static void generate(List<Integer> list,int idx){
        List<List<Integer>> ans = new ArrayList<>();
        //Base Case
        if(idx == n){;
            ans.add(list);
            System.out.print(ans+",");
            return;
        }
        //Main Logic
        //call
        generate(list,idx+1);
        //do
        list.add(A.get(idx));
        //call
        generate(list,idx+1);
        //undo
        list.remove(list.size()-1);
    }
}
