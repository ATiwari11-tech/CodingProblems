package com.binarysearch;

public class SquareRootOfNumberInDecimal {
    public static void main(String []args){
        double n=4.00;
        double l=1.00,h=n;
        double mid = 0;
        System.out.println("val="+1/Math.pow(10,6));
        while((l-h) > 1/Math.pow(10,6)){
            mid = (l+h)/2;
            if(mid*mid <= n){
                l=mid+1;
            }
            else if(mid*mid > n){
                h=mid-1;
            }
        }
        System.out.println("Square Root Of A Number :"+n+" With Decimal Is:"+l);
    }
}
