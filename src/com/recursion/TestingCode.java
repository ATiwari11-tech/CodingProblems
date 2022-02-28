package com.recursion;

public class TestingCode {

	public static void main(String[] args) {
		checkMethod(5,1);
	}
	public static int checkMethod(int num,int state)
	{
		if(state == 3)
			return state;
		checkMethod(num,state+1);
		System.out.println(state);
		checkMethod(num,--state);
		return state;
	}

}
