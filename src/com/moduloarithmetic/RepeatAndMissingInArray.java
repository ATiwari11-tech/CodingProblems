package com.moduloarithmetic;

import java.util.ArrayList;
import java.util.Collections;

public class RepeatAndMissingInArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(3);
		A.add(4);
		int n = A.size();
		ArrayList<Integer> result = new ArrayList<Integer>();
		long sumn = ((long)n*(long)(n+1))/2;
		long orgsumn = 0;
		for(int i=0;i<n;i++)
		{
			orgsumn+=A.get(i);
		}
		int xminusy = (int) Math.abs(sumn-orgsumn);
		long sumsqauren = ((sumn)*(long)(2*n+1))/3;
		long orgsumsquaren =0;
		for(int i=0;i<n;i++)
		{
			orgsumsquaren +=(long)(Math.pow(A.get(i), 2));
		}
		int xplusy = (int)(Math.abs(sumsqauren-orgsumsquaren))/xminusy;
		int r = (xminusy+xplusy)/2;
		int m = (Math.abs(xminusy-xplusy))/2;
		result.add(r);
		result.add(m);
		System.out.println(result);
		
		
	}

}
