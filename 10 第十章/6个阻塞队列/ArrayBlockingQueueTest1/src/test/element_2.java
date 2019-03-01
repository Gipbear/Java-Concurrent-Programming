package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class element_2 {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		System.out.println(queue.element());
	}
}
