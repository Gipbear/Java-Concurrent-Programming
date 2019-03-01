package test;

import java.util.concurrent.LinkedBlockingQueue;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue queue = new LinkedBlockingQueue(3);
		System.out.println(queue.add("abc"));
		System.out.println(queue.add("abc"));
		System.out.println(queue.add("abc"));
		System.out.println(queue.add("abc"));
		System.out.println(queue.size());
	}
}
