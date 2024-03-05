package datastructure;

import java.util.PriorityQueue;

public class PriorityQueueExample {
		public static void main(String[] args) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			pq.add(6);
			pq.add(5);
			pq.add(8);
			pq.add(4);
			pq.add(6);
			pq.add(7);

			System.out.println(pq.poll()); 
			System.out.println(pq.peek());
			 
			boolean isEmpty = pq.isEmpty();
			System.out.println(isEmpty);
			 
			 for (int i = 0; i < pq.size(); i++) {
				    System.out.println(pq.poll());
				}
		}
}
