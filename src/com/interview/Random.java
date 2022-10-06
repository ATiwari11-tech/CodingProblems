package com.interview;

import java.util.HashMap;

public class Random {
	
	public static void main(String[] args) {
		HashMap<String,Integer> maps = new HashMap<String,Integer>();
		maps.put("Apples",3);
		maps.put("Mangoes",2);
		int apples = maps.get("Apples");
		maps.put("Apples", apples+4);
		System.out.println(maps.get("Apples"));
	}

}
