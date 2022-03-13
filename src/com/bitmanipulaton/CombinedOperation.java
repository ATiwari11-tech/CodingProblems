/*Richard Hendricks, a mastermind on compression algorithms, in an employee of Hooli in the Silicon Valley.
One day, he finally decided to quit and work on his new idea of middle - out algorithm.

He needed to work at the bit - level to compress data. He, eventually, encountered this problem.
There was an array A of N integers. He had to perform certain operations on the elements.
In any one operation, two indices i and j (i < j) are chosen, and A[i] is replaced with A[i] & A[j],
and A[j] is replaced with A[i] | A[j], where & represents the Bitwise AND operation and | represents the Bitwise OR operation.
This operation is performed over all the pairs of integers in the array.

Help Richard find the Bitwise XOR of all the elements after performing the operations.*/
package com.bitmanipulaton;

public class CombinedOperation {

	public static void main(String[] args) {
		//int a[]= {1,3,5};
		int a[]= {21,9,25,16,10,31,15,30,30};
		int n=a.length;
		int b[]=new int[a.length];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				b[i]=a[i]&a[j];
				b[j]=a[i]|a[j];
				a[i]=b[i];
				a[j]=b[j];
			}
		}
		int num=b[0];
		for(int i=1;i<n;i++)
		{
			num^=b[i];
		}
		System.out.println("Number="+num);
	}
}
