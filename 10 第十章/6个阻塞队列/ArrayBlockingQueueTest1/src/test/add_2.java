package test;

import java.util.concurrent.ArrayBlockingQueue;

public class add_2 {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
		System.out.println(queue.add("myString1"));
		System.out.println(queue.add("myString2"));
		System.out.println(queue.add("myString3"));
		System.out.println(queue.add("myString4"));

	}
}
