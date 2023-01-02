package com.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class OptimizedMergeNewInterval {
    public static void main(String args[]){
        ArrayList<Integer[]> inputList = new ArrayList<Integer[]>();
        ArrayList<Integer[]> resultantList = new ArrayList<Integer[]>();
        inputList.add(new Integer[] { 1, 3 });
        inputList.add(new Integer[] { 4, 6 });
        inputList.add(new Integer[] { 8, 10 });
        inputList.add(new Integer[] { 15, 18 });
        inputList.add(new Integer[] { 16, 17 });

        Integer[] newInterval = new Integer[] { 5, 9 };
        showList(inputList);
        //Main Logic Now
        int n = inputList.size();
        int flag = 0;
        int x = newInterval[0];
        int y = newInterval[1];
        resultantList.add(inputList.get(0));
        for(int i=0;i<n;i++){
            int i1 = inputList.get(i)[0];
            int j1 = inputList.get(i)[1];
            if(!(y < i1 || x > j1)){
                int x1 = Math.min(x,i1);
                int y1 = Math.max(y,j1);
                resultantList.set(resultantList.size()-1,new Integer[]{x1,y1});
            }
            else if(flag == 0) {
                resultantList.add(newInterval);
                flag++;
            }
            else
                resultantList.add(new Integer[]{i1,j1});
            x = resultantList.get(resultantList.size()-1)[0];
            y = resultantList.get(resultantList.size()-1)[1];
        }
        System.out.println("Resultant Array Is:");
        showList(resultantList);
    }
    public static void showList(ArrayList<Integer[]> list){
        for(Integer[] nums:list){
            System.out.print(nums[0]+" "+nums[1]);
            System.out.println();
        }
    }
}
