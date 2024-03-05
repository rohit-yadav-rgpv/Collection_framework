package datastructure;

import java.util.WeakHashMap;

public class WeakHashMapExample {
		public static void main(String[] args) {
			WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<String, Integer>();
			weakHashMap.put("One", 1);
			weakHashMap.put("Two", 2);
			weakHashMap.put("Three", 3);
			
			System.out.println(weakHashMap);
			
			String four = new String("4");
			Integer fourValue = 32;
			
			weakHashMap.put(four, fourValue);
			System.out.println(weakHashMap);
			
			four = null;
			
			System.gc();
			System.out.println(weakHashMap);
		}
}
