package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {
		String str="ABCDAD";
		List<String> result = new ArrayList<String>();
		Set<String> resultSet = new HashSet<String>();
		for(int i=0;i<str.length();i++)
		{
			if(resultSet.contains(str.charAt(i)+""))
				result.add(str.charAt(i)+"");
			else
				resultSet.add(str.charAt(i)+"");
		}
		System.out.println("Duplocate Characters are="+result);
	}

}
