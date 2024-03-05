package datastructure;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedHashSetInterface {
		public static void main(String[] args) {
			SortedSet<String> sortedSet = new TreeSet<String>();
			sortedSet.add("One");
			sortedSet.add("Two");
			sortedSet.add("Three");

			for (String element : sortedSet) {
			    System.out.println(element);
			}
			
			System.out.println(sortedSet.first());
			System.out.println(sortedSet.last());
		}
}
