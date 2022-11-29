package com.mentorproblems;

import java.util.Optional;

public class MedianOfTwoSortedArray2 {

	public static void main(String[] args) {
//		int arr1[]= {1};
//		int arr2[]= {2,8,9};
		int arr1[]= {3,8,9,10};
		int arr2[]= {12,14,15,17,20};
		int total = arr1.length+arr2.length;
		int mid=0;
		int l = 0;
		int h = arr1.length;
		while(l<=h){
			mid = (l+h)/2;
			int al = mid;
			int bl = (total+1)/2-mid;//total+1 becuase I want to keep more elements in the left side
			int alm1 = al == 0 ? Integer.MIN_VALUE:arr1[al-1];
			int blm1 = bl == 0 ? Integer.MIN_VALUE:arr2[bl-1];
			int alp1 = al == arr1.length ? Integer.MAX_VALUE:arr1[al];
			int blp1 = bl == arr2.length ? Integer.MAX_VALUE:arr2[bl];
			if(alm1 <= blp1 && blm1 <= alp1){
				if(total % 2 == 0){
					int lmax = Math.max(alm1,blm1);
					int rmin = Math.min(alp1,blp1);
					int median = (lmax+rmin) / 2;
					System.out.println("Median for Even:"+median);
					break;
				}
				else{
					int median = Math.max(alm1,blm1);
					System.out.println("Median for Odd:"+median);
					break;
				}
			}
			else if(alm1 > blp1){
				h = mid-1;
			}
			else if(blm1 > alp1){
				l = mid+1;
			}
		}
	}
}
