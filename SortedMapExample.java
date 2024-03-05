package datastructure;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
		public static void main(String[] args) {
			 SortedMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		        treeMap.put("One", 1);
		        treeMap.put("Two", 2);
		        treeMap.put("Three", 3);	
		        
		
		        System.out.println(treeMap);
		        System.out.println(treeMap.firstKey());
		        System.out.println(treeMap.lastKey());
		        System.out.println(treeMap.remove("One"));
		}
}
