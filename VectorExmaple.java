package datastructure;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExmaple {
		public static void main(String[] args) {
			List<Integer> numbers = new Vector<Integer>();
			numbers.add(9);
			numbers.add(7);
			numbers.add(5);

			for (int i = 0; i < numbers.size(); i++) {
			    System.out.println(numbers.get(i));
			}
			
			Collections.sort(numbers); 
			
			for (int i = 0; i < numbers.size(); i++) {
			    System.out.println(numbers.get(i));
			}
		}
}
