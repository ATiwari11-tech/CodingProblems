package com.String;

import java.util.ArrayList;

public class ImplementtoLower {

	public static void main(String[] args) {
		ArrayList<Character> A = new ArrayList<Character>();
		A.add('A');A.add('c');A.add('A');A.add('l');A.add('e');
		int n=A.size();
        for(int i=0;i<n;i++)
        {
            if(A.get(i) >= 'A' && A.get(i) <= 'Z')
                A.set(i,(char)((A.get(i))^(1<<5)));
        }
        System.out.println(A);
	}

}
