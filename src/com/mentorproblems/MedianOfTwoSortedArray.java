package com.mentorproblems;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		int arr1[]= {1};
		int arr2[]= {2,8,9};
		int total = arr1.length+arr2.length;
		int l = 0;
		int h = arr1.length;
		while(l<=h)
		{
			int aleft = (l+h)/2;//First Part of First Array
			int bleft = (total+1)/2-aleft;//Second Part of First Array
			int aleftval = aleft==arr1.length?Integer.MAX_VALUE:arr1[aleft];
			int aleftminus1val = aleft==0?Integer.MIN_VALUE:arr1[aleft-1];
			int bleftval = bleft==arr2.length?Integer.MAX_VALUE:arr2[bleft];
			int bleftminus1val = bleft==0?Integer.MIN_VALUE:arr2[bleft-1];
			if(aleftminus1val <= bleftval && bleftminus1val <= aleftval)//Check if last value of first part of first array is less than equal to first value of second part of second array also if last value of second part of first array is less than equal to first value of first part of second array also
			{
				if(total%2==0)
				{
					int aleftmax = Math.max(aleftminus1val, bleftminus1val);//get max of left array
					int bleftmin = Math.min(aleftval, bleftval);//get min of second array
					System.out.println("Median is:"+(double)(aleftmax+bleftmin)/2);//if even then get avg of two middle elements
					break;
				}
				else
				{
					int aleftmax = Math.max(aleftminus1val, bleftminus1val);
					System.out.println("Median is:"+aleftmax);//if odd then get maximum of left part array
					break;
				}
			}
			else if(aleftminus1val > bleftval)
			{
				h = aleft-1;//if last value of first part of first array is greater than first value of second part of second array
			}
			else if(bleftminus1val > aleftval)
			{
				l = aleft+1;//if last value of first part of second array is greater than first value of second part of first array
			}
		}
		
		
	}
}
