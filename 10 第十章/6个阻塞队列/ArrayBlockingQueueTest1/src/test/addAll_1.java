package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class addAll_1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");

		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		queue.add("myString1");
		queue.add("myString2");
		queue.add("myString3");

		System.out.println(queue.addAll(list));
		System.out.println(queue.size());
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
