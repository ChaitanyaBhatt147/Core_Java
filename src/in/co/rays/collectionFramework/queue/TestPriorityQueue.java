package in.co.rays.collectionFramework.queue;

import java.util.PriorityQueue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue que = new PriorityQueue();
		
		que.offer(1);
		que.offer(2);
		que.offer(3);
		que.offer(4);
		que.offer(6);
		que.offer(5);
		que.offer(7);
		que.offer(8);
		
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
	}
}
