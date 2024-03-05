package datastructure;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
		public static void main(String[] args) {
			LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
			linkedHashSet.add("One");
			linkedHashSet.add("Two");
			linkedHashSet.add("Three");
			
			for (String element : linkedHashSet) {
			    System.out.println(element);
			}
			
			linkedHashSet.remove("Two");
			
			System.out.println(linkedHashSet);
			
			linkedHashSet.removeAll(linkedHashSet);
			
			
			LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>();
			linkedHashSet1.add(20);
			linkedHashSet1.add(10);
			linkedHashSet1.add(24);
			
			LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<Integer>();
			linkedHashSet2.add(20);
			linkedHashSet2.add(10);
			linkedHashSet2.add(24);
			linkedHashSet2.add(22);
			
			
			//union
			linkedHashSet1.addAll(linkedHashSet2);
			System.out.println(linkedHashSet1);
			
			//intersection
			linkedHashSet1.retainAll(linkedHashSet2);
			System.out.println(linkedHashSet1);
			
			
			//deference
			linkedHashSet2.removeAll(linkedHashSet1);
			System.out.println(linkedHashSet2);
			
		}
}
