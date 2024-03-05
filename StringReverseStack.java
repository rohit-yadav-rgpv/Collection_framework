package datastructure;

import java.util.Stack;

public class StringReverseStack {
	
	private static String reverse(String str) {
		
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		
		
		for(char ch: str.toCharArray()) {
			stack.push(ch);
		}
		
		String Reverse = "";
		while(!stack.empty()) {
			Reverse += stack.pop();
		}
		
		return Reverse;
	}
	public static void main(String[] args) {
		String a = "abc";
		System.out.println(reverse(a));
	}
}
