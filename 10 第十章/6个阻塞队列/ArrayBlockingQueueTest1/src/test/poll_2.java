package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class poll_2 {

	public static void main(String[] args) {
		try {
			ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
			System.out.println(System.currentTimeMillis());
			System.out.println(queue.poll(5, TimeUnit.SECONDS));
			System.out.println(System.currentTimeMillis());

			System.out.println(queue.offer("myString1"));
			System.out.println(queue.offer("myString2"));
			System.out.println("A begin " + System.currentTimeMillis());
			System.out.println(queue.poll(5, TimeUnit.SECONDS));
			System.out.println("A   end " + System.currentTimeMillis());
			System.out.println(queue.size());
			System.out.println("B begin " + System.currentTimeMillis());
			System.out.println(queue.poll(5, TimeUnit.SECONDS));
			System.out.println("B   end " + System.currentTimeMillis());
			System.out.println(queue.size());
			System.out.println();
			System.out.println(System.currentTimeMillis());
			System.out.println(queue.poll(5, TimeUnit.SECONDS));
			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
