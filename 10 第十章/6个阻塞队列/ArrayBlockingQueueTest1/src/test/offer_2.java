package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class offer_2 {

	public static void main(String[] args) {
		try {
			ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
			System.out.println(queue.offer("myString1"));
			System.out.println(queue.offer("myString2"));
			System.out.println(queue.offer("myString3"));
			System.out.println(queue.size());

			System.out.println(System.currentTimeMillis());
			System.out.println(queue.offer("myString4", 5, TimeUnit.SECONDS));
			System.out.println(System.currentTimeMillis());
			System.out.println(queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
