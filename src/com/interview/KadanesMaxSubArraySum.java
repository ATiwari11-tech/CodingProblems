package com.interview;

public class KadanesMaxSubArraySum {

	public static void main(String[] args) {
		int a[]= {-1,1,1,-1,1,1,-1,-1,1,-1,1};
		int sum=a[0];
		int osum=sum;
		for(int i=0;i<a.length;i++)
		{
			if(sum < 0)
			{
				sum=0;
			}
			else
			{
				sum+=a[i];
				osum=Math.max(sum, osum);
			}
		}
		System.out.println("Maximum Sum Subarray="+osum);
	}

}
