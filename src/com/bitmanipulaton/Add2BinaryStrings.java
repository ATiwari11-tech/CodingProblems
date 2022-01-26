//Given two binary strings, return their sum (also a binary string).
package com.bitmanipulaton;

public class Add2BinaryStrings {

	public static void main(String[] args) {
		String A="1110000000010110111010100100111";
		String B="101001";
		int i=A.length()-1;
		int j=B.length()-1;
		int sum=0;
		int carry=0;
		StringBuilder sb=new StringBuilder();
		while(i>=0 || j>=0)
		{
			sum=0;
			if(i>=0 && j>=0)
			{
				sum+=A.charAt(i)-'0';
				sum+=B.charAt(j)-'0';
				sum+=carry;
				carry=sum/2;
				sum=sum%2;
			}
			else if(i>=0)
			{
				sum+=A.charAt(i)-'0';
				sum+=carry;
				carry=sum/2;
				sum=sum%2;
			}
			else
			{
				sum+=B.charAt(j)-'0';
				sum+=carry;
				carry=sum/2;
				sum=sum%2;
			}
			//carry=sum/2;
			sb.append(sum);
			i--;
			j--;
		}
		if(carry!=0)
			sb.append(carry);
			
	System.out.println(sb.reverse());
	}

}
