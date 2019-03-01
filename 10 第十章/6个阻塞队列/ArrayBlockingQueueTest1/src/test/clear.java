package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class clear {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		queue.add("myString1");
		queue.add("myString2");
		queue.add("myString3");

		queue.clear();
		System.out.println(queue.size());
		
	}
}
