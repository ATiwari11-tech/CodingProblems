/*N light bulbs are connected by a wire.

Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.*/
package com.arrayproblems;

public class BulbSwitching {

	public static void main(String[] args) {
		int a[]= {0,1,0,1};
		System.out.println(solve(a));
		}
	public static int solve(int []a)
	{
		int currState=0;
		int switchPressed=0;
		for(int i=0;i<a.length;i++)
		{
			if(switchPressed%2==0)
				currState=a[i];
			else
				currState=1-a[i];
			if(currState==0)
				switchPressed++;
		}
		return switchPressed;
	}

}