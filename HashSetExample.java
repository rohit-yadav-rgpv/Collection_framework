package datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
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
				
	            Set<String> set1 = new HashSet<String>();
				set1.add("One");
				set1.add("Two");
				set1.add("Three");
				
				
				Set<String> set2 = new HashSet<String>();
				set2.add("One");
				set2.add("Two");
				set2.add("Three");
				set2.add("Nine");
				
				
				set2.removeAll(set1);
				
				System.out.println(set2);
		}	
				
	            
		
}
