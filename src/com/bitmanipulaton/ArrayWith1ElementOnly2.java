package com.bitmanipulaton;

import java.util.ArrayList;

public class ArrayWith1ElementOnly2 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> setArray = new ArrayList<Integer>();
		ArrayList<Integer> unsetArray = new ArrayList<Integer>();
		ArrayList<Integer> finalArray = new ArrayList<Integer>();
		A.add(1);A.add(2);A.add(3);A.add(1);A.add(2);A.add(4);
	    int n=A.size();
	    int ans=0;
	    int ans1=0;
	    int ans2=0;
	    for(int i=0;i<n;i++)
	    {
	    	ans^=A.get(i);
	    }
	    int i=0;
	    while((1<<i) < ans)
	    {
	    	if(((1<<i)&(ans))!= 0)
				break;
			else
				i++;
	    }
	    for(int k=0;k<n;k++)
	    {
	    	if(((1<<i)&(A.get(k)))!= 0)
	    	{
	    		setArray.add(A.get(k));
	    	}
	    	else
	    		unsetArray.add(A.get(k));
	    }
	    System.out.println(setArray);
	    System.out.println(unsetArray);
	    for(int k=0;k<setArray.size();k++)
	    {
	    	ans1^=setArray.get(k);
	    }
	    for(int k=0;k<unsetArray.size();k++)
	    {
	    	ans2^=unsetArray.get(k);
	    }
	    if(ans1<ans2)
	    {
	    	finalArray.add(ans1);
	    	finalArray.add(ans2);
	    }
	    else
	    {
	    	finalArray.add(ans2);
	    	finalArray.add(ans1);
	    }
	    System.out.println(finalArray);
	    
	}

}
