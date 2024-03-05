package datastructure;

import java.util.ArrayDeque;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingQueue {
	
	private static void reverseQueue(Queue<Integer> quque) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		while(!quque.isEmpty()) {
			stack.push(quque.remove());
		}
		while(!stack.isEmpty()) {
			quque.add(stack.pop());
		}
	}
		public static void main(String[] args) {
			Queue<Integer> pq = new ArrayDeque<Integer>();
			pq.add(10);
			pq.add(20);
			pq.add(30);
			pq.add(40);
			pq.add(50);
			
			System.out.println(pq);
			
			reverseQueue(pq);
			
			System.out.println(pq);
		}
}
