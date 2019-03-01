package test;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class remove_1 {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(4);
		System.out.println(queue.add("a"));
		System.out.println(queue.add("b"));
		System.out.println(queue.add("a"));
		System.out.println(queue.add("c"));

		System.out.println(queue.remove("a"));

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
