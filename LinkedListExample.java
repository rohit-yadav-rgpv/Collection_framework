package datastructure;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
		public static void main(String[] args) {
			LinkedList<Integer> numbers = new LinkedList<Integer>();
			numbers.add(6);
			numbers.add(3);
			numbers.add(8);

			numbers.set(1, 5); 
			
			
			for (int i = 0; i < numbers.size(); i++) {
			    System.out.println(numbers.get(i));
			}
			
			Collections.sort(numbers); 
			
			for (int i = 0; i < numbers.size(); i++) {
			    System.out.println(numbers.get(i));
			}
		}
}
