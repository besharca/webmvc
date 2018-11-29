package com.lil.demo;

import java.util.TreeMap;

public class TreeMapTest {

		public static void main(String[] args) {
			TreeMap<Integer, String> map = new TreeMap<Integer,String>();
			map.put(1, "a");
			map.put(2, "b");
			map.put(3, "c");
			map.put(4, "d");
			map.put(5, "e");
			map.put(6, "f");
			
			map.forEach((k,v)-> System.out.println(k + v));
			
		}
}
