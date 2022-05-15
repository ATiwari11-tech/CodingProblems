package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class MapOfMap {

	public static void main(String[] args) {
		HashMap<String,String> m1 = new HashMap<String,String>();
		Map<String, HashMap<String, String>> m2 = new HashMap<String,HashMap<String,String>>();
		m1.put("Name", "Abhishek");
		m1.put("Phone", "123");
		m1.put("Email", "a.t@yopmail.com");
		m2.put("1", m1);
		System.out.println(m2.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList()));
		
		//m2.forEach((key,value) -> {System.out.println(key);System.out.println(value);});;
	}

}
