package datastructure;

import java.util.TreeSet;

public class TreeSetExample {
		public static void main(String[] args) {
			TreeSet<String> treeSet = new TreeSet<String>();
			treeSet.add("One");
			treeSet.add("Two");
			treeSet.add("Three");

			for (String element : treeSet) {
			    System.out.println(element);
			}
			
			treeSet.remove("Two");
			System.out.println(treeSet);
		}
}
