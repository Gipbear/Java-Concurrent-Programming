package test;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class iterator {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		queue.add("myString1");
		queue.add("myString2");
		queue.add("myString3");
		queue.add("myString4");

		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
