package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnsureCapacityList {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("1");
        list.add("2");
        System.out.println(list.size());
        list.ensureCapacity(3);
        System.out.println(list.size());
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list.size());
//        List<Integer> ip = new ArrayList<>();
//        ip.add(1);
//        ip.add(1);
//        ip.add(3);
//        ip.add(5);
//        ip.add(1);
//        System.out.println(checkList(ip));
    }
    public static int checkList(List<Integer> ip){
        List<Integer> alt = new ArrayList<>();
        for(int item:ip){
            alt.add(item);
        }
        Collections.sort(ip);
        int count = 0;
        for(int i=0;i<ip.size();i++){
            if(ip.get(i) != alt.get(i))
                count++;
        }
        return count;
    }
}
