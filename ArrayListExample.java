package datastructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);

		num.set(1, 5);
		
		for (int i = 0; i < num.size(); i++) {
		    System.out.println(num.get(i));
		}
		
		num.remove(1);
		
		for (int i = 0; i < num.size(); i++) {
		    System.out.println(num.get(i));
		}
		
		
		
	}
}
