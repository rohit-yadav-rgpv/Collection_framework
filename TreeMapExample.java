package datastructure;


import java.util.TreeMap;

public class TreeMapExample {
		public static void main(String[] args) {
			 TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		        treeMap.put("One", 1);
		        treeMap.put("Two", 2);
		        treeMap.put("Three", 3);	
		        
		        treeMap.putIfAbsent("Three", 3);
		        treeMap.putIfAbsent("Four", 4);
		        
		        System.gc();
		
		        System.out.println(treeMap);
		        System.out.println(treeMap.keySet());
		        System.out.println(treeMap.values());
		        System.out.println(treeMap.entrySet());
		        System.out.println(treeMap.pollLastEntry());
		        
		        System.out.println(treeMap.remove("One"));
		}
}
