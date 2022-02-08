package com.String;

public class WordSentence {

	public static void main(String[] args) {
		String s = "I am here";
		String result="";
		String endStr="";
		while(s.length()>0 && s.length()!= 1)
		{
			endStr = s.substring(s.lastIndexOf(" ")+1);
			result+=endStr+" ";
			s = s.replace(endStr," ").trim();
		}
		if(s.length()==1)
		result+=s;
		System.out.println(result);
	}

}
