package test;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class remove_3 {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(4);
		System.out.println(queue.remove());

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
