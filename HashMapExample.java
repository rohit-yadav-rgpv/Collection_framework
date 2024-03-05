package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
		public static void main(String[] args) {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "One");
			map.put(2, "Two");
			map.put(3, "Three");

			for (Map.Entry<Integer, String> m : map.entrySet()) {
			    System.out.println("Key: " + m.getKey() + ", Value: " + m.getValue());
			}
			
			System.out.println(map.get(1));
			
			System.out.println(map.keySet());
			
			System.out.println(map.values());
			
			System.out.println(map.entrySet());
		}
}
