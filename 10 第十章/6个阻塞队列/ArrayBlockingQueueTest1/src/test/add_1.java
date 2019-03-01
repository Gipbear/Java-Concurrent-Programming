package test;

import java.util.concurrent.ArrayBlockingQueue;

public class add_1 {
	public static void main(String[] args) {
		// put有阻塞效果，队列满时阻塞
		// add没有阻塞效果，队列满时报异常
		ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
		System.out.println(queue.add("myString1"));
		System.out.println(queue.add("myString2"));
		System.out.println(queue.size());
	}
}
