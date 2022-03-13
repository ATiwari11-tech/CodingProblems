/*Given a binary string A. It is allowed to do at most one swap between any 0 and 1. 
Find and return the length of the longest consecutive 1’s that can be achieved.
*/
package com.arrayproblems;

public class BinaryStringConsecutive1 {

	public static void main(String[] args) {
		String A="01";
		//String A="011101";
		int n = A.length();
		int ans=0;
		int len=0;
		int totalCount1=0;
		boolean isZeroFound=false;
		for(int i=0;i<n;i++)
		{
			if(A.charAt(i)=='1')
				totalCount1++;
		}
		for(int i=0;i<n;i++)
		{
			if(A.charAt(i)=='0')
			{
				isZeroFound=true;
				//Count no. of consecutive 1 from left side
				int l=0;
				for(int j=i-1;j>=0;j--)
				{
					if(A.charAt(j)=='1')
						l++;
					else
						break;
				}
				//Count no. of consecutive 1 from right side
				int r=0;
				for(int j=i+1;j<n;j++)
				{
					if(A.charAt(j)=='1')
						r++;
					else
						break;
				}
				len=l+r;
				if(len<totalCount1)
					len+=1;
				else
					len=l+r;
				ans=Math.max(ans, len);
			}
		}
		if(isZeroFound)
			System.out.println(ans);
		else
			System.out.println(n);
	}

}
