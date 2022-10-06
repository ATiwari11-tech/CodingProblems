package com.binarysearch;

import java.util.HashMap;
import java.util.Map;

//Given a String S and S is {a,b,c}
//Find the min length of a SubArray such that it contains all of a,b and c
public class MinKlengthWithAllStrings {
    public static void main(String args[]){
        String s = "aababbccbba";
        int ans=-1;
        int len = s.length();
        int l=3,h=len;
        while(l<=h){
            int mid = (l+h)/2;
            if(checkSubString(s,mid)){
                ans = mid;
                h=mid-1;
            }
            else
                l=mid+1;
        }
        System.out.println("Answer is:"+ans);
    }
    public static boolean checkSubString(String str,int k){
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<k;i++){
            if(map.containsKey(str.charAt(i)+""))
                map.put(str.charAt(i)+"",map.get(str.charAt(i)+"")+1);
            else
                map.put(str.charAt(i)+"",1);
        }
        if(map.size() >= 3){
            if(map.containsKey("a") && map.containsKey("b") && map.containsKey("c"))
                return true;
        }
        for(int i=k;i<str.length();i++){
            String s1 = str.charAt(i-k)+"";
            String s2 = str.charAt(i)+"";
            if(map.containsKey(s1))
                map.put(s1,map.get(s1)-1);
            if(map.containsKey(s2))
                map.put(s2,map.get(s2)+1);
            else
                map.put(s2,1);
            if(map.get(s1) == 0)
                map.remove(s1);
            if(map.size() >= 3){
                if(map.containsKey("a") && map.containsKey("b") && map.containsKey("c"))
                    return true;
            }
        }
        return false;
    }
}
