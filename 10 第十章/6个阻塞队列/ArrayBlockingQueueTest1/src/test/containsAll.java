package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class containsAll {
	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		queue.add("myString1");
		queue.add("myString2");
		queue.add("myString3");

		List list1 = new ArrayList();
		list1.add("myString1");
		list1.add("myString3");

		List list2 = new ArrayList();
		list2.add("myString1");
		list2.add("myStringZ");

		System.out.println(queue.containsAll(list1));
		System.out.println(queue.containsAll(list2));
	}

}
