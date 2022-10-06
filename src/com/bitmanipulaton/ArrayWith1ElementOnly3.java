package com.bitmanipulaton;

import java.util.ArrayList;

public class ArrayWith1ElementOnly3 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		//A.add(1);A.add(2);A.add(3);A.add(1);A.add(2);A.add(4);
		A.add(880);A.add(1729);
		 int n=A.size();
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        ArrayList<Integer> array1 = new ArrayList<Integer>();
	        ArrayList<Integer> array2 = new ArrayList<Integer>();
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
	            if(((1<<i)&(ans))!=0)
	                break;
	            else
	                i++;
	        }
	        for(int k=0;k<n;k++)
	        {
	            if(((1<<i)&(A.get(k)))!=0)
	                array1.add(A.get(k));
	            else
	                array2.add(A.get(k));
	        }
	        for(int k=0;k<array1.size();k++)
	        {
	            ans1^=array1.get(k);
	        }
	        for(int k=0;k<array2.size();k++)
	        {
	            ans2^=array2.get(k);
	        }
	        if(ans1<ans2)
	        {
	            array.add(ans1);
	            array.add(ans2);
	        }
	        else{
	            array.add(ans2);
	            array.add(ans1);
	        }
System.out.println(array);
	    
	}

}
