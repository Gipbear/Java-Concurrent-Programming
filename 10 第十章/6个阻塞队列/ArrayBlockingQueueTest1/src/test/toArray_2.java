package test;

import java.util.concurrent.ArrayBlockingQueue;

public class toArray_2 {

	public static void main(String[] args) {

		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);
		System.out.println(queue.add(1));
		System.out.println(queue.add(2));
		System.out.println(queue.add(3));
		System.out.println(queue.add(4));

		Integer[] integerArray = new Integer[0];

		integerArray = queue.toArray(integerArray);
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i] + 100);
		}

	}
}
