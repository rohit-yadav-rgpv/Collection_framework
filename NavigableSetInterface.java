package datastructure;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {
		public static void main(String[] args) {
			NavigableSet<String> navigableSet = new TreeSet<String>();
			navigableSet.add("One");
			navigableSet.add("Two");
			navigableSet.add("Three");

			String firstElement = navigableSet.first();
			
			System.out.println(firstElement);
			
			for (String element : navigableSet) {
			    System.out.println(element);
			}
			
			navigableSet.remove("Two");
			System.out.println(navigableSet);
		}
}
