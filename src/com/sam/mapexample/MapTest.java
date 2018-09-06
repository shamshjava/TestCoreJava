package com.sam.mapexample;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		System.out.println(map.put("sh", "null"));
		
		System.out.println(map.put("sh", "2"));
		System.out.println(map.put("sh", "3"));
		System.out.println(map.get("null"));
	}

}
