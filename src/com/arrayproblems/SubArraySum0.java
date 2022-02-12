package com.arrayproblems;

public class SubArraySum0 {

	public static void main(String[] args) {
		int a[]= {2,2,1,-3,4,3,1,-2,-3};
		int n=a.length;
		int sum=0;
		boolean issum0=false;
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=a[j];
				if(sum==0)
				{
					issum0=true;
					break;
				}
			}
			if(issum0)
			break;
		}
	System.out.println(issum0);

	}

}
