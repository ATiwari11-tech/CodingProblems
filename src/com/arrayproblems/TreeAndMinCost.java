/*You are given an array A consisting of heights of Christmas trees, and an array B of same size consisting of the cost of each of the 
trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees 
(let's say, indices p, q and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 such trees, so they have the minimum cost and find the minimum cost.

If not possible to choose 3 such trees, return -1*/

package com.arrayproblems;

import java.util.ArrayList;

public class TreeAndMinCost {

	public static void main(String[] args) {
		/*A = [1, 6, 4, 2, 6, 9]
				 B = [2, 5, 7, 3, 2, 7]*/
		int A[]= {1,6,4,2,6,9};
		int B[]= {2,5,7,3,2,7};
		/*int A[]= {2,4,5,4,10};
		int B[]= {40,30,20,10,40};*/
		/*int A[]= {100,101,100};
		int B[]= {2,4,5};*/
		ArrayList<Integer>leftIndexes = new ArrayList<Integer>();
		ArrayList<Integer>rightIndexes = new ArrayList<Integer>();
		int n=A.length;
		int minCost=Integer.MAX_VALUE;
		int sum=0;
		int midIndex=0;
		for(int i=0;i<n;i++)
		{
			//Go to Left of every i and store all min values in arraylist
			for(int j=i-1;j>=0;j--)
			{
				if(A[j]<A[i])
					leftIndexes.add(j);
				midIndex=i;
			}
			//Go to Right of every i and store all max values in arraylist
			for(int j=i+1;j<n;j++)
			{
				if(A[j]>A[i])
					rightIndexes.add(j);
				midIndex=i;
			}
			for(int li=0;li<leftIndexes.size();li++)
			{
				for(int lj=0;lj<rightIndexes.size();lj++)
				{
					sum+=B[leftIndexes.get(li)]+B[midIndex]+B[rightIndexes.get(lj)];
					minCost=Math.min(minCost, sum);
					sum=0;
				}
			}
			leftIndexes.clear();
			rightIndexes.clear();
		}
		if(minCost==Integer.MAX_VALUE)
			System.out.println("Min Cost=-1");
		else
			System.out.println("Min Cost="+minCost);
	}

}
