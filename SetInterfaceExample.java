package datastructure;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceExample {
		public static void main(String[] args) {
			Set<String> set = new HashSet<String>();
			set.add("One");
			set.add("Two");
			set.add("Three");

			boolean containsTwo = set.contains("Two"); 
			System.out.println(containsTwo);

            for (String element : set) {
              System.out.println(element);
            }
			
		}
}
