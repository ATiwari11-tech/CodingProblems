package com.interview;

public class SumOfAllSubArrayUsingKadane {

	public static void main(String[] args) {
		int a[]= {-1,1,1,-1,1,1,-1,-1,1,-1,1};
		int sum=a[0];
		int osum=sum;
		int totalsum=0;
		for(int i=0;i<a.length;i++)
		{
			if(sum<0)
			{
				sum=0;
			}
			else
			{
				sum+=a[i];
				osum=Math.max(sum, osum);
			}
		}
		System.out.println("Total SubArray Sum="+totalsum);
	}

}
