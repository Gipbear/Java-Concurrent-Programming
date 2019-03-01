package test;

import java.util.concurrent.ArrayBlockingQueue;

public class poll_1 {

	public static void main(String[] args) {
		// poll:
		// 检索并移除此队列的头，如果此队列为空，则返回 null。
		ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
		System.out.println(queue.poll());
		System.out.println(queue.offer("myString1"));
		System.out.println(queue.offer("myString2"));
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}
}
