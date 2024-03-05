package datastructure;

import java.util.Stack;

public class StackExample {
		public static void main(String[] args) {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(5);
			stack.push(7);
			stack.push(3);

			System.out.println(stack.size());
			
		   System.out.println(stack.pop());

		   System.out.println(stack.peek());
		}
}
