package datastructure;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
		public static void main(String[] args) {
			LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
			linkedHashMap.put(1, "One");
			linkedHashMap.put(2, "Two");
			linkedHashMap.put(3, "Three");
			
			System.out.println(linkedHashMap);
			
			
		}
}
