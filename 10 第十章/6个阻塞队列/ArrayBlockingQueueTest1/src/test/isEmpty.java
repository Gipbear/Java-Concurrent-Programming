package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class isEmpty {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		System.out.println(queue.isEmpty());
		queue.add("myString1");
		queue.add("myString2");
		queue.add("myString3");
		queue.add("myString4");
		System.out.println(queue.isEmpty());
	}
}
