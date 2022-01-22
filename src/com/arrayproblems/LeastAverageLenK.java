package com.arrayproblems;

public class LeastAverageLenK {

	public static void main(String[] args) {
		//int a[]= {3,7,90,20,10,50,40};//100,117,120,80,100->33,39,40,26,33
		//int a[]= {3,7,5,20,-10,0,12};//10,12,25,10,-10,12->5,6,12,5,-5,6
		//int a[]= {20,3,13,5,10,14,8,5,11,9,1,11};//89,78,76,74->7,6,6,6
		int a[]= {15,7,11,7,9,8,18,1,16,18,6,1,1,4,18};//57,60,54,59,70,67,60,43,46,48->9,10,9,9,11,11,10,7,7,8
		int n=a.length;//15
		//int k=3;
		//int k=2;
		//int k=9;
		int k=6;
		int sum=0;
		int index=0;
		int avg=0;
		int min = 0;
		for(int i=0;i<k;i++)
			sum+=a[i];
		avg=sum/k;
		min = avg;
		index=0;
		for(int i=k;i<=n-1;i++)
		{
			System.out.println("i="+i+" and i-k is"+(i-k));
			sum+=a[i]-a[i-k];
			System.out.println("Sum="+sum);
			avg=sum/k;
			if(avg<min)
			{
				min=avg;
				index=i-k+1;
			}
		}
		System.out.println("Least Average SubArray Of length'"+k+"' is"+avg);
		System.out.println("Starting index of Least Average SubArray Of length'"+k+"' is"+index);

	}

}
