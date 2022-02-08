package com.arrayproblems;

import java.util.ArrayList;

public class AlterNateSubArrays {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0 };
		int B = 2;
		int k = 2 * B + 1;
		/*int a[] = {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1 };
		int B = 1;
		int k = 2 * B + 1;*/
		/*int a[] = {1,0,1,0,1};
		int B = 1;
		int k = 2 * B + 1;*/
		/*int a[] = {0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
		int B = 2;
		int k = 2 * B + 1;*/
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		
		for (int i = 0; i < a.length; i++)
			A.add(a[i]);
		
		int n = A.size();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		if(B==0)
		{
			for (int i = 0; i < a.length; i++)
				resultList.add(i);
		}
		//System.out.println(resultList);
		int j = 0;
		boolean isleftIntact=false;
		boolean isRightIntact=false;
		while (k <= n) {
			for (int i = j; i < B; i++)
			{
				if(A.get(i)-A.get(i+1)!=0)
					isleftIntact=true;
				else
				{
					isleftIntact=false;
					break;
				}
			}
			System.out.println("Is Left Intact:"+isleftIntact);
			for (int i = B; i < k-1; i++)
			{
				if(A.get(i)-A.get(i+1)!=0)
					isRightIntact=true;
				else
				{
					isRightIntact=false;
					break;
				}
			}
			System.out.println("Is Left Intact:"+isRightIntact);
			if (isleftIntact && isRightIntact)
			{
				resultList.add(B);
			}
			
			
			B++;
			k++;
			j++;
		}
		System.out.println(resultList);
	}

}
