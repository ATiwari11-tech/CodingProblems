package com.arrayproblems;

public class MedianOfTwoSorterArrays {
    public static void main(String args[]){
        double median = 0.0;
        int a[] = {3,9,12,13,14,19};
        int b[] = {7,17,20,24,26,28,30,32};//3,7,9,12,13,14,17,19,20,24,26,28,30
        int len1 = a.length;
        int len2 = b.length;
        int tlen = len1+len2;
        int l = 0;
        int h = a.length;
        int mid = 0;
        int aleft;
        int bleft;
        int alm1;
        int blm1;
        while(l <= h){
            aleft = (l+h)/2;
            bleft = (tlen+1)/2-aleft;
            if(aleft == 0)
                alm1 = Integer.MIN_VALUE;
            if(aleft == a.length)
                a[aleft] = Integer.MAX_VALUE;
            if(bleft == 0)
                blm1 = Integer.MIN_VALUE;
            if(bleft == b.length)
                b[bleft] = Integer.MAX_VALUE;
            //Valid Segregation Condition
            if(a[aleft-1] <= b[bleft] && b[bleft-1] <= a[aleft]){
                if(tlen % 2 == 0){
                    int max  = Math.max(a[aleft-1],b[bleft-1]);
                    int min = Math.min(a[aleft],b[bleft]);
                    median = (max+min)/2;
                    break;
                }
                else {
                    median = Math.max(a[aleft - 1], b[bleft - 1]);
                    break;
                }
            }
            else if(a[aleft-1] > b[bleft])
                h = aleft-1;
            else
                l = aleft+1;
        }
        System.out.println("Median is:"+median);
    }
}
